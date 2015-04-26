package com.ec327.chatterbox.chatterbox;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Arrow extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View buttonArrow = inflater.inflate(R.layout.button_arrow,container,false);
        return buttonArrow;
    }
}