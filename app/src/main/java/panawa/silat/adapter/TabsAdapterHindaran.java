package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.belaan.elakan.ElakanDua;
import panawa.silat.fragment.belaan.elakan.ElakanSatu;
import panawa.silat.fragment.belaan.elakan.ElakanTiga;
import panawa.silat.fragment.belaan.elakan.hindaran.HindaranSatu;
import panawa.silat.fragment.belaan.elakan.hindaran.HindaranSisi;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class TabsAdapterHindaran extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterHindaran(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HindaranSatu tab1 = new HindaranSatu();
                return tab1;
            case 1:
                HindaranSisi tab2 = new HindaranSisi();
                return tab2;
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


