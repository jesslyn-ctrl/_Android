package com.example.moviecatalogue.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.example.moviecatalogue.R;
import com.example.moviecatalogue.adapter.ListMovieAdapter;
import com.example.moviecatalogue.model.Movie;
import com.example.moviecatalogue.model.MovieData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvMovies;
    private ListMovieAdapter movieAdapter;
    private RecyclerView.LayoutManager movieLayout;
    private ArrayList<Movie> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMovies = findViewById(R.id.rv_movies);
        rvMovies.setHasFixedSize(true);

        list.addAll(MovieData.getListData());
        buildRecyclerView();
    }

    private void buildRecyclerView() {
        movieLayout = new LinearLayoutManager(this);
        movieAdapter = new ListMovieAdapter(list);

        rvMovies.setLayoutManager(movieLayout);
        rvMovies.setAdapter(movieAdapter);

        movieAdapter.setOnItemClickListener(new ListMovieAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int pos) {
                Intent intent = new Intent(MainActivity.this, GalleryActivity.class);
                intent.putExtra(GalleryActivity.MOVIE_ITEM, list.get(pos));
                startActivity(intent);
            }
        });
    }
}
