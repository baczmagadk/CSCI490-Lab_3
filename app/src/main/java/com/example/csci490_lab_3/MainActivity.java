package com.example.csci490_lab_3;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String[] classArray = getResources().getStringArray(R.array.classArray);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView classListView = (ListView) findViewById(R.id.class_schedule);


        ArrayAdapter<String> classes = new ArrayAdapter<String>(this, R.layout.list_view, R.id.myText, classArray);

        classListView.setAdapter(classes);


        classListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            public void onItemClick(AdapterView<?> arg0, View v, int arg2, long arg3) {

                TextView myText = (TextView) v.findViewById(R.id.myText);
                Toast.makeText(getApplicationContext(), myText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}