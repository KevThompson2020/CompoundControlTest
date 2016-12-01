package com.example.kev.compoundcontroltest.compoundComponents;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.kev.compoundcontroltest.R;

/**
 * Created by Kev on 01/12/2016.
 */



public class HapiSubHeader extends LinearLayout {

    String subHeaderText = "";

    /**
     * default constructor
     * @param context
     */
    public HapiSubHeader(Context context) {
        super(context);
        initializeViews(context);
    }

    /**
     * Constructor with attributes
     *
     * @param context
     * @param attrs
     */
    public HapiSubHeader(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(attrs, R.styleable.HapiTextEntry, 0, 0);

        try {
            subHeaderText = a.getString(R.styleable.HapiSubHeader_title);
        } finally {
            a.recycle();
        }

        initializeViews(context);
    }

    /**
     * Constructor with attributes and style.
     *
     * @param context
     * @param attrs
     */
    public HapiSubHeader(Context context, AttributeSet attrs, int defStyle) {
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
        inflater.inflate(R.layout.hapi_form_sub_header, this);
    }


    /**
     * populate items from the passed in attributes once the inflate is finished,  else there will be crashes when trying
     * to access the items
     */
    @Override
    protected void onFinishInflate() {

        // When the controls in the layout are doing being inflated, set
        // the callbacks for the side arrows.
        super.onFinishInflate();
        TextView t = (TextView) findViewById(R.id.sub_header);
        t.setText(subHeaderText);
    }
}

