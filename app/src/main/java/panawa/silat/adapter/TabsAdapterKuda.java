package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.FragmentBelaan;
import panawa.silat.fragment.FragmentDosen;
import panawa.silat.fragment.FragmentKudaKuda;
import panawa.silat.fragment.FragmentPertandingan;
import panawa.silat.fragment.FragmentProfil;
import panawa.silat.fragment.FragmentSeranganLengan;
import panawa.silat.fragment.FragmentSerangkaianTungkai;
import panawa.silat.fragment.FragmentSikap;
import panawa.silat.fragment.kudaKuda.KudaBelakang;
import panawa.silat.fragment.kudaKuda.KudaDepan;
import panawa.silat.fragment.kudaKuda.KudaKhusus;
import panawa.silat.fragment.kudaKuda.KudaSamping;
import panawa.silat.fragment.kudaKuda.KudaSilang;
import panawa.silat.fragment.kudaKuda.KudaTengah;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TabsAdapterKuda extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterKuda(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                KudaBelakang tab1 = new KudaBelakang();
                return tab1;
            case 1:
                KudaDepan tab2 = new KudaDepan();
                return tab2;
            case 2:
                KudaKhusus tab3 = new KudaKhusus();
                return tab3;
            case 3:
                KudaSamping tab4 = new KudaSamping();
                return tab4;
            case 4:
                KudaSilang tab5 = new KudaSilang();
                return tab5;
            case 5:
                KudaTengah tab6 = new KudaTengah();
                return tab6;
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
