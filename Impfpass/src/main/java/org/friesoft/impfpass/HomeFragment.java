package org.friesoft.impfpass;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A dummy fragment representing a section of the app, but that simply
 * displays dummy text.
 */
public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main_dummy, container, false);
        //TextView dummyTextView = (TextView) rootView.findViewById(Integer.valueOf(SectionsPagerAdapter.Sections.Home.toString()));
        //dummyTextView.setText("Home");
        return rootView;
    }
}