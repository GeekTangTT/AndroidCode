package com.tt.refhook;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tt.refhook.hook1.EvilCarEngine;
import com.tt.refhook.hook2.CarEngineProxyHandler;

import java.lang.reflect.Field;
import java.lang.reflect.Proxy;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car=new Car();
        //替换前
        car.showMaxSpeed();
        //方法1------------------------------------
        try {
            Field carEngineField=Car.class.getDeclaredField("carEngine");
            carEngineField.setAccessible(true);
            CarEngine carEngine= (CarEngine) carEngineField.get(car);
            //替换1
            carEngineField.set(car,new EvilCarEngine(carEngine));
            Log.d("MainActivity", "替换1:");
            car.showMaxSpeed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //方法2---------------------------------------
        try {
            Field carEngineFiled=Car.class.getDeclaredField("carEngine");
            carEngineFiled.setAccessible(true);
            CarEngine carEngine= (CarEngine) carEngineFiled.get(car);
            //替换2
            CarEngineInterface carEngineProxy= (CarEngineInterface) Proxy.newProxyInstance(CarEngine.class.getClassLoader(),new Class[]{CarEngineInterface.class},new CarEngineProxyHandler(carEngine));

            carEngineFiled.set(car,carEngineProxy);
            Log.d("MainActivity", "替换2:");
            car.showMaxSpeed();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
