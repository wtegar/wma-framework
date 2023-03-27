package com.example.minggu_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity_2 extends AppCompatActivity {

    TextView text;
    Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar act = getSupportActionBar();
        act.hide();
        setContentView(R.layout.activity_2);
        text = (TextView) findViewById(R.id.txt_receiver);
//        text.setText("ASEDE");
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        text.setText(str.toString());

        back = (Button) findViewById(R.id.btn_back);
        back.setOnClickListener(v -> {
//

            onBackPressed();
        });

    }

    LayoutInflater inflater;
    ViewGroup container;

}