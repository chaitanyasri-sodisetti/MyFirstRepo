package com.example.activity_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView.append("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        textView.append("onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        textView.append("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        textView.append("onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        textView.append("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        textView.append("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        textView.append("onDestroy()");
    }
}