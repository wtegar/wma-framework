package com.example.minggu_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerView extends AppCompatActivity {
    androidx.recyclerview.widget.RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    Adapter adapterData;
    List<String> listData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        recyclerView = findViewById(R.id.recycler_view);
        listData = new ArrayList<>();

        for (int i=0;i<10;i++) {
            listData.add("Data Ke "+i);
        }
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        adapterData = new Adapter(this, listData);
        recyclerView.setAdapter(adapterData);
        adapterData.notifyDataSetChanged();
    }


}