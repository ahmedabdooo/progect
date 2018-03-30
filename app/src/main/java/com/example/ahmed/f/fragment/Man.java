package com.example.ahmed.f.fragment;


import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.f.R;
import com.example.ahmed.f.fragment_console.fragmentconsole;

public class Man extends Fragment {

    public Man() {

    }


    TabLayout tab;
    ViewPager view;
    public fragmentconsole mo;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view1 = inflater.inflate(R.layout.fragment_man, container, false);

        tab = view1.findViewById(R.id.tablayout);
        view = view1.findViewById(R.id.viewpager);

        mo = new fragmentconsole(getChildFragmentManager());
        mo.add(new Man_Clothes(),"Clothes");
        mo.add(new Man_shoes(),"Shoes");
        view.setAdapter(mo);
        tab.setupWithViewPager(view);

        return view1;
    }

}
