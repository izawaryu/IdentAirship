package com.izawaryu.airship;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

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
public class FeatureActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_feature);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new FeatureFragment())
                    .commit();
        }
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
        if(id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public static class FeatureFragment extends Fragment {

        private static final String LOG_TAG = FeatureFragment.class.getSimpleName();

        private ArrayAdapter<String> mFeaturesAdapter;

        public FeatureFragment() { setHasOptionsMenu(true); }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            SetData data = new SetData();
            List<String> partFeatures = data.setWingFeatures();

            mFeaturesAdapter =
                    new ArrayAdapter<String>(
                            getActivity(),
                            R.layout.list_item_attributes,
                            R.id.list_item_attributes_textview,
                            partFeatures);

            View rootView = inflater.inflate(R.layout.frag_feature, container, false);

            // Get a reference to the listView and attach an adapter to it.
            ListView listView = (ListView) rootView.findViewById(R.id.list_feature);
            listView.setAdapter(mFeaturesAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    String feature = mFeaturesAdapter.getItem(position);
                    Intent intent = new Intent(getActivity(), DescriptionActivity.class)
                            .putExtra(Intent.EXTRA_TEXT, feature);
                    startActivity(intent);
                }
            });

            return rootView;
        }

    }

}




























