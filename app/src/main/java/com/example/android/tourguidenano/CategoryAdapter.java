package com.example.android.tourguidenano;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_location);
        } else if (position == 1) {
            return mContext.getString(R.string.category_hotel);
        } else if (position == 2) {
            return mContext.getString(R.string.category_restaurant);
        } else {
            return mContext.getString(R.string.category_event);
        }
    }

    public CategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new LocationFragment();
        } else if (position == 1) {
            return new HotelFragment();
        } else if (position == 2) {
            return new RestaurantFragment();
        } else {
            return new EventFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }


}

