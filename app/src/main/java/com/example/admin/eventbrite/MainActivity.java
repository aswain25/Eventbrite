package com.example.admin.eventbrite;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity  implements PermissionManager.IPermissionManager{

    public static final String TAG = MainActivity.class.getSimpleName();
    PermissionManager permissionManager;
    LocationManager locationManager;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        permissionManager = new PermissionManager(this);
        locationManager = new LocationManager(this);

        permissionManager.checkPermission();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults)
    {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        permissionManager.checkResult(requestCode, permissions, grantResults);
    }


    @Override
    public void onPermissionResult(boolean isGranted)
    {
        if (isGranted)
        {
            locationManager.getLocation();

            Intent intent = new Intent(getApplicationContext(), EventbriteActivity.class);
            intent.putExtra("location", locationManager.getCurrentLocation());
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        locationManager.startLocationUpdates();
    }

    @Override
    protected void onStop() {
        super.onStop();
        locationManager.soptLocationUpdates();
    }

}
