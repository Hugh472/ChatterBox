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

        if(super.getActivity().getIntent().getFlags() == 1) {
            setFragment = inflater.inflate(R.layout.button_arrow, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 2){
            setFragment = inflater.inflate(R.layout.button_daredevil, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 3){
            setFragment = inflater.inflate(R.layout.button_flash, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 4){
            setFragment = inflater.inflate(R.layout.button_fob, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 5){
            setFragment = inflater.inflate(R.layout.button_got, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 6){
            setFragment = inflater.inflate(R.layout.button_grey, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 7){
            setFragment = inflater.inflate(R.layout.button_hoc, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 8){
            setFragment = inflater.inflate(R.layout.button_madmen, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 9){
            setFragment = inflater.inflate(R.layout.button_murder, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 10){
            setFragment = inflater.inflate(R.layout.button_once, container, false);
        }else if(super.getActivity().getIntent().getFlags() == 11){
            setFragment = inflater.inflate(R.layout.button_silicon, container, false);
        }else{
            setFragment = inflater.inflate(R.layout.button_the100, container, false);
        }

        return setFragment;
    }

}