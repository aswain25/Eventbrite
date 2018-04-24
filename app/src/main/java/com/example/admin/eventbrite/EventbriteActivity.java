package com.example.admin.eventbrite;

import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.example.admin.eventbrite.model.EventCollection;
import com.example.admin.eventbrite.model.EventsItem;
import com.google.gson.Gson;

public class EventbriteActivity extends AppCompatActivity
{
    static final String BASE_URL = "https://www.eventbriteapi.com/v3/events/search/?location.latitude=23.06&location.longitude=72.53&location.within=100km&token=ZPUVPF4RUNQVIXDLMR47";

    ListView lvEvents;
    ProgressBar progressBar;
    LinearLayout root;
    ArrayAdapter<String> eventNamesAdapter;
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eventbrite);

        Location location = getIntent().getParcelableExtra("location");


        lvEvents = findViewById(R.id.lvEvents);
        progressBar = findViewById(R.id.progressBar);
        root = findViewById(R.id.root);
        eventNamesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        lvEvents.setAdapter(eventNamesAdapter);

        handler = new Handler(Looper.getMainLooper()) {
            @Override
            public void handleMessage(Message inputMessage) {
                onHandle(inputMessage.getData().getString("content"));
            }
        };
        new NativeClient(BASE_URL, handler).start();
    }

    public void onHandle(String content)
    {
        Gson gson = new Gson();
        EventCollection events = gson.fromJson(content, EventCollection.class);
        for (EventsItem item : events.getEvents())
            eventNamesAdapter.add(item.getName().getText());
        root.removeView(progressBar);
        eventNamesAdapter.notifyDataSetChanged();
    }

    String getUrl(Location location)
    {
        return "https://www.eventbriteapi.com/v3/events/search/?location.latitude=" + location.getLatitude() + "&location.longitude=" + location.getLongitude() + "&location.within=100km&token=ZPUVPF4RUNQVIXDLMR47";
    }
}
