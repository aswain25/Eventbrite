package com.example.admin.eventbrite;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.util.Log;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.tasks.OnSuccessListener;

public class LocationManager
{
    static final String TAG = LocationManager.class.getSimpleName();

    FusedLocationProviderClient locationProviderClient;
    LocationCallback mLocationCallback;
    Context context;
    private Location location;

    public LocationManager(Context context)
    {
        this.context = context;
    }

    public Location getCurrentLocation()
    {
        return location;
    }

    private void setLocation(Location location) {
        this.location = location;
    }

    @SuppressLint("MissingPermission")
    public void getLocation()
    {
        locationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        locationProviderClient.getLastLocation().addOnSuccessListener(new OnSuccessListener<Location>()
        {
            @Override
            public void onSuccess(Location location)
            {
                Log.d(TAG, "onSuccess: " + location.toString());
                setLocation(location);
            }
        });
    }

    @SuppressLint("MissingPermission")
    public void startLocationUpdates()
    {
        final LocationRequest locationRequest = new LocationRequest();
        locationRequest.setInterval(1000);
        locationRequest.setFastestInterval(100);
        locationRequest.setPriority(LocationRequest.PRIORITY_HIGH_ACCURACY);

        mLocationCallback = new LocationCallback(){
            @Override
            public void onLocationResult(LocationResult locationResult) {
                if (locationRequest == null)
                {
                    Log.d(TAG, "onLocationResult: is null");
                    return;
                }
                for (Location location : locationResult.getLocations())
                {
                    Log.d(TAG, "onLocationResult: " + location.toString());
                }
            }
        };

        locationProviderClient.requestLocationUpdates(locationRequest, mLocationCallback, Looper.getMainLooper());
    }

    public void soptLocationUpdates()
    {
        locationProviderClient.removeLocationUpdates(mLocationCallback);
    }
}
