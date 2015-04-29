package com.ec327.chatterbox.chatterbox;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TabHost;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;

import java.util.ArrayList;
import java.util.List;

public class Mainscreen extends ListActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    ArrayList<Thread> threads;

    String showTitle;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainscreen);
        getActionBar().setDisplayHomeAsUpEnabled(true);

        //The show icon is displayed on the top.
        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        CurrentShow fragment = new CurrentShow();
        fragmentTransaction.add(R.id.main_showtitle, fragment);
        fragmentTransaction.commit();

        TabHost forums = (TabHost) findViewById(R.id.mainTabs);
        forums.setup();

        //Creates the format each tab button will show and displays the Episode tab.
        TabHost.TabSpec spec1 = forums.newTabSpec("tab1");
        spec1.setContent(R.id.main_episode);
        spec1.setIndicator("Episode");
        forums.addTab(spec1);

        //Creates the format each tab button will show and displays the Seasons tab.
        TabHost.TabSpec spec2 = forums.newTabSpec("tab2");
        spec2.setContent(R.id.main_season);
        spec2.setIndicator("Season");
        forums.addTab(spec2);

        //Creates the format each tab button will show and displays the Series tab.
        TabHost.TabSpec spec3 = forums.newTabSpec("tab3");
        spec3.setContent(R.id.main_series);
        spec3.setIndicator("Series");
        forums.addTab(spec3);

        threads = new ArrayList<>();
        ArrayAdapter<Thread> adapter = new ArrayAdapter<>(this, R.layout.main_thread_layout, threads);
        setListAdapter(adapter);

        refreshThreadList();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_mainscreen, menu);
        return super.onCreateOptionsMenu(menu);
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
        } else if (id == R.id.action_myActivity) {
            toMyActivity();
            return true;
        } else if (id == R.id.action_createThread){
            toCreateThread();
            return true;
        } else if(id == R.id.action_refresh){
            refreshThreadList();
            return true;
        } else if(id == android.R.id.home){
            toMyShows();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void toAddShows() {
        Intent intent = new Intent(this, AddShows.class);
        startActivity(intent);
    }

    private void toMyActivity() {
        Intent intent = new Intent(this,MyActivity.class);
        startActivity(intent);
    }

    private void toCreateThread() {
        Intent intent = new Intent(this,CreateThread.class);
        intent.addFlags(getIntent().getFlags());
        startActivity(intent);
    }

    private void toMyShows() {
        Intent intent = new Intent(this,MyShows.class);
        startActivity(intent);
    }

    private void refreshThreadList() {

        //This line of loop specifies which type of show the mainscreen is displaying and at the same time
        //specifies the parse query which type of show thread to receive from the cloud.
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

        ParseQuery<ParseObject> query = ParseQuery.getQuery(showTitle);
        query.findInBackground(new FindCallback<ParseObject>() {

            @Override
            public void done(List<ParseObject> threadList, ParseException e) {
                if (e == null) {
                    // If there are results, update the list of posts
                    // and notify the adapter
                    threads.clear();
                    for (ParseObject threadObject : threadList) {
                        Thread thread = new Thread(threadObject.getObjectId(), threadObject.getString("title"), threadObject.getString("season"), threadObject.getString("episode"), threadObject.getString("writer"), threadObject.getString("content"), threadObject.getString("comments"));
                        threads.add(thread);
                    }
                    ((ArrayAdapter<Thread>) getListAdapter()).notifyDataSetChanged();
                } else {
                    Log.d(getClass().getSimpleName(), "Error: " + e.getMessage());
                }
            }
        });
    }

    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        // Do something when a list item is clicked
        Intent intent = new Intent(this, ViewThread.class);
        Thread clicked = threads.get(position);
        String[] contents = {showTitle, clicked.getId()};
        intent.putExtra("Contents", contents);
        startActivity(intent);
    }
}