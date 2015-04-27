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

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.myshows);

        if (savedInstanceState == null) {

            fragmentManager = getFragmentManager();
            fragmentTransaction = fragmentManager.beginTransaction();

            if (getIntent().hasExtra("Choices")){

                Arrow fragment = new Arrow();
                fragmentTransaction.remove(fragment);

                Daredevil daredevil = new Daredevil();
                fragmentTransaction.remove(daredevil);

                Flash flash = new Flash();
                fragmentTransaction.remove(flash);

                FOB fob = new FOB();
                fragmentTransaction.remove(fob);

                GameOfThrones gameOfThrones = new GameOfThrones();
                fragmentTransaction.remove(gameOfThrones);

                GreysAnatomy greysAnatomy = new GreysAnatomy();
                fragmentTransaction.remove(greysAnatomy);

                HouseOfCards houseOfCards = new HouseOfCards();
                fragmentTransaction.remove(houseOfCards);

                MadMen madMen = new MadMen();
                fragmentTransaction.remove(madMen);

                Murder murder = new Murder();
                fragmentTransaction.remove(murder);

                OnceUponATime onceUponATime = new OnceUponATime();
                fragmentTransaction.remove(onceUponATime);

                SiliconValley siliconValley = new SiliconValley();
                fragmentTransaction.remove(siliconValley);

                The100 the100 = new The100();
                fragmentTransaction.remove(the100);

                ArrayList<Integer> std = getIntent().getIntegerArrayListExtra("Choices");
                int[] listOfFrames = {R.id.myshows_GOT,R.id.myshows_greysAnatomy,R.id.myshows_daredevil,R.id.myshows_flash,R.id.myshows_100,R.id.myshows_once,R.id.myshows_FOB,R.id.myshows_htgawm,R.id.myshows_silliconValley,R.id.myshows_madmen,R.id.myshows_HOC,R.id.myshows_arrow};
                int index = 11;

                    if (std.contains(1)) {
                        fragmentTransaction.add(listOfFrames[index], fragment);
                        index--;
                    }
                    if (std.contains(2)) {
                        fragmentTransaction.add(listOfFrames[index], daredevil);
                        index--;
                    }
                    if (std.contains(3)) {
                        fragmentTransaction.add(listOfFrames[index], flash);
                        index--;
                    }
                    if (std.contains(4)){
                        fragmentTransaction.add(listOfFrames[index], fob);
                        index--;
                    }
                    if (std.contains(5)){
                        fragmentTransaction.add(listOfFrames[index], gameOfThrones);
                        index--;
                    }
                    if (std.contains(6)){
                        fragmentTransaction.add(listOfFrames[index], greysAnatomy);
                        index--;
                    }
                    if (std.contains(7)){
                        fragmentTransaction.add(listOfFrames[index], houseOfCards);
                        index--;
                    }
                    if (std.contains(8)){
                        fragmentTransaction.add(listOfFrames[index], madMen);
                        index--;
                    }
                    if (std.contains(9)){
                        fragmentTransaction.add(listOfFrames[index], murder);
                        index--;
                    }
                    if (std.contains(10)){
                        fragmentTransaction.add(listOfFrames[index], onceUponATime);
                        index--;
                    }
                    if (std.contains(11)){
                        fragmentTransaction.add(listOfFrames[index], siliconValley);
                        index--;
                    }
                    if (std.contains(12)){
                        fragmentTransaction.add(listOfFrames[index], the100);
                        index--;
                    }

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

                return;
            }

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
/*
    @Override
    public void onResume(){
        super.onResume();

        if(getIntent().hasExtra("Choices")) {
            if(getIntent().getIntArrayExtra("Choices").length>0) {
                fragmentManager = getFragmentManager();
                fragmentTransaction = fragmentManager.beginTransaction();

                Arrow fragment = new Arrow();
                fragmentTransaction.remove(fragment);

                Daredevil daredevil = new Daredevil();
                fragmentTransaction.remove(daredevil);

                Flash flash = new Flash();
                fragmentTransaction.remove(flash);

                FOB fob = new FOB();
                fragmentTransaction.remove(fob);

                GameOfThrones gameOfThrones = new GameOfThrones();
                fragmentTransaction.remove(gameOfThrones);

                GreysAnatomy greysAnatomy = new GreysAnatomy();
                fragmentTransaction.remove(greysAnatomy);

                HouseOfCards houseOfCards = new HouseOfCards();
                fragmentTransaction.remove(houseOfCards);

                MadMen madMen = new MadMen();
                fragmentTransaction.remove(madMen);

                Murder murder = new Murder();
                fragmentTransaction.remove(murder);

                OnceUponATime onceUponATime = new OnceUponATime();
                fragmentTransaction.remove(onceUponATime);

                SiliconValley siliconValley = new SiliconValley();
                fragmentTransaction.remove(siliconValley);

                The100 the100 = new The100();
                fragmentTransaction.remove(the100);

                int[] std = getIntent().getIntArrayExtra("Choices");

                for (int i = 0; i < std.length; i++) {
                    if (std[i] == 1)
                        fragmentTransaction.add(R.id.myshows_arrow, fragment);
                    if (std[i] == 2)
                        fragmentTransaction.add(R.id.myshows_daredevil, daredevil);
                    if (std[i] == 3)
                        fragmentTransaction.add(R.id.myshows_flash, flash);
                    if (std[i] == 4)
                        fragmentTransaction.add(R.id.myshows_FOB, fob);
                    if (std[i] == 5)
                        fragmentTransaction.add(R.id.myshows_GOT, gameOfThrones);
                    if (std[i] == 6)
                        fragmentTransaction.add(R.id.myshows_greysAnatomy, greysAnatomy);
                    if (std[i] == 7)
                        fragmentTransaction.add(R.id.myshows_HOC, houseOfCards);
                    if (std[i] == 8)
                        fragmentTransaction.add(R.id.myshows_madmen, madMen);
                    if (std[i] == 9)
                        fragmentTransaction.add(R.id.myshows_htgawm, murder);
                    if (std[i] == 10)
                        fragmentTransaction.add(R.id.myshows_once, onceUponATime);
                    if (std[i] == 11)
                        fragmentTransaction.add(R.id.myshows_silliconValley, siliconValley);
                    if (std[i] == 12)
                        fragmentTransaction.add(R.id.myshows_100, the100);
                }
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        }

    }
*/
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
