package com.ec327.chatterbox.chatterbox;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends ListActivity {

    ArrayList<Thread> threads;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myactivity);

        threads = new ArrayList<>();
        ArrayAdapter<Thread> adapter = new ArrayAdapter<>(this, R.layout.list_item_layout, threads);
        setListAdapter(adapter);

        refreshThreadList();
    }
    private void loadLoginView() {
        Intent intent = new Intent(this, Login.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_myactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_addShows) {
            toAddShows();
            return true;
        } else if (id == R.id.action_myShows) {
            toMyShows();
            return true;
        } else if(id == R.id.action_refresh){
            refreshThreadList();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void toAddShows() {
        Intent intent = new Intent(this,AddShows.class);
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    private void toMyShows() {
        Intent intent = new Intent(this,MyShows.class);
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    private void refreshThreadList() {

        ParseQuery<ParseObject> query = ParseQuery.getQuery(ParseUser.getCurrentUser().toString());
        query.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> threadList, ParseException e) {
                if (e == null) {
                    // If there are results, update the list of posts
                    // and notify the adapter
                    threads.clear();
                    for (ParseObject threadObject : threadList) {
                        Thread thread = new Thread(threadObject.getObjectId(), threadObject.getString("title"));
                        threads.add(thread);
                    }
                    ((ArrayAdapter<Thread>) getListAdapter()).notifyDataSetChanged();
                } else {
                    Log.d(getClass().getSimpleName(), "Error: " + e.getMessage());
                }
            }
        });
    }
}
