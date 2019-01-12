package com.example.nicho.sample;

import android.os.Bundle;
import android.widget.TextView;

import com.example.numpad.NumPad;
import com.example.numpad.NumPadClick;
import com.example.numpad.numPadClickListener;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.my_textview);
        NumPad numPad = findViewById(R.id.my_numpad);
        numPad.setOnNumPadClickListener(new NumPadClick(new numPadClickListener() {
            @Override
            public void onNumpadClicked(ArrayList<Integer> nums) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < nums.size(); i++) {
                    int num = nums.get(i);
                    sb.append(num);
                }
                String result = sb.toString();
                textView.setText(result);
            }
        }));

    }
}
