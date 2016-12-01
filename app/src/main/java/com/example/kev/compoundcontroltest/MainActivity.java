package com.example.kev.compoundcontroltest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.kev.compoundcontroltest.compoundComponents.SideSpinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        // Initializes the side spinner from code.
//        SideSpinner fruitsSpinner;
//        fruitsSpinner = (SideSpinner)this.findViewById(R.id.sidespinner_fruits);
//
//        CharSequence fruitList[] = { "Apple",
//                "Orange",
//                "Pear",
//                "Grapes" };
//        fruitsSpinner.setValues(fruitList);
//        fruitsSpinner.setSelectedIndex(1);
    }

}


