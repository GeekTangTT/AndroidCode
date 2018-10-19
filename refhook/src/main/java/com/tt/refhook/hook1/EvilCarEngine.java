package com.tt.refhook.hook1;

import com.tt.refhook.CarEngine;
import com.tt.refhook.CarEngineInterface;

public class EvilCarEngine extends CarEngine{
    private CarEngineInterface base;
    public EvilCarEngine(CarEngineInterface base){
        this.base=base;
    }
    public int maxSpeed(){
        return 3*base.maxSpeed();
    }
}
