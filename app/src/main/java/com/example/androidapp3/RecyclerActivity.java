package com.example.androidapp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class RecyclerActivity extends AppCompatActivity {
String[] langData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
        langData=new String[]{"English","Hindi","Telugu","Tamil","Kannada"};
        RecyclerView recyclerView=findViewById(R.id.rcycleview);
       MyAdapter adapter=new MyAdapter(langData);
    }
}