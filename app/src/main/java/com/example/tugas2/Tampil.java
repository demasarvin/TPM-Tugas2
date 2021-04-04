package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Tampil extends AppCompatActivity {

    public TextView tv_nama, tv_nim, tv_nilai;
    Intent  i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil);

        tv_nama =  findViewById(R.id.nama);
        tv_nim = findViewById(R.id.nim);
        tv_nilai = findViewById(R.id.nilai);
    }

    protected void onStart() {
        super.onStart();
        i = getIntent();

        tv_nama.setText(i.getStringExtra("NAMA"));
        tv_nim.setText(i.getStringExtra("NIM"));

        String sNilai = i.getStringExtra("NILAI");

        double nilai = Double.parseDouble(sNilai);

        if (3.66 < nilai && nilai <= 4.00) {
            sNilai = "A";
        } else if (3.33 < nilai && nilai <= 3.66) {
            sNilai = "A-";
        } else if (3.00 < nilai && nilai <= 3.33) {
            sNilai = "B+";
        } else if (2.66 < nilai && nilai <= 3.00) {
            sNilai = "B";
        } else if (2.33 < nilai && nilai <= 2.66) {
            sNilai = "B-";
        } else if (2.00 < nilai && nilai <= 2.33) {
            sNilai = "C+";
        } else if (1.66 < nilai && nilai <= 2.00) {
            sNilai = "C";
        } else if (1.33 < nilai && nilai <= 1.66) {
            sNilai = "C-";
        } else if (1.00 < nilai && nilai <= 1.33) {
            sNilai = "D+";
        } else if (nilai <= 1.00) {
            sNilai = "D";
        } else {
            sNilai = "Format salah";
        }

        tv_nilai.setText(sNilai);
    }
}