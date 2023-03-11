package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    ArrayList<shyaridata> list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list = new ArrayList<>();
        getSupportActionBar().hide();
        list();

        recyclerView = findViewById(R.id.re);
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setHasFixedSize(true);
        shyariAdapter adapter = new shyariAdapter(this,list);
        recyclerView.setAdapter(adapter);
    }

    private void list() {
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));
        list.add(new shyaridata("hi"));

    }
}