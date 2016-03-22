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
import panawa.silat.fragment.seranganLengan.Bandul;
import panawa.silat.fragment.seranganLengan.Dobrakan;
import panawa.silat.fragment.seranganLengan.Kepret;
import panawa.silat.fragment.seranganLengan.Lurus;
import panawa.silat.fragment.seranganLengan.Patukan;
import panawa.silat.fragment.seranganLengan.Sangga;
import panawa.silat.fragment.seranganLengan.Sikuan;
import panawa.silat.fragment.seranganLengan.Tamparan;
import panawa.silat.fragment.seranganLengan.Tebasan;
import panawa.silat.fragment.seranganLengan.Terbangan;
import panawa.silat.fragment.seranganLengan.Totokan;
import panawa.silat.fragment.seranganLengan.Tusukan;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TabsAdapterSeranganLengan extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSeranganLengan(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Dobrakan tab1 = new Dobrakan();
                return tab1;
            case 1:
                Kepret tab2 = new Kepret();
                return tab2;
            case 2:
                Patukan tab3 = new Patukan();
                return tab3;
            case 3:
                Bandul tab4 = new Bandul();
                return tab4;
            case 4:
                Lurus tab5 = new Lurus();
                return tab5;
            case 5:
                Sangga tab6 = new Sangga();
                return tab6;
            case 6:
                Sikuan tab7 = new Sikuan();
                return tab7;
            case 7:
                Tamparan tab8 = new Tamparan();
                return tab8;
            case 8:
                Terbangan tab9 = new Terbangan();
                return tab9;
            case 9:
                Tebasan tab10 = new Tebasan();
                return tab10;
            case 10:
                Totokan tab11 = new Totokan();
                return tab11;
            case 11:
                Tusukan tab12 = new Tusukan();
                return tab12;
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
