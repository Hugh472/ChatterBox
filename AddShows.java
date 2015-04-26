package com.ec327.chatterbox.chatterbox;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class AddShows extends Activity {

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addshows);

        fragmentManager = getFragmentManager();
    }

    /* This function is called in response to the 'done' button of the AddShows activity.
    * It basically returns the user to the  'Shows' screen, but in contrast to the back button
    * or the 'up' button, this function implements the change made in the list of shows to add.*/
    public void addShowsToList(View view){
        Intent toMyShows = new Intent(this, MyShows.class);


        startActivity(toMyShows);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_addshows, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_myActivity) {
            toMyActivity();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
/*
    public void addGOT(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            GameOfThrones fragment = new GameOfThrones();
            fragmentTransaction.add(R.id.myshows_GOT, fragment);
        }else{
            GameOfThrones fragment = new GameOfThrones();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addGreysAnatomy(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            GreysAnatomy fragment = new GreysAnatomy();
            fragmentTransaction.add(R.id.myshows_greysAnatomy, fragment);
        }else{
            GreysAnatomy fragment = new GreysAnatomy();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addDaredevil(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            Daredevil fragment = new Daredevil();
            fragmentTransaction.add(R.id.myshows_daredevil, fragment);
        }else{
            Daredevil fragment = new Daredevil();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addFlash(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            Flash fragment = new Flash();
            fragmentTransaction.add(R.id.myshows_flash, fragment);
        }else{
            Flash fragment = new Flash();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void add100(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            The100 fragment = new The100();
            fragmentTransaction.add(R.id.myshows_100, fragment);
        }else{
            The100 fragment = new The100();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addOnce(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            OnceUponATime fragment = new OnceUponATime();
            fragmentTransaction.add(R.id.myshows_once, fragment);
        }else{
            OnceUponATime fragment = new OnceUponATime();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addFOB(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            FOB fragment = new FOB();
            fragmentTransaction.add(R.id.myshows_FOB, fragment);
        }else{
            FOB fragment = new FOB();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addMurder(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            Murder fragment = new Murder();
            fragmentTransaction.add(R.id.myshows_htgawm, fragment);
        }else{
            Murder fragment = new Murder();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addSilicon(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            SiliconValley fragment = new SiliconValley();
            fragmentTransaction.add(R.id.myshows_silliconValley, fragment);
        }else{
            SiliconValley fragment = new SiliconValley();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addMad(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            MadMen fragment = new MadMen();
            fragmentTransaction.add(R.id.myshows_madmen, fragment);
        }else{
            MadMen fragment = new MadMen();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addHOC(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            HouseOfCards fragment = new HouseOfCards();
            fragmentTransaction.add(R.id.myshows_HOC, fragment);
        }else{
            HouseOfCards fragment = new HouseOfCards();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    public void addArrow(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        fragmentTransaction = fragmentManager.beginTransaction();

        if (checked){
            Arrow fragment = new Arrow();
            fragmentTransaction.add(R.id.myshows_arrow, fragment);
        }else{
            Arrow fragment = new Arrow();
            fragmentTransaction.remove(fragment);
        }
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }*/

    /* This function brings the user to the MyActivity Activity*/
    private void toMyActivity() {
        Intent intent = new Intent(this,MyActivity.class);
        startActivity(intent);
    }
}
