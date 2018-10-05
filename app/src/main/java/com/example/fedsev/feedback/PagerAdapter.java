package com.example.fedsev.feedback;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentPagerAdapter
{

    private final List<Fragment> lstFragment = new ArrayList<>();
    private final List<String> lstTitles = new ArrayList<>();

    int mNoOftabs;

    public PagerAdapter(FragmentManager fm , int NumOfTabs  )
    {
        super(fm);         this.mNoOftabs = NumOfTabs;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position)
    {
        return lstTitles.get(position);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0:
                return new Tab1();
            case 1:
                return new Tab2();
            default:
                return null;
        }


    }

    @Override
    public int getCount()
    {
        return lstFragment.size();
    }

    public void addFragment(Fragment fragment, String title)
    {
        lstFragment.add(fragment);
        lstTitles.add(title);
    }



}

