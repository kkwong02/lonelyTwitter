package ca.ualberta.cs.lonelytwitter;

import java.util.Comparator;

/**
 * Created by kskwong on 2/16/17.
 *
 * Taken from http://stackoverflow.com/questions/2784514/sort-arraylist-of-custom-objects-by-property
 * Feb 16 2017
 */

public class TweetComparator implements Comparator<Tweet> {

    public int compare(Tweet t1, Tweet t2) {
        return t1.getDate().compareTo(t2.getDate());
    }
}
