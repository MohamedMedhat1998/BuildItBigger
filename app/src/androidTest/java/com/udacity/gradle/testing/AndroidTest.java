package com.udacity.gradle.testing;

import android.support.test.runner.AndroidJUnit4;
import android.test.AndroidTestCase;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

@RunWith(AndroidJUnit4.class)
public class AndroidTest {
    @Test
    public void testAsyncTaskJoke() throws ExecutionException, InterruptedException {
        JokeClass jokeClass = new JokeClass();
        assert !(new EndpointsAsyncTask().execute(jokeClass.getJoke()).get()).isEmpty();
    }

}
