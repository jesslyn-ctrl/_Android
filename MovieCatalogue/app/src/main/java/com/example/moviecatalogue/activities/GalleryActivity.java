package com.example.moviecatalogue.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moviecatalogue.R;
import com.example.moviecatalogue.model.Movie;

import java.util.Objects;

public class GalleryActivity extends AppCompatActivity {
    public static final String MOVIE_ITEM = "movie_item";

    int img;
    String name, release, desc;

    ImageView imgvw;
    TextView movieName, movieRelease, movieDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        setTitle("Movie Gallery Detail");

        Movie movie = getIntent().getParcelableExtra(MOVIE_ITEM);

        assert movie != null;
        img = movie.getPhoto();
        name = movie.getName();
        release = movie.getRelease();
        desc = movie.getDescription();

        imgvw = findViewById(R.id.img_item_photo);
        imgvw.setImageResource(img);

        movieName = findViewById(R.id.tv_item_name);
        movieName.setText(name);

        movieRelease = findViewById(R.id.tv_release);
        movieRelease.setText(release);

        movieDesc = findViewById(R.id.tv_item_description);
        movieDesc.setText(desc);

        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}