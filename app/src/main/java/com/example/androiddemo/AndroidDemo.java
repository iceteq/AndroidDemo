package com.example.androiddemo;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;



/**
 * Bundle state - Bundles are generally used for passing data between various Android activities. It depends on you what type of values you want to pass, but bundles can hold all types of values and pass them to the new activity.
 */
public class AndroidDemo extends Activity {


        @Override
    public void onCreate(Bundle state) {
            super.onCreate(state);

            setContentView(R.layout.layout);
        }

//
//    private LinearLayout root; // note that we save this for later
//
//    @Override
//    public void onCreate(Bundle state) {
//        super.onCreate(state);
//
//        LinearLayout.LayoutParams containerParams =
//                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.WRAP_CONTENT, 0.0F);
//
//        /**
//         * Root will have vertical layout, so everything we put in
//         * it will be on its own line (going underneath)
//         *
//         * but this is just root, we will be putting things that
//         * have horizontal layout within this.
//         */
//        root = new LinearLayout(this);
//        root.setOrientation(LinearLayout.VERTICAL);
//        root.setBackgroundColor(Color.DKGRAY);
//        root.setLayoutParams(containerParams);
//
//
//        /**
//         * This is like a horizontal container, created and attached
//         * to the root. But this thing doesn't appear.. even though we set a background
//         * color - nothing is seen on the screen (unlike the above)
//         *
//         * LinearLayout is a kind of view, that organizes content
//         * horizontally or vertically
//         */
//        LinearLayout ll = new LinearLayout(this);
//        ll.setOrientation(LinearLayout.HORIZONTAL);
//        ll.setBackgroundColor(Color.GRAY);
//        ll.setLayoutParams(containerParams);
//        root.addView(ll); // without this line, ll will not appear when we setContentView later
//
//        /**
//         * EditText takes a "context" as parameter. The context
//         * apparently can be an instance of an activity (in this case 'this').
//         *
//         * Notice also that we followed same idea as when adding LinearLayout
//         * to the root above. We create instance, we set it up, and then addView
//         *
//         * also.. the ll we added above was not visible at all, until
//         * we added this EditText to it. Now we could see the ll also.. how
//         * do I know? because we set a specific background color on the ll
//         * and that color can be seen after we add the EditBox.. because the
//         * editbox has that color. Try changing the ll color to RED and you'll see.
//         *
//         * Also notice we gave a separate "params" to this EditText..
//         */
//        LinearLayout.LayoutParams widgetParams =
//                new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,
//                        ViewGroup.LayoutParams.MATCH_PARENT, 1.0F);
//
//
//        EditText tb = new EditText(this);
//        tb.setText("hey");
//        tb.setFocusable(false);
//        tb.setLayoutParams(widgetParams);
//        ll.addView(tb);
//
//        /**
//         * We don't want anything else on this line, but on the next
//         * line we want two buttons so we will create a new
//         * horizontal layout which will naturally be underneath the above
//         * horizontal layout
//         */
//        ll = new LinearLayout(this);
//        ll.setOrientation(LinearLayout.HORIZONTAL);
//        ll.setBackgroundColor(Color.WHITE);
//        ll.setLayoutParams(containerParams);
//        root.addView(ll);
//
//        Button b = new Button(this);
//        b.setText("Red");
//        b.setLayoutParams(widgetParams);
//        ll.addView(b);
//
//        b = new Button(this);
//        b.setText("Green");
//        b.setLayoutParams(widgetParams);
//        ll.addView(b);
//
//        setContentView(root); // notice how we sort of attached other views to this root, and finally displayed the root itself here, which contains all those attachments
//    }
//

}
