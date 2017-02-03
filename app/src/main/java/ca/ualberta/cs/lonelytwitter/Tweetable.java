package ca.ualberta.cs.lonelytwitter;

/**
 * This interface provides a structure for the tweet object.
 * @see Tweet
 * Created by shida3 on 1/19/17.
 */

public interface Tweetable {
    public String getMessage();
    public void setMessage(String string) throws TweetTooLongException;
}
