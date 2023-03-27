package com.example.minggu_3;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.example.minggu_3.navigator.pushReplacement;

public class MainActivity extends AppCompatActivity {
    pushReplacement Navigator = new pushReplacement();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_main);
        pushToList();
        pushToRecycler();
    }

    Button btn_list, btn_recycler;

    private void pushToList(){
        btn_list = (Button)findViewById(R.id.btn_listView);
        btn_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.pushReplacement(getApplicationContext(), ListView.class);
            }
        });
    }

    private void pushToRecycler(){
        btn_recycler = (Button) findViewById(R.id.btn_recycler);
        btn_recycler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigator.pushReplacement(getApplicationContext(), RecyclerView.class);
            }
        });
    }
}