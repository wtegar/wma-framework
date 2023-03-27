package com.example.minggu_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.minggu_4.navigator.Navigator;

public class MainActivity extends AppCompatActivity {

    Navigator Navigator = new Navigator();
    Button btn_explicit, btn_implicit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_main);
        btn_explicit = (Button) findViewById(R.id.btn_explicit);
        btn_explicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toExplicitActivity();
            }
        });

        btn_implicit = (Button) findViewById(R.id.btn_implicit);
        btn_implicit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toImplicitActivity();
            }
        });
    }


    private void toExplicitActivity(){
        Navigator.pushReplacement(getApplicationContext(), ExplicitActivity.class);
    }

    private void toImplicitActivity(){
        Navigator.pushReplacement(getApplicationContext(), ImplicitActivity.class);
    }
}