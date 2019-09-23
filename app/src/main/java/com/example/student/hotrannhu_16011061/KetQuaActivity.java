package com.example.student.hotrannhu_16011061;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.EditText;

public class KetQuaActivity extends AppCompatActivity {

    EditText edtKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ket_qua);

        Intent intent = getIntent();
        String a = intent.getStringExtra("SOA");
        String b = intent.getStringExtra("SOB");
        String c = intent.getStringExtra("SOC");

        edtKQ.setText("PT vo nghiem");
    }
}
