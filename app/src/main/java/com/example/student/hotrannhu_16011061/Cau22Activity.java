package com.example.student.hotrannhu_16011061;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cau22Activity extends AppCompatActivity {

    EditText edtA;
    EditText edtB;
    EditText edtC;
    Button btnKQ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau22);

        edtA = (EditText) findViewById(R.id.edtA);
        edtB = (EditText) findViewById(R.id.edtB);
        edtC = (EditText) findViewById(R.id.edtC);
        btnKQ = (Button)findViewById(R.id.btnKQ);


        btnKQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byExtras();
            }
        });

    }
    public void byExtras(){
        Intent intent = new Intent(Cau22Activity.this,KetQuaActivity.class);
        intent.putExtra("SOA",edtA.getText().toString());
        intent.putExtra("SOB",edtB.getText().toString());
        intent.putExtra("SOC",edtC.getText().toString());
        startActivity(intent);
    }
}
