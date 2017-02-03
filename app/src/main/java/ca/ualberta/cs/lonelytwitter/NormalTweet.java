package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Stores a normal tweet saved by the user.
 *
 * @see Tweet Created by shida3 on 1/19/17.
 */
public class NormalTweet extends Tweet {
    /**
     * Instantiates a new Normal tweet.
     *
     * @param message the message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Instantiates a new Normal tweet.
     *
     * @param date    the date
     * @param message the message
     */
    public NormalTweet(Date date, String message) {
        super(date, message);
    }

    /**
     * returns whether the tweet is an important tweet.
     * @return false
     */

    @Override
    public Boolean isImportant(){
        return false;
    }
}
