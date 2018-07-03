package com.udacity.gradle.testing;

import com.andalus.abomed7at55.jokeslibrary.JokeClass;

import org.junit.Test;

public class TestClass {
    @Test
    public void testJokeString(){
        JokeClass jokeClass = new JokeClass();
        assert !jokeClass.getJoke().equals("");
    }


}
