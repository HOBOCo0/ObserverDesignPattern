package com.example.observerdesignpat;

import android.util.Log;

public class DeliveryWarehouseCenter implements Observer {
    private String location;

    @Override
    public void update(String location) {
        this.location = location;
        showLocation();
    }

    public void showLocation() {
        Log.d("Location Display",location);
        System.out.println("Notification at Warehouse - Current Location: " + location);
    }
}
