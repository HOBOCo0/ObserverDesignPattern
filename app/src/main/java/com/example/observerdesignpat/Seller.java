package com.example.observerdesignpat;

import android.util.Log;

public class Seller implements Observer {
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    public void showLocation() {
        Log.d("Location Display",location);
        System.out.println("Notification at Seller - Current Location: " + location);
    }
}
