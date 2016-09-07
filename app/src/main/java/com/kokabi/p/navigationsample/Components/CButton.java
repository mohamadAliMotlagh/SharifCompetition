package com.kokabi.p.navigationsample.Components;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

import com.kokabi.p.navigationsample.Help.Constants;
import com.kokabi.p.navigationsample.Help.FontChange;

public class CButton extends Button {
    Context ctx;

    public CButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        ctx = context;
        init();
    }

    public CButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        ctx = context;
        init();
    }

    public CButton(Context context) {
        super(context);
        ctx = context;
        init();
    }

    public void init() {
        if (isInEditMode())
            return;
        setOnTouchListener(null);
        FontChange.setFontButton(this, Constants.font.SANS_MEDIUM, ctx);
    }
}