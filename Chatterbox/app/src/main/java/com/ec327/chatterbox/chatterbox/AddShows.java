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

import java.util.ArrayList;

public class AddShows extends Activity {

    Intent toMyShows;
    String choices;
    ArrayList<Integer> check;

    /* This is the Constructor in context of Java for the Android app. */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addshows);

        toMyShows = new Intent(this, MyShows.class);
        choices = "Choices";
        check = new ArrayList<Integer>(12);
    }

    /* This function is called in response to the 'done' button of the AddShows activity.
    * It basically returns the user to the  'Shows' screen, but in contrast to the back button
    * or the 'up' button, this function implements the change made in the list of shows to add.*/
    public void addShowsToList(View view){
        toMyShows.putIntegerArrayListExtra(choices,check);
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

    public void addGOT(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer GOT = 5;

        if (checked){
            check.add(GOT);
        }else{
            check.remove(check.indexOf(GOT));
        }
    }

    public void addGreysAnatomy(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Grey = 6;

        if (checked){
            check.add(Grey);
        }else{
            check.remove(check.indexOf(Grey));
        }
    }

    public void addDaredevil(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Dare = 2;

        if (checked){
            check.add(Dare);
        }else{
            check.remove(check.indexOf(Dare));
        }
    }

    public void addFlash(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Flash = 3;

        if (checked){
            check.add(Flash);
        }else{
            check.remove(check.indexOf(Flash));
        }
    }

    public void add100(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer The100 = 12;

        if (checked){
            check.add(The100);
        }else{
            check.remove(check.indexOf(The100));
        }
    }

    public void addOnce(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Once = 10;

        if (checked){
            check.add(Once);
        }else{
            check.remove(check.indexOf(Once));
        }
    }

    public void addFOB(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer FOB = 4;

        if (checked){
            check.add(FOB);
        }else{
            check.remove(check.indexOf(FOB));
        }
    }

    public void addMurder(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Murder = 9;

        if (checked){
            check.add(Murder);
        }else{
            check.remove(check.indexOf(Murder));
        }
    }

    public void addSilicon(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer SV = 11;

        if (checked){
            check.add(SV);
        }else{
            check.remove(check.indexOf(SV));
        }
    }

    public void addMad(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Mad = 8;

        if (checked){
            check.add(Mad);
        }else{
            check.remove(check.indexOf(Mad));
        }
    }

    public void addHOC(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer HOC = 7;

        if (checked){
            check.add(HOC);
        }else{
            check.remove(check.indexOf(HOC));
        }
    }

    public void addArrow(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();
        Integer Arrow = 1;

        if (checked){
            check.add(Arrow);
        }else{
            check.remove(check.indexOf(Arrow));
        }
    }

    /* This function brings the user to the MyActivity Activity*/
    private void toMyActivity() {
        Intent intent = new Intent(this,MyActivity.class);
        startActivity(intent);
    }
}
