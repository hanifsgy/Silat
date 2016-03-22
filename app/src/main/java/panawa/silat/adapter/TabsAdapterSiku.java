package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.belaan.elakan.ElakanDua;
import panawa.silat.fragment.belaan.elakan.ElakanSatu;
import panawa.silat.fragment.belaan.elakan.ElakanTiga;
import panawa.silat.fragment.belaan.elakan.siku.Atas;
import panawa.silat.fragment.belaan.elakan.siku.Bawah;
import panawa.silat.fragment.belaan.elakan.siku.Dalam;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class TabsAdapterSiku extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSiku(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Atas tab1 = new Atas();
                return tab1;
            case 1:
                Bawah tab2 = new Bawah();
                return tab2;
            case 2:
                Dalam tab3 = new Dalam();
                return tab3;
            default:
                return null;
        }
    }

    // This method return the titles for the Tabs in the Tab Strip

    @Override

    public CharSequence getPageTitle(int position) {
        return Titles[position];
    }

    // This method return the Number of tabs for the tabs Strip

    @Override
    public int getCount() {
        return NumbOfTabs;
    }

}


