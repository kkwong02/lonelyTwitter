package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This class stores the message and date of the tweets.
 * the LonelyTwitterActivity class.
 *
 * Created by shida3 on 1/19/17.
 */
public abstract class Tweet implements Tweetable{
    /**
     * The date the tweet was sent. Stored as a Date object.
     */
    private Date date;

    /**
     * the message entered by the user.
     */
    private String message;

    /**
     * Instantiates a new Tweet with a message only. The date is automatically generated.
     * @param message the message
     */
    public Tweet(String message){
        this.message = message;
        this.date = new Date();
    }

    /**
     * Instantiates a new Tweet with a provided date.
     *
     * @param date    the date
     * @param message the message
     */
    public Tweet(Date date, String message){
        this.message = message;
        this.date = date;
    }

    /**
     * Gets date of the tweet.
     *
     * @return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * Sets date.
     *
     * @param date the date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length() > 140){
            throw new TweetTooLongException();
        }
        this.message = message;
    }

    /**
     * Converts a tweet to a string format.
     *
     * @return the boolean
     */
    public abstract Boolean isImportant();

    @Override
    public String toString(){
        return date.toString() + " | " + message;
    }
}

