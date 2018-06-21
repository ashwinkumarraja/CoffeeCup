package com.bolt.appdev.myapplication;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
        import android.widget.ImageView;
        import android.util.AndroidException;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RedImage(View v){
        ImageView iv= findViewById(R.id.imageView2);
                iv.setImageResource(R.drawable.red);
    }
    public void BlueImage(View v){
        ImageView iv= findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.blue);
    }
    public void GreenImage(View v){
        ImageView iv= findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.green);
    }
    public void YellowImage(View v){
        ImageView iv= findViewById(R.id.imageView2);
        iv.setImageResource(R.drawable.yellow);
    }
}
