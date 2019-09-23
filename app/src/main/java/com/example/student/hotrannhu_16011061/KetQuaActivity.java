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

        edtKQ = findViewById(R.id.edtKQ);
        Intent intent = getIntent();
        double a = Double.parseDouble(intent.getStringExtra("SOA"));
        double b = Double.parseDouble(intent.getStringExtra("SOB"));
        double c = Double.parseDouble(intent.getStringExtra("SOC"));
        double x;
        double delta = (b * b) - (4 * a * c);
        if (a == 0) {
            if (b == 0 && c != 0)
                edtKQ.setText("Phuong trinh vo nghiem");
            else {
                x = -c / b;
                edtKQ.setText("Phuong trinh co nghiem " + Double.toString(x));
            }
        } else {
            if (delta < 0)
                edtKQ.setText("Phuong trinh vo nghiem");
            else if (delta == 0) {
                x = -b / 2 * a;
                edtKQ.setText("Phuong trinh co nghiem" + Double.toString(x));
            } else {
                double x1, x2;
                x1 = (-b - (float) Math.sqrt(delta)) / 2 * a;
                x2 = (-b + (float) Math.sqrt(delta)) / 2 * a;
                edtKQ.setText("PHuong trinh co nhiem thu nhat" + Double.toString(x1) + "Phuong trinh co nghiem thu hai" + Double.toString(x2));
            }

        }
    }
}