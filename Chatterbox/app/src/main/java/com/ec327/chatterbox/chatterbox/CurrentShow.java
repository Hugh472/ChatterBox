package com.ec327.chatterbox.chatterbox;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class CurrentShow extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View setFragment;

        //This fragment is the show icon fragment for the Mainscreen activity.
        //The fragment gets the Flag info sent from the MyShows activity and figures out which show
        //the user clicked.
        if(super.getActivity().getIntent().getFlags() == 1) {
            setFragment = inflater.inflate(R.layout.display_arrow, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 2){
            setFragment = inflater.inflate(R.layout.display_daredevil, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 3){
            setFragment = inflater.inflate(R.layout.display_flash, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 4){
            setFragment = inflater.inflate(R.layout.display_fob, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 5){
            setFragment = inflater.inflate(R.layout.display_got, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 6){
            setFragment = inflater.inflate(R.layout.display_grey, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 7){
            setFragment = inflater.inflate(R.layout.display_hoc, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 8){
            setFragment = inflater.inflate(R.layout.display_madmen, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 9){
            setFragment = inflater.inflate(R.layout.display_murder, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 10){
            setFragment = inflater.inflate(R.layout.display_once, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 11){
            setFragment = inflater.inflate(R.layout.display_silicon, container, false);
        }else{
            setFragment = inflater.inflate(R.layout.display_the100, container, false);
        }

        return setFragment;
    }

}