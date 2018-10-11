package com.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

public class MyActivity extends Activity implements MyView {
    private TextView mTextView;
    private MyPresenter mMyPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp);

        mTextView=findViewById(R.id.mvp_tv);
        mMyPresenter=new MyPresenter(this);
    }

    @Override
    public void showText(String msg) {
        mTextView.setText(msg);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mMyPresenter.start();
    }
}
