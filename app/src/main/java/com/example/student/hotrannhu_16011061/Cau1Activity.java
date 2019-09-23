package com.example.student.hotrannhu_16011061;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class Cau1Activity extends AppCompatActivity {

    ListView lvMovies;
    ArrayList<Movie> arrMovies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cau1);
        MovieAdapter mvadt;
         lvMovies = (ListView)findViewById(R.id.lvMovies);
        arrMovies = new ArrayList<>();

        arrMovies.add(new Movie("Wolfverin","American", "30.000"));
        arrMovies.add(new Movie("SwwordFish","American", "15.000"));
        arrMovies.add(new Movie("DeadPool","American", "29.000"));
        arrMovies.add(new Movie("EndGame","American", "100.000"));
        arrMovies.add(new Movie("IronMan","American", "70.000"));
        mvadt = new MovieAdapter(Cau1Activity.this, R.layout.movies, arrMovies);
        lvMovies.setAdapter(mvadt);
    }
}
