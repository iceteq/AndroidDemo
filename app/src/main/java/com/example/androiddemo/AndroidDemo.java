package com.example.androiddemo;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/**
 * Bundle state - Bundles are generally used for passing data between various Android activities. It depends on you what type of values you want to pass, but bundles can hold all types of values and pass them to the new activity.
 */
public class AndroidDemo extends Activity {

    private LinearLayout root; // note that we save this for later

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        
        LinearLayout.LayoutParams containerParams =
                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F);

        root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setBackgroundColor(Color.DKGRAY);
        root.setLayoutParams(containerParams);

        setContentView(root);
    }


}
