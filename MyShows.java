package com.ec327.chatterbox.chatterbox;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MyShows extends FragmentActivity {

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myshows);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_myshows, menu);
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
        }  else if (id == R.id.action_myActivity) {
            toMyActivity();
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

    //Moves to the Mainscreen activity.
    public void openForum(View view){
        Intent toMain = new Intent(this,Mainscreen.class);
        if(view.getId() == R.id.arrowbutton)
            toMain.addFlags(1);
        else if(view.getId() == R.id.darebutton)
            toMain.addFlags(2);
        else if(view.getId() == R.id.flashbutton)
            toMain.addFlags(3);
        else if(view.getId() == R.id.fobbutton)
            toMain.addFlags(4);
        else if(view.getId() == R.id.gotbutton)
            toMain.addFlags(5);
        else if(view.getId() == R.id.greybutton)
            toMain.addFlags(6);
        else if(view.getId() == R.id.hocbutton)
            toMain.addFlags(7);
        else if(view.getId() == R.id.madbutton)
            toMain.addFlags(8);
        else if(view.getId() == R.id.murderbutton)
            toMain.addFlags(9);
        else if(view.getId() == R.id.oncebutton)
            toMain.addFlags(10);
        else if(view.getId() == R.id.siliconbutton)
            toMain.addFlags(11);
        else if(view.getId() == R.id.the100button)
            toMain.addFlags(12);
        startActivity(toMain);
    }
}
