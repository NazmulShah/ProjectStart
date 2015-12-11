package com.example.user.projectstart;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.UnderlineSpan;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {


    // action bar
    private ActionBar actionBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView txtView = (TextView) findViewById(R.id.link);

        SpannableString str = new SpannableString("Forget password??");
        str.setSpan(new UnderlineSpan(), 0, str.length(), Spanned.SPAN_PARAGRAPH);
        txtView.setText(str);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        // setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }
}