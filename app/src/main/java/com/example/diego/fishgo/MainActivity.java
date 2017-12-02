package com.example.diego.fishgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> v=new ArrayList<String>();
    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String a="Uno";
        String b="Dos";
        String c="Tres";
            v.add(a);
            v.add(b);
            v.add(c);
        Log.e("Numero Elementos",v.size()+"");
        sp=(Spinner)findViewById(R.id.mySpinner);
        sp.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item, v));
    }
    public void sendMessage(View view)
    {
        Intent intent = new Intent(MainActivity.this, Activity2.class);
        startActivity(intent);
    }
}
