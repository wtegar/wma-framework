package com.example.minggu_4;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.minggu_4.navigator.Navigator;
import com.google.android.material.textfield.TextInputEditText;

public class ImplicitActivity extends AppCompatActivity {

    Navigator Navigator = new Navigator();
    Button btn_back, btn_cari;
    TextInputEditText txt_cari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar bar = getSupportActionBar();
        bar.hide();
        setContentView(R.layout.activity_implicit);
        cari();
        back();
    }

    private void back() {
        btn_back = (Button) findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void cari() {
        btn_cari = (Button) findViewById(R.id.btn_cari);
        btn_cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt_cari = (TextInputEditText) findViewById(R.id.txt_cari);
                String cari = txt_cari.getText().toString();
                if (!cari.isEmpty()) {
                    aksiCariLokasi(cari);
//                    Toast.makeText(ImplicitActivity.this, "Lokasi : " + cari, Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(ImplicitActivity.this, "Input Lokasi Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void aksiCariLokasi(String lokasi) {
        Uri locationUri = Uri.parse("geo:0,0?q=" + lokasi);
        Intent map = new Intent(Intent.ACTION_VIEW, locationUri);
        map.setPackage("com.google.android.apps.maps");
        startActivity(map);
    }
}