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
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentDelapanPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentDuaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentEmpatPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentEnamPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentLimaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentSatuPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentTigaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentTujuhPG;

/**
 * Created by hanifsugiyanto on 3/4/16.
 */
public class TabsAdapterBelajarSikapPembentukanGerakan extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterBelajarSikapPembentukanGerakan(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentSatuPG tab1 = new FragmentSatuPG();
                return tab1;
            case 1:
                FragmentDuaPG tab2 = new FragmentDuaPG();
                return tab2;
            case 2:
                FragmentTigaPG tab3 = new FragmentTigaPG();
                return tab3;
            case 3:
                FragmentEmpatPG tab4 = new FragmentEmpatPG();
                return tab4;
            case 4:
                FragmentLimaPG tab5 = new FragmentLimaPG();
                return tab5;
            case 5:
                FragmentEnamPG tab6 = new FragmentEnamPG();
                return tab6;
            case 6:
                FragmentTujuhPG tab7 = new FragmentTujuhPG();
                return tab7;
            case 7:
                FragmentDelapanPG tab8 = new FragmentDelapanPG();
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