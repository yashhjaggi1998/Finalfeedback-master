package com.example.fedsev.feedback;


import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class CallToBeDone extends Fragment
{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.calltobedone, container, false);
        TabLayout tablayout = (TabLayout) view.findViewById(R.id.tabLayout);
        //tablayout.addTab(tablayout.newTab().setText("Tab1"));//setText for A
        //tablayout.addTab(tablayout.newTab().setText("Tab2"));//setText for B
        tablayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final ViewPager viewPager = (ViewPager) view.findViewById(R.id.pager);

        viewPager.setCurrentItem(1);//it's no working

        PagerAdapter viewPagerAdapter = new PagerAdapter(getChildFragmentManager(),tablayout.getTabCount());
        viewPagerAdapter.addFragment(new Tab1(),"Tab1");
        viewPagerAdapter.addFragment(new Tab2(),"Tab2");
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab)
            {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return view;
    }

}