package com.example.ahmed.f.fragment_console;

/**
 * Created by Ahmed on 3/28/2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class fragmentconsole extends FragmentPagerAdapter {

    ArrayList<Fragment> ahmed = new ArrayList<>();
    ArrayList<String>title = new ArrayList<>();

    public void add (Fragment frament , String title) {
        this.ahmed.add(frament);
        this.title.add(title);
    }

    public fragmentconsole(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ahmed.get(position);
    }

    @Override
    public int getCount() {
        return ahmed.size();
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }

}

