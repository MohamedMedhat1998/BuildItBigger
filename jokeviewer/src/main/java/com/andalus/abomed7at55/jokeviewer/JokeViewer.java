package com.andalus.abomed7at55.jokeviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeViewer extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";

    TextView tvJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);
        tvJokeView = findViewById(R.id.tv_joke);

        String joke = getIntent().getExtras().getString(JOKE_KEY);

        tvJokeView.setText(joke);
    }
}
