package com.example.numpad;

import android.view.View;

import java.util.ArrayList;

class NumPadLogic {

    /**
     * Return int on button click
     *
     * @param view
     * @return
     */
    static int returnInteger(View view) {
        int i = view.getId();

        if (i == R.id.btnNumpad0) {
            return 0;
        } else if (i == R.id.btnNumpad1) {
            return 1;
        } else if (i == R.id.btnNumpad2) {
            return 2;
        } else if (i == R.id.btnNumpad3) {
            return 3;
        } else if (i == R.id.btnNumpad4) {
            return 4;
        } else if (i == R.id.btnNumpad5) {
            return 5;
        } else if (i == R.id.btnNumpad6) {
            return 6;
        } else if (i == R.id.btnNumpad7) {
            return 7;
        } else if (i == R.id.btnNumpad8) {
            return 8;
        } else if (i == R.id.btnNumpad9) {
            return 9;
        } else if (i == R.id.btnNumpadBack) {
            return -1;
        } else {
            return -2;
        }
    }

    static ArrayList<Integer> returnList(int input, ArrayList<Integer> numbers) {

        if (numbers != null) {
            if (input != -1 && input != -2) {
                numbers.add(input);
            } else if (input == -1) {
                if (numbers.size() != 0) {
                    numbers.remove(numbers.size() - 1);
                }
            } else {
                // Do nothing
            }
        }

        return numbers;
    }

}
