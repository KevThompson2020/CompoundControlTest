package com.example.kev.compoundcontroltest.compoundComponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kev.compoundcontroltest.R;

/**
 * Created by Kev on 29/11/2016.
 */

public class HapiTextEntry  extends LinearLayout {

    String hintText = "";
    String warningText = "";

    /**
     * Basic Constructor
     * @param context
     */
    public HapiTextEntry(Context context) {
        super(context);
        initializeViews(context);
    }

    /**
     * Constructor with attributes
     * @param context
     * @param attrs
     */
    public HapiTextEntry(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.HapiTextEntry, 0, 0);

        try {
            hintText = a.getString(R.styleable.HapiTextEntry_hint);
            warningText = a.getString(R.styleable.HapiTextEntry_warning_text);
        } finally {
            a.recycle();
        }

        initializeViews(context);
    }

    /**
     * Constructor with attributes and style.
     * @param context
     * @param attrs
     */
    public HapiTextEntry(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initializeViews(context);
    }

    /**
     * Inflates the views in the layout.
     *
     * @param context the current context for the view.
     */
    private void initializeViews(Context context) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.hapi_form_data_entry, this);
    }


    @Override
    protected void onFinishInflate() {

        // When the controls in the layout are doing being inflated, set
        // the callbacks for the side arrows.
        super.onFinishInflate();

        // Text Entry Box.
        TextView textEntry = (TextView) findViewById(R.id.text_entry_box);
        if (textEntry != null) {
            textEntry.setHint(hintText);
        }

        // Warning Text
        TextView errorView = (TextView) findViewById(R.id.error_textview);
        if (errorView != null) {
            errorView.setText(warningText);
        }

    }
}
