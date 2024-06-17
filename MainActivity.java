package com.speed.fragment;

import static java.util.Locale.ROOT;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.provider.DocumentsContract;
import android.sax.RootElement;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnFragA, btnFragB, btnFragC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFragA = findViewById(R.id.btnFragA);
        btnFragB = findViewById(R.id.btnFragB);
        btnFragC = findViewById(R.id.btnFragC);

        loadFrag(new blankFragment(),0);

        btnFragA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                loadFrag(new blankFragment(), 0);

            }
        });

        btnFragB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new BlankFragment2(), 1);
                //default fragment;
            }
        });

        btnFragC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadFrag(new cfragment(), 1);
            }
        });

/*
        public void loadFrag (Fragment fragment,int flag){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();



                  *//*   Bundle bundle = new Bundle();
                     bundle.putString("Arg1","Raman");
                     bundle.putInt("Arg2",7);

                     fragment.setArguments(bundle);
*//*

            if (flag == 0)
                ft.add(R.id.Container, fragment);
            else
                ft.replace(R.id.Container, fragment);

            ft.commit();*/
        }
        public void loadFrag (Fragment fragment,int flag){
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();





                   /* Bundle bundle = new Bundle();
                     bundle.putString("Arg1","Raman");
                     bundle.putInt("Arg2",7);

                     fragment.setArguments(bundle);*/



            if (flag == 0){
                ft.add(R.id.Container, fragment);
                fm.popBackStack(1,FragmentManager.POP_BACK_STACK_INCLUSIVE);


            }
            else {
                ft.addToBackStack(null);


                ft.replace(R.id.Container, fragment);
            }


            //use for see the previous fragment



            ft.commit();




    }
  /*  public void CallFromFragment(){
        Log.d("inAct","fromFragment");

    }*/

}
