package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.view.View;

import panawa.silat.fragment.FragmentBelaan;
import panawa.silat.fragment.FragmentDosen;
import panawa.silat.fragment.FragmentKudaKuda;
import panawa.silat.fragment.FragmentPertandingan;
import panawa.silat.fragment.FragmentProfil;
import panawa.silat.fragment.FragmentSeranganLengan;
import panawa.silat.fragment.FragmentSerangkaianTungkai;
import panawa.silat.fragment.FragmentSikap;

/**
 * Created by hanifsugiyanto on 3/3/16.
 */
public class TabsAdapterPencakSilat extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterPencakSilat(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentSikap tab1 = new FragmentSikap();
                return tab1;
            case 1:
                FragmentKudaKuda tab2 = new FragmentKudaKuda();
                return tab2;
            case 2:
                FragmentSeranganLengan tab3 = new FragmentSeranganLengan();
                return tab3;
            case 3:
                FragmentBelaan tab4 = new FragmentBelaan();
                return tab4;
            case 4:
                FragmentSerangkaianTungkai tab5 = new FragmentSerangkaianTungkai();
                return tab5;
            case 5:
                FragmentPertandingan tab6 = new FragmentPertandingan();
                return tab6;
            case 6:
                FragmentProfil tab7 = new FragmentProfil();
                return tab7;
            case 7:
                FragmentDosen tab8 = new FragmentDosen();
                return tab8;
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
