package com.example.tugas2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText et_nama = findViewById(R.id.et_nama);
        EditText et_nim = findViewById(R.id.et_nim);
        EditText et_nilai = findViewById(R.id.et_nilai);
        Button btnSubmit = findViewById(R.id.btn_submit);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Tampil.class);

                i.putExtra("NAMA", et_nama.getText().toString());
                i.putExtra("NIM", et_nim.getText().toString());
                i.putExtra("NILAI", et_nilai.getText().toString());

                startActivity(i);
            }
        });
    }
}