package com.example.zhoubo30110.myapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testCrash();
    }

    private void testCrash() {
        List<String> list = Arrays.asList("1","2");
        list.get(2);
    }
}
