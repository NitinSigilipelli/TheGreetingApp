package com.example.thegreetingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //step1:layout design in xml
    //step2:declare widgets
    Button btn;
    TextView textView;
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        editText=findViewById(R.id.editText);
        //step3:ADDING FUNCTIONALITIES
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editText.getText().toString();
                //Toast
                Toast.makeText(MainActivity.this, "Hello "+name, Toast.LENGTH_LONG).show();
            }
        });

    }
}