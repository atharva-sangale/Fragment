package com.speed.fragment;

import static android.widget.Toast.LENGTH_LONG;

import static com.speed.fragment.R.string.StringA;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment2 extends Fragment {

    public BlankFragment2() {
        // Required empty public constructor
    }


   @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
         return inflater.inflate(R.layout.fragment_blank2, container, false);

    }

 /*   Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    int flag = 0;
    int count = 0;
    String b1, b2, b3, b4, b5, b6, b7, b8, b9;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();


    }*/

 /*   private void setContentView(int activity_main) {

    }


    private void init() {
        btn1 = btn1.findViewById(R.id.btn1);
        btn2 = btn2.findViewById(R.id.btn2);
        btn3 = btn3.findViewById(R.id.btn3);
        btn4 = btn4.findViewById(R.id.btn4);
        btn5 = btn5.findViewById(R.id.btn5);
        btn6 = btn6.findViewById(R.id.btn6);
        btn7 = btn7.findViewById(R.id.btn7);
        btn8 = btn8.findViewById(R.id.btn8);
        btn9 = btn9.findViewById(R.id.btn9);

    }

    public void Check(View V) {
        Button btnCurrent = (Button) V;

        if (btnCurrent.getText().toString().equals("")) {

            count++;


            if (flag == 0) {
                btnCurrent.setText("X");
                flag = 1;
            } else {
                btnCurrent.setText("O");
                flag = 0;
            }

            if (count > 4) {

                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
*/
                //Conditions

           /*     if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    //1
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_LONG).show();
                }
                else if (b4.equals(b5) && b5.equals(b6) && !b5.equals("")) {
                    //2
                    Toast.makeText(this, "Winner is: " + b4, Toast.LENGTH_LONG).show();
                }
                else if (b7.equals(b8) && b8.equals(b9) && !b8.equals("")) {
                    //3
                    Toast.makeText(this, "Winner is: " + b7, Toast.LENGTH_LONG).show();
                }
                else if (b1.equals(b4) && b4.equals(b7) && !b4.equals("")) {
                    //4
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_LONG).show();
                }
                else if (b2.equals(b5) && b5.equals(b8) && !b5.equals("")) {
                    //5
                    Toast.makeText(this, "Winner is: " + b5, Toast.LENGTH_LONG).show();
                }else if (b3.equals(b6) && b6.equals(b9) && !b6.equals("")) {
                    //6
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_LONG).show();
                } else if (b1.equals(b5) && b5.equals(b9) && !b5.equals("")) {
                    //7
                    Toast.makeText(this, "Winner is: " + b1, Toast.LENGTH_LONG).show();
                } else if (b3.equals(b5) && b5.equals(b7) && !b5.equals("")) {
                    //8
                    Toast.makeText(this, "Winner is: " + b3, Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(this,"No Winner:" ,Toast.LENGTH_LONG).show();
                }
*/

            }







