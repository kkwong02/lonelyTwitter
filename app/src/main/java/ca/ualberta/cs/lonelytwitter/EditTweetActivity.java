package ca.ualberta.cs.lonelytwitter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class EditTweetActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_tweet);
        Intent intent = getIntent();
        Tweet tweet = (Tweet) intent.getSerializableExtra("tweet");

        TextView textview = (TextView) findViewById(R.id.tweetDetails);
        java.text.DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");

        String date = dateFormat.format(tweet.getDate());

        String tweetFormat = String.format("Message: %s \n Date: %s", tweet.getMessage(), date);
        textview.setText(tweetFormat);
    }
}
