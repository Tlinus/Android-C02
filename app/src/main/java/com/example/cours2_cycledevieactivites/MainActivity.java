package com.example.cours2_cycledevieactivites;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("oooooooooooooooo", "MainActivity : onCreate()");
    }

    public void launchSecondActivity(View source){
        Intent intentSecondActivity =  new Intent(this, Main2Activity.class);
        startActivity(intentSecondActivity);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("oooooooooooooooo", "MainActivity : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("oooooooooooooooo", "MainActivity : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("oooooooooooooooo", "MainActivity : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("oooooooooooooooo", "MainActivity : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("oooooooooooooooo", "MainActivity : onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("oooooooooooooooo", "MainActivity : onReStart()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("oooooooooooooooo", "MainActivity : onSaveInstance State()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("oooooooooooooooo", "MainActivity : onRestoreInstanceState()");
    }

}
