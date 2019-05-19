package com.kilau.berbagibahagiayuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Calendar;

public class AbsensiActivity extends AppCompatActivity {

    private Button btn_masuk,btn_pulang;
    private TextClock waktu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_absensi);

        btn_masuk = (Button)findViewById(R.id.btn_masuk);
        btn_pulang = (Button)findViewById(R.id.btn_pulang);

        btn_masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AbsensiActivity.this, CameraActivity.class));
            }
        });
        btn_pulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(AbsensiActivity.this, CameraActivity.class));
            }
        });

        Calendar calendar = Calendar.getInstance();
        String currentDate = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());

        TextView textViewDate = findViewById(R.id.tanggal);
        textViewDate.setText(currentDate);

        TextClock waktu = (TextClock)findViewById(R.id.waktu);





    }
    public void showTextClock(View view){
        waktu.setVisibility(view.VISIBLE);
    }
}
