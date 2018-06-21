package com.bolt.appdev.myapplication;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.system.Os;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CoffeCup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffe_cup);
    }
    public void Order(View view){
        EditText i= findViewById(R.id.editText3);

                if((i.getText().toString().equals("null"))){
            Toast.makeText(getApplicationContext(),"Forgot the Name :(",
                    Toast.LENGTH_LONG).show();
        }

    }
    public void Add(View view){

        EditText ii= (EditText) findViewById(R.id.editText11);
        String str = ii.getText().toString();
        int k = Integer.parseInt(str);
        if(k>=4){
            k=k+0;
            Toast.makeText(getApplicationContext(),"That's too much of Cream",
                    Toast.LENGTH_LONG).show();
        }
        else {
            k++;
        }
        str = Integer.toString(k);
        ii.setText(str);


    }
    public void Add2(View view){

        EditText ii= (EditText) findViewById(R.id.editText9);
        String str = ii.getText().toString();
        EditText ix= (EditText) findViewById(R.id.editText5);
        String str2 = ix.getText().toString();
        TextView x = findViewById(R.id.textView14);
        String str3 = x.getText().toString();
        TextView xx = findViewById(R.id.textView15);
        String str4 = xx.getText().toString();
        TextView xxx = findViewById(R.id.textView12);
        String str5 = xxx.getText().toString();
        int k = Integer.parseInt(str);
        int l;
        int m;
        if(k>=10){
            k=k+0;
            Toast.makeText(getApplicationContext(),"That's too much of Coffee",
                    Toast.LENGTH_LONG).show();
        }
        else {
            k++;
        }
        l=k*5;
        m=k*2;
        str = Integer.toString(k);
        ii.setText(str);
        str2 = Integer.toString(k);
        ix.setText(str2);
        str3 = Integer.toString(l);
        x.setText(str3+"$");
        str4 = Integer.toString(m);
        xx.setText(str4+"$");
        str5 = Integer.toString(m);
        xxx.setText(str5+"$");


    }
    public void Sub(View view){

        EditText ii= findViewById(R.id.editText11);
        String str = ii.getText().toString();
        int k = Integer.parseInt(str);

        if(k<=0){
            k=0;
        }
        else{
            k--;
        }
        str = Integer.toString(k);
        ii.setText(str);
    }
    public void Sub2(View view){

        EditText ii= findViewById(R.id.editText9);
        String str = ii.getText().toString();
        EditText ix= (EditText) findViewById(R.id.editText5);
        String str2 = ix.getText().toString();
        TextView x = findViewById(R.id.textView14);
        String str3 = x.getText().toString();
        TextView xx = findViewById(R.id.textView15);
        String str4 = xx.getText().toString();
        TextView xxx = findViewById(R.id.textView12);
        String str5 = xxx.getText().toString();
        int k = Integer.parseInt(str);
        int l = Integer.parseInt(str3);
        int m = Integer.parseInt(str4);

        if(k<=0){
            k=0;

        }
        else{
            k--;
        }
        l=k*5;
        m=k*2;
        str = Integer.toString(k);
        ii.setText(str);
        str2 = Integer.toString(k);
        ix.setText(str2);
        str3 = Integer.toString(l);
        x.setText(str3+"$");
        str4 = Integer.toString(m);
        xx.setText(str4+"$");
        str5 = Integer.toString(m);
        xxx.setText(str5+"$");
    }

    public void checkBox1(View view){
     boolean checked = ((CheckBox) view).isChecked();
        switch ((view.getId())){
            case R.id.checkBox :
                if(checked){
                    TextView Os = (TextView)findViewById(R.id.textView13);
                    String str ;
                    str = "Whipped Cream";
                    Os.setText(str);
                   // TextView q1 = (EditText)findViewById(R.id.editText6);
                   // EditText qq = (EditText) findViewById(R.id.editText11);
                    //String str22 = qq.getText().toString();
                    //q1.setText(str22);

                }
               break;
            case R.id.checkBox2 :
                if(checked){
                    TextView Os2 = (TextView)findViewById(R.id.textView10);
                    String str11 ;
                    str11 = "Chocolate";
                    Os2.setText(str11);
                   // TextView q1 = (EditText)findViewById(R.id.editText5);
                  //  EditText qq = (EditText) findViewById(R.id.editText9);
                    //String str23 = qq.getText().toString();
                    //q1.setText(str23);

                }
                break;
        }
    }
    public static class ExFrag extends Fragment {
        public View onCreateView(LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState){
            return inflater.inflate(R.layout.example,container,false);
        }
    }

}
