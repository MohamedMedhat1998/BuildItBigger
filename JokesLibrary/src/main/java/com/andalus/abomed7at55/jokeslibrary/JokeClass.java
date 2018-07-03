package com.andalus.abomed7at55.jokeslibrary;

import java.util.ArrayList;
import java.util.Random;

public class JokeClass {

    private String mJoke;
    private ArrayList<String> mJokesList;
    private Random rand;



    public JokeClass(){
        mJokesList = new ArrayList<>();
        rand = new Random();
        mJokesList.add("Q: Can Bees fly in the rain?\n" +
                "\n" +
                "A: Not without their yellow jackets.\n" +
                "\n");
        mJokesList.add("Q: What is a Queens favorite kind of precipitation?\n" +
                "\n" +
                "A: Reign!\n" +
                "\n");
        mJokesList.add("Q: What is the Mexican weather report?\n" +
                "\n" +
                "A: Chili today and hot tamale.\n" +
                "\n");
        mJokesList.add("Q: What did the evaporating raindrop say?\n" +
                "\n" +
                "A: I'm going to pieces.\n" +
                "\n");
        mJokesList.add("Q: What did the hail storm say to the roof?\n" +
                "\n" +
                "A: Hang onto your shingles, this will be no ordinary sprinkles.");
        mJokesList.add("Q: What do you call a wet bear?\n" +
                "\n" +
                "A: A drizzly bear\n" +
                "\n");
        mJokesList.add("Q: What do you call two straight days of rain in Seattle?\n" +
                "\n" +
                "A: A weekend.\n" +
                "\n");
        mJokesList.add("Q: What goes up when the rain comes down?\n" +
                "\n" +
                "A: An Umbrella");
        mJokesList.add("Q: What does it do before it rains candy?\n" +
                "\n" +
                "A: It sprinkles!");

        mJoke = mJokesList.get(rand.nextInt(mJokesList.size()));
    }

    public String getJoke(){
        return mJoke;
    }

    public void refresh(){
        mJoke = mJokesList.get(rand.nextInt(mJokesList.size()));
    }

}
