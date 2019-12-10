package com.vivian.atm;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.jar.Attributes;

import androidx.constraintlayout.widget.ConstraintLayout;

public class PokerCard extends ConstraintLayout {
    int value;
    private ImageView typeImage;
    private TextView leftPoint;
    private TextView rightPoint;

    public PokerCard(Context context) {
        super(context);
    }
    public PokerCard(Context context, AttributeSet attrs){
        super(context,attrs);
    }
}
