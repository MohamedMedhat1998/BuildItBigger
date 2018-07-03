package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;
import com.andalus.abomed7at55.jokeviewer.JokeViewer;

import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity {
    JokeClass mJokeClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mJokeClass = new JokeClass();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        Intent i = new Intent(MainActivity.this, JokeViewer.class);
        try {
            String joke = new EndpointsAsyncTask().execute(new Pair<Context, String>(this, mJokeClass.getJoke())).get();
            i.putExtra(JokeViewer.JOKE_KEY,joke);
            mJokeClass.refresh();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        startActivity(i);
    }


}