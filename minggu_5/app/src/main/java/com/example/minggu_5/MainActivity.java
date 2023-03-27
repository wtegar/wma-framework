package com.example.minggu_5;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_fragment_1, button_fragment_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar bar = getSupportActionBar();
        bar.hide();

        button_fragment_1 = (Button) findViewById(R.id.btn_fragment_1);
        button_fragment_2 = (Button) findViewById(R.id.btn_fragment_2);

        button_fragment_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fw = getSupportFragmentManager();
                FragmentTransaction ft = fw.beginTransaction();
                ft.replace(R.id.container, new HomeFragment());
                ft.commit();
                Toast.makeText(MainActivity.this, "HOME FRAGMENT", Toast.LENGTH_SHORT).show();
            }
        });

        button_fragment_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fw = getSupportFragmentManager();
                FragmentTransaction ft = fw.beginTransaction();
                ft.replace(R.id.container, new AboutFragment());
                ft.commit();
                Toast.makeText(MainActivity.this, "ABOUT FRAGMENT", Toast.LENGTH_SHORT).show();
            }
        });
    }
}