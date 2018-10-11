package com.mvp;

public class MyPresenter implements BasePresenter{
    private MyView mMyView;
    public MyPresenter(MyView myView){
        this.mMyView=myView;
    }
    @Override
    public void start() {
        //查询获取数据
        String s="this is a simple mvp";
        mMyView.showText(s);
    }

}
