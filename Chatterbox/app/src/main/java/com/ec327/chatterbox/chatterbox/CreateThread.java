package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.parse.ParseObject;
import com.parse.ParseUser;


public class CreateThread extends Activity {

    private EditText titleEditText;
    private EditText seasonEditText;
    private EditText contentEditText;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.createthread);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        titleEditText = (EditText) findViewById(R.id.thread_title_input);
        seasonEditText = (EditText) findViewById(R.id.thread_season_input);
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
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    public void postThread(View view) {

        String postTitle = titleEditText.getText().toString();
        String postSeason = seasonEditText.getText().toString();
        String postContent = contentEditText.getText().toString();

        postTitle = postTitle.trim();
        postSeason = postSeason.trim();
        postContent = postContent.trim();

        ParseObject newThread = new ParseObject("Thread");
        newThread.put("title", postTitle);
        newThread.put("season", postSeason);
        newThread.put("content", postContent);
        newThread.saveInBackground();

        String currentUserNickname = ParseUser.getCurrentUser().toString();

        ParseObject newUserThread = new ParseObject(currentUserNickname);
        newUserThread.put("title", postTitle);
        newUserThread.put("season", postSeason);
        newUserThread.put("content", postContent);
        newUserThread.saveInBackground();

        Intent intent = new Intent(this,Mainscreen.class);
        intent.addFlags(getIntent().getFlags());
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }
}