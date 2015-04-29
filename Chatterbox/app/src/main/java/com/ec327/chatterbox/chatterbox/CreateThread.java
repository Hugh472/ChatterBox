package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseUser;


public class CreateThread extends Activity {

    private EditText titleEditText;
    private EditText seasonEditText;
    private EditText episodeEditText;
    private EditText contentEditText;
    private String showTitle;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createthread);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        titleEditText = (EditText) findViewById(R.id.thread_title_input);
        seasonEditText = (EditText) findViewById(R.id.thread_season_input);
        episodeEditText = (EditText) findViewById(R.id.thread_episode_input);
        contentEditText = (EditText) findViewById(R.id.thread_content_input);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == android.R.id.home){
            toMainscreen();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void toMainscreen() {
        Intent intent = new Intent(this,Mainscreen.class);
        intent.addFlags(getIntent().getFlags());
        startActivity(intent);
    }

    public void postThread(View view) {

        String postTitle = titleEditText.getText().toString().trim();
        String postSeason = seasonEditText.getText().toString().trim();
        String postEpisode = episodeEditText.getText().toString().trim();
        String postWriter = ParseUser.getCurrentUser().getUsername().trim();
        String postContent = contentEditText.getText().toString().trim();

        //This line of loop specifies which type of show the Mainscreen is displaying and at the same time
        //specifies the show the user is creating the thread for.
        if (getIntent().getFlags() == 1)
            showTitle = "Arrow_Thread";
        else if (getIntent().getFlags() == 2)
            showTitle = "Daredevil_Thread";
        else if (getIntent().getFlags() == 3)
            showTitle = "Flash_Thread";
        else if (getIntent().getFlags()==4)
            showTitle = "FOB_Thread";
        else if (getIntent().getFlags()==5)
            showTitle = "Game_of_Thrones_Thread";
        else if (getIntent().getFlags()==6)
            showTitle = "Greys_Anatomy_Thread";
        else if (getIntent().getFlags()==7)
            showTitle = "House_of_Cards_Thread";
        else if (getIntent().getFlags()==8)
            showTitle = "Madmen_Thread";
        else if (getIntent().getFlags()==9)
            showTitle = "How_to_Get_Away_With_Murder_Thread";
        else if (getIntent().getFlags()==10)
            showTitle = "Once_Upon_A_Time_Thread";
        else if (getIntent().getFlags()==11)
            showTitle = "Silicon_Valley_Thread";
        else if (getIntent().getFlags()==12)
            showTitle = "The_100_Thread";

        if (postTitle.isEmpty() || postContent.isEmpty() || postEpisode.isEmpty() || postSeason.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(CreateThread.this);
            builder.setMessage(R.string.login_error_message)
                    .setTitle(R.string.login_error_title)
                    .setPositiveButton(android.R.string.ok, null);
            AlertDialog dialog = builder.create();
            dialog.show();
            return;
        }

        ParseObject newThread = new ParseObject(showTitle);
        newThread.put("title", postTitle);
        newThread.put("season", postSeason);
        newThread.put("episode", postEpisode);
        newThread.put("writer", postWriter);
        newThread.put("content", postContent);
        newThread.put("comments", "");
        newThread.saveInBackground();

        ParseObject newUserThread = new ParseObject("My_Activity_"+ParseUser.getCurrentUser().getUsername());
        newUserThread.put("title", postTitle);
        newUserThread.put("season", postSeason);
        newUserThread.put("episode", postEpisode);
        newUserThread.put("writer", postWriter);
        newUserThread.put("content", postContent);
        newUserThread.put("coments", "");
        newUserThread.saveInBackground();

        Intent intent = new Intent(this,Mainscreen.class);
        intent.addFlags(getIntent().getFlags());
        startActivity(intent);
    }
}