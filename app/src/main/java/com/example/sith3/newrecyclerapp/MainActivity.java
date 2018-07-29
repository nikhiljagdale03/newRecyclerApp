package com.example.sith3.newrecyclerapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = findViewById(R.id.recycler_view);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
       MyAdapter adapter = new MyAdapter(this, getData());
        mRecyclerView.setAdapter(adapter);
    }
    private List<Country> getData() {
        List<Country> data = new ArrayList<>();
        Country c1=new Country();
        c1.setCountryName("India");
        c1.setCapital("Delhi");
        data.add(c1);
        Country c2=new Country();
        c2.setCountryName("America");
        c2.setCapital("New York");
        data.add(c2);
        Country c3=new Country();
        c3.setCountryName("India");
        c3.setCapital("Delhi");
        data.add(c3);
        Country c4=new Country();
        c4.setCountryName("India");
        c4.setCapital("Delhi");
        data.add(c4);
        Country c5=new Country();
        c5.setCountryName("India");
        c5.setCapital("Delhi");
        data.add(c5);

        return data;
    }
}
