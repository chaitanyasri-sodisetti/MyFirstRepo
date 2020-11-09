package com.example.userregistrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.TextView;

import com.example.userregistrationform.databinding.ActivityMainBinding;

public class FormSubmission extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_submission);
        tv=findViewById(R.id.submit_area);
        tv.setText("NAME:"+getIntent().getStringExtra("name")+"\n\n\n\n\n " +
                "RollNumber:"+getIntent().getStringExtra("roll")+"\n\n\n\n\n " +
                "Email:"+getIntent().getStringExtra("email")+"\n\n\n\n\n"+
                "PhoneNumber:"+getIntent().getStringExtra("phone")+"\n\n\n\n\n"+
                "Gender:"+getIntent().getStringExtra("gender")+"\n\n\n\n\n"+
                "Branch:"+getIntent().getStringExtra("branch")+"\n\n\n\n\n");


    }
}