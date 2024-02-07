package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView txtView=findViewById(R.id.txtView);
        txtView.setText("Hi MJ");

        Calculator cal=new Calculator();
        String r=" "+ cal.add(3,5);
        txtView.setText(r);
    }
}