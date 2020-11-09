package com.example.userregistrationform;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.userregistrationform.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    String gender;
    String name,branch,email,phone,rollNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);


        binding.submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name=binding.uName.getText().toString();
                branch=binding.branch.getSelectedItem().toString();
                email=binding.uEmail.getText().toString();
                phone=binding.uContact.getText().toString();
                rollNumber=binding.uRoll.getText().toString();

               if(name.length()==0||branch.length()==0||email.length()==0||phone.length()==0||rollNumber.length()==0||binding.radioGroup.getCheckedRadioButtonId()==-1)
               {
                   Toast.makeText(MainActivity.this, "You have missed filling some Fields", Toast.LENGTH_SHORT).show();
               }else{

                   if(binding.male.isChecked()){
                       gender="Male";
                   }
                   if(binding.female.isChecked()){
                       gender="female";
                   }
                    Intent i=new Intent(MainActivity.this,FormSubmission.class);
                    i.putExtra("name",name);
                   i.putExtra("roll",rollNumber);
                   i.putExtra("phone",phone);
                   i.putExtra("email",email);
                    i.putExtra("branch",branch);
                    i.putExtra("gender",gender);
                    startActivity(i);

               }




//                binding.resultText.setText(binding.uName.getText().toString()+"\n"
//                        +binding.uEmail.getText().toString()+
//                        "\n"+binding.uContact.getText().toString()+"\n"+
//                        binding.branch.getSelectedItem().toString()+"\n"
//                +gender+"\n"+lang);
            }
        });
    }
}