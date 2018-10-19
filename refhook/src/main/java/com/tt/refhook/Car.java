package com.tt.refhook;

import android.util.Log;

import static android.content.ContentValues.TAG;

public class Car {
    private CarEngineInterface carEngine;
    public Car(){
        this.carEngine=new CarEngine();
    }
    public void showMaxSpeed(){
        Log.d(TAG, "showMaxSpeed: "+carEngine.maxSpeed());
    }
}
