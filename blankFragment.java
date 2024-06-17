package com.speed.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class blankFragment extends Fragment {
/*
private static final String ARG1 ="argument1";
    private static final String ARG2 ="argument2";
*/



    public blankFragment() {
        // Required empty public constructor
    }

  /*  public static blankFragment getInstance(String value1,int value2){

        blankFragment bf = new blankFragment();
        Bundle bundle = new Bundle();
        bundle.putString(ARG1, value1);
        bundle.putInt(ARG2,value2);

        bf.setArguments(bundle);



}
        return bf;*/




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

      /*  if(getArguments()!=null){
            String name = getArguments().getString(ARG1);
            int rollNo = getArguments().getInt(ARG2);



           Log.d("Values from Act","Name is:"+name +",Roll No:"+rollNo);

            ((MainActivity)getActivity()).CallFromFragment();
        }*/
        View view =  inflater.inflate(R.layout.fragment_blank, container, false);
        TextView textView = view.findViewById(R.id.txtFrag);
        return view;
    }
}



