package com.example.numpad;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TableLayout;
import android.widget.TableRow;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

public class NumPad extends TableLayout {

    private Button num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
    private ImageButton backButton, customButton;
    private NumPadClick listener;
    private TableLayout tableLayout;

    public NumPad(Context context, AttributeSet attrs) {
        super(context, attrs);
        inflateNumpad(context);
    }

    public void setOnNumPadClickListener(@NonNull NumPadClick listener) {
        this.listener = listener;
        initialiseButtonListener();
    }

    private void inflateNumpad(Context context) {
        View view = inflate(context, R.layout.numpad_layout, this);
        initialiseWidgets(view);
    }

    private void initialiseWidgets(View view) {
        //Numpad widgets
        num1 = view.findViewById(R.id.btnNumpad1);
        num2 = view.findViewById(R.id.btnNumpad2);
        num3 = view.findViewById(R.id.btnNumpad3);
        num4 = view.findViewById(R.id.btnNumpad4);
        num5 = view.findViewById(R.id.btnNumpad5);
        num6 = view.findViewById(R.id.btnNumpad6);
        num7 = view.findViewById(R.id.btnNumpad7);
        num8 = view.findViewById(R.id.btnNumpad8);
        num9 = view.findViewById(R.id.btnNumpad9);
        num0 = view.findViewById(R.id.btnNumpad0);
        backButton = view.findViewById(R.id.btnNumpadBack);
        customButton = view.findViewById(R.id.btnNumpadCustom);
        // Background
        tableLayout = view.findViewById(R.id.numpad_container);

    }

    private void initialiseButtonListener() {
        num1.setOnClickListener(listener);
        num2.setOnClickListener(listener);
        num3.setOnClickListener(listener);
        num4.setOnClickListener(listener);
        num5.setOnClickListener(listener);
        num6.setOnClickListener(listener);
        num7.setOnClickListener(listener);
        num8.setOnClickListener(listener);
        num9.setOnClickListener(listener);
        num0.setOnClickListener(listener);
        backButton.setOnClickListener(listener);
        customButton.setOnClickListener(listener);
    }

    // Currently not working!
    private void setButtonSize(@NonNull int desiredHeight) {

        int height = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, desiredHeight, getResources().getDisplayMetrics());

        num1.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num2.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num3.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num4.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num5.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num6.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num7.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num8.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num9.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        num0.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        backButton.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
        customButton.setLayoutParams(new TableRow.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, height));
    }

    /**
     * Change color of button's text
     *
     * @param context
     * @param colorId
     */
    public void setButtonTextColor(@NonNull Context context, @NonNull int colorId) {
        num1.setTextColor(ContextCompat.getColor(context, colorId));
        num2.setTextColor(ContextCompat.getColor(context, colorId));
        num3.setTextColor(ContextCompat.getColor(context, colorId));
        num4.setTextColor(ContextCompat.getColor(context, colorId));
        num5.setTextColor(ContextCompat.getColor(context, colorId));
        num6.setTextColor(ContextCompat.getColor(context, colorId));
        num7.setTextColor(ContextCompat.getColor(context, colorId));
        num8.setTextColor(ContextCompat.getColor(context, colorId));
        num9.setTextColor(ContextCompat.getColor(context, colorId));
        num0.setTextColor(ContextCompat.getColor(context, colorId));
    }

}
