package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * This is an abstract class that stores the user's mood. The class provides methods that allow
 * the creation and modification of the date of the mood.
 *
 * @see Happy
 * @see Sad
 * Created by kirsten on 1/19/17.
 */

public abstract class Mood {
    private Date date;

    public Mood() {
        this.date = new Date();
    }

    public Mood(Date date){
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract String showMood();
}
