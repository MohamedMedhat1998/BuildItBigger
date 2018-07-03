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

    public void addPremiumJokes(){
        mJokesList.add("Can a kangaroo jump higher than a house? \n" +
                "-\n" +
                "Of course, a house doesn’t jump at all.\n");
        mJokesList.add("Doctor: \"I'm sorry but you suffer from a terminal illness and have only 10 to live.\"\n" +
                "\n" +
                "Patient: \"What do you mean, 10? 10 what? Months? Weeks?!\"\n" +
                "\n" +
                "Doctor: \"Nine.\"\n");
        mJokesList.add("A man asks a farmer near a field, “Sorry sir, would you mind if I crossed your field instead of going around it? You see, I have to catch the 4:23 train.”\n" +
                "\n" +
                "The farmer says, “Sure, go right ahead. And if my bull sees you, you’ll even catch the 4:11 one.”\n");
        mJokesList.add("Anton, do you think I’m a bad mother?\n" +
                "\n" +
                "My name is Paul.\n");
        mJokesList.add("My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away.\n");
        mJokesList.add("Mother: \"How was school today, Patrick?\"\n" +
                "\n" +
                "Patrick: \"It was really great mum! Today we made explosives!\"\n" +
                "\n" +
                "Mother: \"Ooh, they do very fancy stuff with you these days. And what will you do at school tomorrow?\"\n" +
                "\n" +
                "Patrick: \"What school?\"\n");
        mJokesList.add("Doctor: “I’ve found a great new drug that can help you with your sleeping problem.”\n" +
                " \n" +
                "Patient: “Great, how often do I have to take it?”\n" +
                " \n" +
                "Doctor: “Every two hours.”\n");
        mJokesList.add("Sleep with an open window tonight! \n" +
                "\n" +
                "1400 mosquitos like that. 420 mosquitos commented on it. 210 mosquitos shared this. \n" +
                "\n" +
                "One mosquito invited for the event. 2800 mosquitos will be attending the event\n");
        mJokesList.add("A wife goes to consult a psychiatrist about her husband: “My husband is acting so weird. He drinks his morning coffee and then he goes and eats the mug! He only leaves the handle!”\n" +
                " \n" +
                "Psychiatrist: “Yes, that is weird. The handle is the best part.“\n");
        mJokesList.add("“You know how it is in life. One door closes – that means another door opens…”\n" +
                " \n" +
                "“Yeah, very nice, but you either fix that or I’m expecting a serious discount on that car!”\n");
        refresh();
    }

    public String getJoke(){
        return mJoke;
    }

    public void refresh(){
        mJoke = mJokesList.get(rand.nextInt(mJokesList.size()));
    }

}
