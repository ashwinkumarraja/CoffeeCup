package com.bolt.appdev.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Converter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }
    public void Convert(View view){
        EditText Cel= findViewById(R.id.editText4);
        String str= Cel.getText().toString();
        float i= Float.parseFloat(str);
        TextView Rel = findViewById(R.id.textView11);
        float j=Float.parseFloat(str);
        j= ((i*9)/5)+32;
        String str2 =Float.toString(j);
        Rel.setText(str2);

    }
}
