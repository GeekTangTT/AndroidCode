package com.ndk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.ndk.jni.NativeFun;


public class MainActivity extends AppCompatActivity {
    private TextView tv_ndk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_ndk=findViewById(R.id.tv_ndk);
        tv_ndk.setText(NativeFun.stringFromJNI());

    }
}
