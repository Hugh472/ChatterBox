package com.ec327.chatterbox.chatterbox;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MyShows extends FragmentActivity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    ArrayList<Integer> std;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myshows);

        fragmentManager = getFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        int[] listOfFrames = {R.id.myshows_GOT, R.id.myshows_greysAnatomy, R.id.myshows_daredevil, R.id.myshows_flash, R.id.myshows_100,
                R.id.myshows_once, R.id.myshows_FOB, R.id.myshows_htgawm, R.id.myshows_silliconValley, R.id.myshows_madmen, R.id.myshows_HOC,
                R.id.myshows_arrow};

        Arrow fragment = new Arrow();
        Daredevil daredevil = new Daredevil();
        Flash flash = new Flash();
        FOB fob = new FOB();
        GameOfThrones gameOfThrones = new GameOfThrones();
        GreysAnatomy greysAnatomy = new GreysAnatomy();
        HouseOfCards houseOfCards = new HouseOfCards();
        MadMen madMen = new MadMen();
        Murder murder = new Murder();
        OnceUponATime onceUponATime = new OnceUponATime();
        SiliconValley siliconValley = new SiliconValley();
        The100 the100 = new The100();

        if (getIntent().hasExtra("Choices")) { //Creates the updated list of shows if addShows updates list.
            fragmentTransaction.remove(fragment);
            fragmentTransaction.remove(daredevil);
            fragmentTransaction.remove(flash);
            fragmentTransaction.remove(fob);
            fragmentTransaction.remove(gameOfThrones);
            fragmentTransaction.remove(greysAnatomy);
            fragmentTransaction.remove(houseOfCards);
            fragmentTransaction.remove(madMen);
            fragmentTransaction.remove(murder);
            fragmentTransaction.remove(onceUponATime);
            fragmentTransaction.remove(siliconValley);
            fragmentTransaction.remove(the100);

            std = getIntent().getIntegerArrayListExtra("Choices");
            int index = 0;

            if (std.contains(5)) {
                fragmentTransaction.add(listOfFrames[index], gameOfThrones);
                index++;
            }
            if (std.contains(6)) {
                fragmentTransaction.add(listOfFrames[index], greysAnatomy);
                index++;
            }
            if (std.contains(2)) {
                fragmentTransaction.add(listOfFrames[index], daredevil);
                index++;
            }
            if (std.contains(3)) {
                fragmentTransaction.add(listOfFrames[index], flash);
                index++;
            }
            if (std.contains(12)) {
                fragmentTransaction.add(listOfFrames[index], the100);
                index++;
            }
            if (std.contains(10)) {
                fragmentTransaction.add(listOfFrames[index], onceUponATime);
                index++;
            }
            if (std.contains(4)) {
                fragmentTransaction.add(listOfFrames[index], fob);
                index++;
            }
            if (std.contains(9)) {
                fragmentTransaction.add(listOfFrames[index], murder);
                index++;
            }
            if (std.contains(11)) {
                fragmentTransaction.add(listOfFrames[index], siliconValley);
                index++;
            }
            if (std.contains(8)) {
                fragmentTransaction.add(listOfFrames[index], madMen);
                index++;
            }
            if (std.contains(7)) {
                fragmentTransaction.add(listOfFrames[index], houseOfCards);
                index++;
            }
            if (std.contains(1)) {
                fragmentTransaction.add(listOfFrames[index], fragment);
            }

            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        } else { //Creates all list of shows if this screen is initializing not through the addshows screen.

            std = new ArrayList<>(12);

            Integer Flash = 3;
            std.add(Flash);
            Integer Dare = 2;
            std.add(Dare);
            Integer GOT = 5;
            std.add(GOT);
            Integer FOB = 4;
            std.add(FOB);
            Integer Grey = 6;
            std.add(Grey);
            Integer Arrow = 1;
            std.add(Arrow);
            Integer Murder = 9;
            std.add(Murder);
            Integer HOC = 7;
            std.add(HOC);
            Integer Mad = 8;
            std.add(Mad);
            Integer Once = 10;
            std.add(Once);
            Integer SV = 11;
            std.add(SV);
            Integer The100 = 12;
            std.add(The100);

            fragmentTransaction.add(R.id.myshows_arrow, fragment);
            fragmentTransaction.add(R.id.myshows_daredevil, daredevil);
            fragmentTransaction.add(R.id.myshows_flash, flash);
            fragmentTransaction.add(R.id.myshows_FOB, fob);
            fragmentTransaction.add(R.id.myshows_GOT, gameOfThrones);
            fragmentTransaction.add(R.id.myshows_greysAnatomy, greysAnatomy);
            fragmentTransaction.add(R.id.myshows_HOC, houseOfCards);
            fragmentTransaction.add(R.id.myshows_madmen, madMen);
            fragmentTransaction.add(R.id.myshows_htgawm, murder);
            fragmentTransaction.add(R.id.myshows_once, onceUponATime);
            fragmentTransaction.add(R.id.myshows_silliconValley, siliconValley);
            fragmentTransaction.add(R.id.myshows_100, the100);
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
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
        } else if (id == R.id.action_myActivity) {
            toMyActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void toAddShows() {
        Intent intent = new Intent(this, AddShows.class);
        intent.putIntegerArrayListExtra("Choices",std);
        startActivity(intent);
    }

    private void toMyActivity() {
        Intent intent = new Intent(this, MyActivity.class);
        intent.putIntegerArrayListExtra("Choices",std);
        startActivity(intent);
    }

    //Moves to the Mainscreen activity.
    public void openForum(View view) {
        Intent toMain = new Intent(this, Mainscreen.class);
        if (view.getId() == R.id.arrowbutton)
            toMain.addFlags(1);
        else if (view.getId() == R.id.darebutton)
            toMain.addFlags(2);
        else if (view.getId() == R.id.flashbutton)
            toMain.addFlags(3);
        else if (view.getId() == R.id.fobbutton)
            toMain.addFlags(4);
        else if (view.getId() == R.id.gotbutton)
            toMain.addFlags(5);
        else if (view.getId() == R.id.greybutton)
            toMain.addFlags(6);
        else if (view.getId() == R.id.hocbutton)
            toMain.addFlags(7);
        else if (view.getId() == R.id.madbutton)
            toMain.addFlags(8);
        else if (view.getId() == R.id.murderbutton)
            toMain.addFlags(9);
        else if (view.getId() == R.id.oncebutton)
            toMain.addFlags(10);
        else if (view.getId() == R.id.siliconbutton)
            toMain.addFlags(11);
        else if (view.getId() == R.id.the100button)
            toMain.addFlags(12);
        toMain.putIntegerArrayListExtra("Choices",std);
        startActivity(toMain);
    }
}