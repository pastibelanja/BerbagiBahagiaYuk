package com.kilau.berbagibahagiayuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_profile, btn_absensi, btn_marketing, btn_diskusi, btn_berita, btn_gaji;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = (Button)findViewById(R.id.buttonProfile);
        btn_absensi = (Button)findViewById(R.id.buttonAbsensi);
        btn_marketing = (Button) findViewById(R.id.buttonMarketing);
        btn_diskusi = (Button) findViewById(R.id.buttonDiskusi);
        btn_berita = (Button) findViewById(R.id.buttonBerita);
        btn_gaji = (Button)findViewById(R.id.buttonGaji);


        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, ProfilActivity.class));
            }
        });


        btn_absensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, AbsensiActivity.class));
            }
        });

        btn_marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Laporan Kunjungan Marketing", Toast.LENGTH_SHORT).show();
            }
        });

        btn_diskusi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Forum Diskusi", Toast.LENGTH_SHORT).show();
            }
        });

        btn_berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Halaman Berita", Toast.LENGTH_SHORT).show();
            }
        });

        btn_gaji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Halaman Informasi Gaji", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
