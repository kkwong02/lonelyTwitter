package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

/**
 * Created by kirsten on 2/16/17.
 */

public class TweetList {
    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    public void add(Tweet tweet){
        tweets.add(tweet);
    }

    public boolean hasTweet(Tweet tweet){
        return tweets.contains(tweet);

    }
}
