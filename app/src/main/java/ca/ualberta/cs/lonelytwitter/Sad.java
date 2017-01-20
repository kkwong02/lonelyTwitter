package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kirsten on 1/19/17.
 */

public class Sad extends Mood {
    public Sad() {
    }

    public Sad(Date date) {
        super(date);
    }

    @Override
    public String showMood() {
        return "Sad";
    }
}
