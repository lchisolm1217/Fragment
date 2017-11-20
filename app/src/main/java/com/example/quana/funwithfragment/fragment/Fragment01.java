package com.example.quana.funwithfragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.quana.funwithfragment.R;

public class Fragment01 extends Fragment {

    private TextView textView;

    private View rootView;

        public Fragment01() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_fragment01, container, false);
        textView = (TextView) rootView.findViewById(R.id.fragment01_textview);

        Bundle bundle = getArguments();
        String textFromEditText = bundle.getString("text", "Nothing passed");
        textView.setText(textFromEditText);


        return rootView;
    }

}
