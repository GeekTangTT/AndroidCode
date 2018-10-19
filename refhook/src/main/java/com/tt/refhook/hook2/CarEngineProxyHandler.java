package com.tt.refhook.hook2;

import android.util.Log;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarEngineProxyHandler implements InvocationHandler {
    private Object object;
    public CarEngineProxyHandler(Object object){
        this.object=object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("maxSpeed".equals(method.getName())){
            Log.d("CarEngineProxyHandler", "invoke: 动态代理拦截maxSpeed方法，返回速度180");
            return 180;
        }
        return method.invoke(object,args);
    }
}
