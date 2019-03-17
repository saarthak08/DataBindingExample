package com.example.databindingexample;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.databindingexample.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //private TextView nameText;
    //private TextView emailText;
    private ActivityMainBinding activityMainBinding;
    private ActivityMainClickHandlers handlers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //nameText=findViewById(R.id.tvStudentName);
        //emailText=findViewById(R.id.tvStudentEmail);

        //nameText.setText(getCurrentStudent().getStudentName());
        //emailText.setText(getCurrentStudent().getStudentEmail());
        activityMainBinding= DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);
        activityMainBinding.setStudent(getCurrentStudent());
        handlers=new ActivityMainClickHandlers(MainActivity.this);
        activityMainBinding.setClickhandlers(handlers);


    }

    private Student getCurrentStudent(){

        Student student = new Student();
        student.setStudentName("Alex");
        student.setStudentEmail("alex@gmail.com");
        return student;

    }
    public class ActivityMainClickHandlers{
        Context context;
        public ActivityMainClickHandlers(Context context)
        {
            this.context=context;
        }

        public void onEnrollButtonClicked(View view)
        {
            Toast.makeText(context,"Enroll Button Clicked",Toast.LENGTH_SHORT).show();
        }
        public void onCancelButtonClicked(View view)
        {
            Toast.makeText(context,"Cancel Button Clicked",Toast.LENGTH_SHORT).show();
        }
        public void onButton3Clicked(View view)
        {
            startActivity(new Intent(MainActivity.this,IncludeLayoutActivity.class));
        }

    }
}

