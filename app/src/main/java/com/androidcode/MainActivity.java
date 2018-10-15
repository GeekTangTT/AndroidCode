package com.androidcode;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

        private Button button1,button2,button3;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            button1=findViewById(R.id.button1);
            button2=findViewById(R.id.button2);
            button3=findViewById(R.id.button3);

            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.button1:
                    Intent intent1=new Intent();
                    intent1.setComponent(new ComponentName("com.tgp.autologin",
                            "com.tgp.autologin.SplashActivity"));
                    startActivity(intent1);
                    break;
                case R.id.button2:
                    Intent intent2=new Intent();
                    intent2.setClassName("com.tgp.autologin",
                            "com.tgp.autologin.SplashActivity");
                    startActivity(intent2);
                    break;
                case R.id.button3:
                    Intent intent3=new Intent();
                    intent3.setComponent(new ComponentName("com.tencent.tmgp.sgame",
                    "com.tencent.tmgp.sgame.SGameActivity"));
                    startActivity(intent3);
                    break;
            }
        }

}
