package com.example.cours2_cycledevieactivites;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("oooooooooooooooo", "SECActivity : onCreate()");
    }

    public void goBackToMainActivity(View v){
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("oooooooooooooooo", "SECActivity : onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("oooooooooooooooo", "SECActivity : onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("oooooooooooooooo", "SECActivity : onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("oooooooooooooooo", "SECActivity : onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("oooooooooooooooo", "SECActivity : onDestroy()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("oooooooooooooooo", "SECActivity : onReStart()");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        Log.d("oooooooooooooooo", "SECActivity : onSaveInstance State()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("oooooooooooooooo", "SECActivity : onRestoreInstanceState()");
    }
}
