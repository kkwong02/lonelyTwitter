package ca.ualberta.cs.lonelytwitter;

import android.test.ActivityInstrumentationTestCase;
import android.test.ActivityInstrumentationTestCase2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by kirsten on 2/16/17.
 */

public class TweetListTest extends ActivityInstrumentationTestCase2 {

    public TweetListTest(){
        super(LonelyTwitterActivity.class);

    }

    public void testAddTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));

        boolean exception = false;

        try {
            tweets.addTweet(tweet);
        }
        catch (IllegalArgumentException e){
            exception = true;
        }

        assertTrue(exception);
    }

    public void testHasTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");
        assertFalse(tweets.hasTweet(tweet));
        tweets.addTweet(tweet);
        assertTrue(tweets.hasTweet(tweet));
    }

    public void testGetTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        NormalTweet returnedTweet = tweets.getTweet(0);
        assertEquals(returnedTweet.getMessage(), tweet.getMessage());
        assertEquals(returnedTweet.getDate(), tweet.getDate());

    }

    public void testDeleteTweet(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        tweets.addTweet(tweet);
        tweets.delete(tweet);
        assertFalse(tweets.hasTweet(tweet));
    }

    public void testGetCount(){
        TweetList tweets = new TweetList();
        NormalTweet tweet = new NormalTweet("some tweet");

        assertEquals(tweets.getCount(), 0);

        tweets.addTweet(tweet);
        assertEquals(tweets.getCount(), 1);
    }

    public void testGetTweets(){
        TweetList tweets = new TweetList();
        NormalTweet tweet1 = new NormalTweet("some tweet", new Date(1,1,2001));
        NormalTweet tweet2 = new NormalTweet("some other tweet", new Date(1,1,2002));

        tweets.addTweet(tweet2);
        tweets.addTweet(tweet1);

        ArrayList<NormalTweet> returnTweets = tweets.getTweets();
        assertEquals(returnTweets.get(0), tweet1);
        assertEquals(returnTweets.get(1), tweet2);
    }
}
