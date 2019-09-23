package com.example.student.hotrannhu_16011061;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.widget.TextView;

import java.util.ArrayList;

public class MovieAdapter extends BaseAdapter {
    Context ctx;
    int layout;
    ArrayList<Movie> arrMovies;

    public MovieAdapter(Context ctx, int layout, ArrayList<Movie> arrMovies) {
        this.ctx = ctx;
        this.layout = layout;
        this.arrMovies = arrMovies;
    }

    @Override
    public int getCount() {
        return arrMovies.size();
    }

    @Override
    public Object getItem(int i) {
        return arrMovies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = view;
        LayoutInflater inflater = LayoutInflater.from(ctx);
        v = inflater.inflate(R.layout.movies, null);

        TextView tvName = (TextView)v.findViewById(R.id.tvName);
        TextView tvCountry = (TextView)v.findViewById(R.id.tvCountry);
        TextView tvPrice = (TextView)v.findViewById(R.id.tvPrice);

        tvName.setText(arrMovies.get(i).getName());
        tvCountry.setText(arrMovies.get(i).getCountry());
        tvPrice.setText(arrMovies.get(i).getPrice().toString());
        return v;
    }
}
