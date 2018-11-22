package com.abc.phongnguyen.duan_qlcafe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    Button btnthoat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnthoat = (Button) findViewById(R.id.btnthoat);
        btnthoat.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    public void login2(View view) {
        Intent intent = new Intent(MainActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    public void intro(View view) {
        Intent intent = new Intent(MainActivity.this, IntroActivity.class);
        startActivity(intent);
    }

}

