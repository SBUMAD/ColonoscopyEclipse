package com.example.scrolltabhive;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
 
public class TabsPagerAdapter extends FragmentPagerAdapter {
	public static int limit = 8;
    public TabsPagerAdapter(FragmentManager fm) {
        super(fm);
    }
 
    @Override
    public Fragment getItem(int index) {
 
        switch (index) {
        case 0:
            // Top Rated fragment activity
            return new VideoFragment();
        case 1:
            // Games fragment activity
            return new RecipeFragment();
        case 2:
            // Movies fragment activity
            return new PrepFragment();
        case 3:
        	return new ExLaxFragment();
        case 4:
        	return new FirstHalfFragment();
        case 5:
        	return new BreakFragment();
        case 6:
        	return new SecondHalfFragment();
        case 7:
        	return new AppointmentFragment();
        }
 
        return null;
    }
 
    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return limit;
    }
 
}