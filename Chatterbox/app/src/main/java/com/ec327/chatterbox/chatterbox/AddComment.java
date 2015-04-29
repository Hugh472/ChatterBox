package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.parse.GetCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

public class AddComment extends Activity {

    private EditText comment;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_comment);

        comment = (EditText) findViewById(R.id.comment_content_input);
    }

    public void postComment(View view) {

        String commentWriter = ParseUser.getCurrentUser().getUsername().trim();
        final String commentContent = "\n[" + commentWriter + "] \n" + comment.getText().toString().trim();

        if (commentContent.isEmpty()) {
            AlertDialog.Builder builder = new AlertDialog.Builder(AddComment.this);
            builder.setMessage(R.string.login_error_message)
                    .setTitle(R.string.login_error_title)
                    .setPositiveButton(android.R.string.ok, null);
            AlertDialog dialog = builder.create();
            dialog.show();
            return;
        }

        String[] post = getIntent().getStringArrayExtra("Contents");

        ParseQuery<ParseObject> query = ParseQuery.getQuery(post[0]);
        query.getInBackground(post[1], new GetCallback<ParseObject>() {

            @Override
            public void done(ParseObject object, ParseException e) {
                if(e==null) {
                    // object will be your thread
                    object.add("comments", commentContent);
                }  else {
                    Log.d(getClass().getSimpleName(), "Error: " + e.getMessage());
                }
            }
        });

        Intent intent = new Intent(this,ViewThread.class);
        intent.putExtra("Contents", getIntent().getStringArrayExtra("Contents"));
        startActivity(intent);
    }
}