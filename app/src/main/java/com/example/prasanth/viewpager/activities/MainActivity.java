package com.example.prasanth.viewpager.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.prasanth.viewpager.R;
import com.example.prasanth.viewpager.fragments.ViewFragment;

public class MainActivity extends FragmentActivity {
    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=(ViewPager)findViewById(R.id.viewPager);
        viewPager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));
    }
}

class MyPageAdapter extends FragmentPagerAdapter
{
    public MyPageAdapter(android.support.v4.app.FragmentManager fragmentManager)
    {
        super(fragmentManager);
    }

    public Fragment getItem(int pos) {
        switch (pos) {
            case 0:
                return ViewFragment.newInstance("HELLO", R.drawable.logo1);
            case 1:
                return ViewFragment.newInstance("HAI", R.drawable.log02);
            case 2:
                return ViewFragment.newInstance("HELLO WORLD", R.drawable.logo3);
        }
        return null;
    }

    public int getCount()
    {
        return 3;
    }
}
