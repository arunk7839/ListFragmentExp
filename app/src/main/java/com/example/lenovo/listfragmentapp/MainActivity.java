package com.example.lenovo.listfragmentapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fragment1 fragment1 = new Fragment1();
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout, fragment1).commit();
    }

}
