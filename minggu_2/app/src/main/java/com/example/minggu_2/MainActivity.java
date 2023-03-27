package com.example.minggu_2;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.minggu_2.Material.ScrollViewActivity;
//import android.widget.ScrollView;
import com.example.minggu_2.intent.PushReplacement;
import com.example.minggu_2.Material.TableLayout;
import com.example.minggu_2.ConstraintLayout;


public class MainActivity extends AppCompatActivity {
    Button btn_linear_layout, btn_scroll_view, btn_relative, btn_constraint, btn_frame, btn_table;
    PushReplacement push = new PushReplacement();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar act = getSupportActionBar();
//        act.setTitle("FrameLayout");
        act.hide();
        setContentView(R.layout.activity_main);
        pushToLinear();
        pushToRelative();
        pushToConstraint();
        pushToScroll();
        pushToTable();
        pushToFrame();



    }

    private void pushToLinear(){
        btn_linear_layout = findViewById(R.id.button_linear_layout);
        btn_linear_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push.pushReplacement(getApplicationContext(), LinearLayout.class);
            }
        });
    }
    private void pushToRelative(){
        btn_relative = findViewById(R.id.button_relative_layout);
        btn_relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push.pushReplacement(getApplicationContext(), RelativeLayout.class);
            }
        });
    }
    private void pushToConstraint(){
        btn_constraint = findViewById(R.id.button_constraint_layout);
        btn_constraint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push.pushReplacement(getApplicationContext(), ConstraintLayout.class);
            }
        });
    }
    private void pushToFrame(){
        btn_frame = findViewById(R.id.button_frame_layout);
        btn_frame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push.pushReplacement(getApplicationContext(), FrameLayout.class);
            }
        });
    }
    private void pushToScroll(){
        btn_scroll_view = findViewById(R.id.button_scroll_view);
        btn_scroll_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ScrollViewActivity.class);
                startActivity(intent);
            }
        });
    }
    private void pushToTable(){
        btn_table = findViewById(R.id.button_table_layout);
        btn_table.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                push.pushReplacement(getApplicationContext(), TableLayout.class);
            }
        });
    }
}