package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
Spinner spn;
TextView t1;
String country[] = {"Please select country","India","USA","NewZealand","UAE","Bangladesh"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = (Spinner)findViewById(R.id.spn);
        t1 = (TextView)findViewById(R.id.t1);

        ArrayAdapter adp = new  ArrayAdapter( this,android.R.layout.simple_spinner_item,country);
        adp.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spn.setAdapter(adp);

        spn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                if(position == 0){
                    t1.setText("Please select country");
                    t1.setTextColor(Color.BLACK);
                    t1.setTextSize(20);
                }
                else {
                    t1.setText("You have selected: "+country[position]);
                    t1.setTextColor(Color.BLACK);
                    t1.setTextSize(20);
                }
                
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
}