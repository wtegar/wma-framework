package com.example.minggu_2.Material;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.minggu_2.R;

public class ScrollViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar act = getSupportActionBar();
        act.hide();
        setContentView(R.layout.scroll_view);
    }
}