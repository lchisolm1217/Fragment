package com.example.quana.funwithfragment.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.quana.funwithfragment.R;

public class MainFragment extends Fragment {

    private View rootView;


    public MainFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_main, container, false);

        editText = (EditText) rootView.findViewById(R.id.main_fragment_editext);

        Button button01 = (Button) rootView.findViewById(R.id.fragment_01_button);
        Button button02 = (Button) rootView.findViewById(R.id.fragment_02_button);
        Button button03 = (Button) rootView.findViewById(R.id.fragment_01_button);
        Button button04 = (Button) rootView.findViewById(R.id.fragment_01_button);
        Button button05 = (Button) rootView.findViewById(R.id.fragment_01_button);

        button01.setOnClickListener(new View.onClickListener() {
            @Override
            public void onClick(View view) {
                Fragment01 fragment01 = new Fragment01();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                String textFromEditText = editText.getText().toString();

                Bundle bundle = new Bundle();
                bundle.getString();

            }
        }
    }

}
