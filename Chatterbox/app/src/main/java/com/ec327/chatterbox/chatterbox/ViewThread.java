package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

/**
 * Created by Mason D. Hahn on 4/27/2015.
 */
public class ViewThread extends Activity{

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewthread);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_viewthread, menu);
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
        } else if (id == R.id.action_myShows){
            toMyShows();
            return true;
        } else if(id == android.R.id.home){
            toMainscreen();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void toAddShows() {
        Intent intent = new Intent(this, AddShows.class);
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    private void toMyActivity() {
        Intent intent = new Intent(this,MyActivity.class);
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    private void toMyShows() {
        Intent intent = new Intent(this,MyShows.class);
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }

    private void toMainscreen() {
        Intent intent = new Intent(this,Mainscreen.class);
        intent.addFlags(getIntent().getFlags());
        intent.putIntegerArrayListExtra("Choices",getIntent().getIntegerArrayListExtra("Choices"));
        startActivity(intent);
    }
}
