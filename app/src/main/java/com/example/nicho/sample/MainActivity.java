package com.example.nicho.sample;

import android.os.Bundle;
import android.util.Log;

import com.example.numpad.NumPad;
import com.example.numpad.NumPadClick;
import com.example.numpad.numPadClickListener;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    NumPad numPad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numPad = findViewById(R.id.my_numpad);
        numPad.setOnNumPadClickListener(new NumPadClick(new numPadClickListener() {
            @Override
            public void onNumpadClicked(ArrayList<Integer> nums) {
                Log.d("MYTAG", "onNumpadClicked: " + nums);
            }
        }));

    }
}
