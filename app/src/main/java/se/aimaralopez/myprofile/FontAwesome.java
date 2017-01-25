package se.aimaralopez.myprofile;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by alopez on 25/01/17.
 */


    public class FontAwesome extends TextView {


        public FontAwesome(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            init();
        }

        public FontAwesome(Context context, AttributeSet attrs) {
            super(context, attrs);
            init();
        }

        public FontAwesome(Context context) {
            super(context);
            init();
        }

        private void init() {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(),
                    "/fontawesome.ttf");
            setTypeface(tf);
        }

    }
