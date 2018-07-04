package com.andalus.abomed7at55.jokeviewer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class JokeViewer extends AppCompatActivity {

    public static final String JOKE_KEY = "joke";

    TextView tvJokeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_viewer);
        tvJokeView = findViewById(R.id.tv_joke);
        try {
            String joke = getIntent().getExtras().getString(JOKE_KEY);
            tvJokeView.setText(joke);
        }catch (NullPointerException e){
            e.printStackTrace();
            Toast.makeText(getBaseContext(), R.string.error_message,Toast.LENGTH_SHORT).show();
        }

    }
}
