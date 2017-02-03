package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Stores sad mood.
 * @see Mood
 * Created by kirsten on 1/19/17.
 */
public class Sad extends Mood {
    /**
     * Instantiates a new Sad.
     */
    public Sad() {
    }

    /**
     * Instantiates a new Sad.
     *
     * @param date the date
     */
    public Sad(Date date) {
        super(date);
    }

    /**
     * Returns a string that represents "sad"
     * @return the string "sad"
     */
    @Override
    public String showMood() {
        return "Sad";
    }
}
