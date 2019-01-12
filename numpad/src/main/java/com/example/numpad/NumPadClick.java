package com.example.numpad;

import android.view.View;

import java.util.ArrayList;

import static com.example.numpad.NumPadLogic.returnInteger;
import static com.example.numpad.NumPadLogic.returnList;

public class NumPadClick implements View.OnClickListener {

    private numPadClickListener mListener;
    private ArrayList<Integer> numbers = new ArrayList<>();

    public NumPadClick(numPadClickListener listener) {
        mListener = listener;
    }

    @Override
    public void onClick(View view) {
        if (view != null) {
            int num = returnInteger(view);
            numbers = returnList(num, numbers);
            mListener.onNumpadClicked(numbers);

        } else {
            throw new NullPointerException("No listener attached to numpad");
        }
    }


}
