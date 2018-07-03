package com.udacity.gradle.testing;

import android.content.Context;
import android.util.Pair;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;
import com.udacity.gradle.builditbigger.EndpointsAsyncTask;

import org.junit.Test;

import java.util.concurrent.ExecutionException;

public class TestClass {
    @Test
    public void testJokeString(){
        JokeClass jokeClass = new JokeClass();
        assert !jokeClass.getJoke().equals("");
    }


}
