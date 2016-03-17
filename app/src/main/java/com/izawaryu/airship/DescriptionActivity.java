package com.izawaryu.airship;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Navigating the app is divided into three parts:
 * Part, Feature, Description
 * As an example of how someone might begin describing an aircraft,
 * you might find a user decides to focus on the Part:
 * 'Empennage'
 * for which they decide to extend on the Feature:
 * 'Horizontal Stabilizer'
 * and elaborate further with a description:
 * 'T-Tail'
 */
public class DescriptionActivity extends AppCompatActivity {

    private final String LOG_TAG = DescriptionActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_description);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
