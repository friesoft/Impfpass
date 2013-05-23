package org.friesoft.impfpass;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.Locale;


/**
 * A {@link android.support.v4.app.FragmentPagerAdapter} that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {

    public enum Sections {
        Home,
        Insert,
        Scan
    }

    public SectionsPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public int getCount() {
        // Show 3 total pages.
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        Locale l = Locale.getDefault();
        switch (position) {
            case 0:
                Impfpass.getAppContext().getString(R.string.title_Homepage).toUpperCase();
            case 1:
                Impfpass.getAppContext().getString(R.string.title_Insert).toUpperCase();
            case 2:
                Impfpass.getAppContext().getString(R.string.title_History).toUpperCase();
        }
        return null;
    }
}
