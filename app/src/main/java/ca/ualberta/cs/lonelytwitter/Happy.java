package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by kirsten on 1/19/17.
 */

public class Happy extends Mood {
    public Happy() {
    }

    public Happy(Date date) {
        super(date);
    }

    @Override
    public String showMood() {
        return "Happy";
    }
}
