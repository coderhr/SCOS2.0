/*package es.source.code.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import es.source.code.fragment.MyOrderFragment;

public class OrderViewAdapter extends FragmentPagerAdapter{
    private final ArrayList<MyOrderFragment> fragments;

    public OrderViewAdapter(FragmentManager fm, ArrayList<MyOrderFragment> fragments){
        super(fm);
        this.fragments = fragments;
    }
    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

   @Override
    public CharSequence getPageTitle(int position){
        return fragments.get(position).getTitle();
    }
}
*/