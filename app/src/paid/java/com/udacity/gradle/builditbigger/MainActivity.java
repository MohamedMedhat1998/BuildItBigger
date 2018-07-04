package com.udacity.gradle.builditbigger;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;
import com.andalus.abomed7at55.jokeviewer.JokeViewer;

import java.util.concurrent.ExecutionException;


public class MainActivity extends AppCompatActivity implements OnLoadingFinishedListener {

    private JokeClass mJokeClass;
    private Button btnTellJoke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTellJoke = findViewById(R.id.btn_tell_joke);
        mJokeClass = new JokeClass();
        mJokeClass.addPremiumJokes();
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
        new EndpointsAsyncTask(this).execute(JokeClass.FLAVOR_PAID);
        redLight();
    }


    @Override
    public void onLoadingFinished(String result) {
        Intent i = new Intent(MainActivity.this, JokeViewer.class);
        i.putExtra(JokeViewer.JOKE_KEY,result);
        mJokeClass.refresh();
        greenLight();
        startActivity(i);
    }

    /**
     * This method stops the user from being able to press the button twice before loading the joke
     */
    private void redLight(){
        btnTellJoke.setEnabled(false);
        btnTellJoke.setText(R.string.loading_message);
    }

    /**
     * This method re-enables the user to be able to press the button
     */
    private void greenLight(){
        btnTellJoke.setEnabled(true);
        btnTellJoke.setText(R.string.button_text);
    }
}
