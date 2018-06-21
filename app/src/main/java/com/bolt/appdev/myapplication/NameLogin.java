package com.bolt.appdev.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.util.AndroidException;


public class NameLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_login);
    }
    public void LogIn(View view){
        EditText iv= findViewById(R.id.editText);
        EditText v= findViewById(R.id.editText2);
        if((iv.getText().toString().equals("bolt"))&&
                v.getText().toString().equals("bolt")){
            Intent iii = new Intent(getApplicationContext(),CoffeCup.class);
            startActivity(iii);
        Toast.makeText(getApplicationContext(), "Login Successful!",
                Toast.LENGTH_LONG).show();



    }
    else{
        Toast.makeText(getApplicationContext(),"Wrong Credentials",
                Toast.LENGTH_SHORT).show();
                
        }
}
    public void FeelingLucky(View view){
        Intent Fl = new Intent(getApplicationContext(),Converter.class);
        startActivity(Fl);
        Toast.makeText(getApplicationContext(),"Hehe, try it :) ",
                Toast.LENGTH_LONG).show();
    }
    public void Register(View view){

    }
}