package com.android.projects.stonedcoder.activitylifecycleexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    public static final String  TAG = "MAIN_ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG , "ON start activated");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG , "onStop activated");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG , "onDestroy activated");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Log.i(TAG , "onPostResume activated");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG , "onRestart activated");
    }
}

