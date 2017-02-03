package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Stores happy mood.
 * Created by kirsten on 1/19/17.
 */
public class Happy extends Mood {
    /**
     * Instantiates a new Happy.
     */
    public Happy() {
    }

    /**
     * Instantiates a new Happy.
     *
     * @param date the date
     */
    public Happy(Date date) {
        super(date);
    }


    /**
     * returns string that represents happy.
     * @return "Happy" string
     */
    @Override
    public String showMood() {
        return "Happy";
    }
}
