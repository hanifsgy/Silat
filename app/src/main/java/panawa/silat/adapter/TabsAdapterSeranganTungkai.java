package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

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
import panawa.silat.fragment.seranganTungkai.TendanganBelakang;
import panawa.silat.fragment.seranganTungkai.TendanganGuntingan;
import panawa.silat.fragment.seranganTungkai.TendanganJejag;
import panawa.silat.fragment.seranganTungkai.TendanganLurus;
import panawa.silat.fragment.seranganTungkai.TendanganSabit;
import panawa.silat.fragment.seranganTungkai.TendanganSapuan;
import panawa.silat.fragment.seranganTungkai.TendanganT;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TabsAdapterSeranganTungkai  extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSeranganTungkai(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                TendanganLurus tab1 = new TendanganLurus();
                return tab1;
            case 1:
                TendanganJejag tab2 = new TendanganJejag();
                return tab2;
            case 2:
                TendanganT tab3 = new TendanganT();
                return tab3;
            case 3:
                TendanganBelakang tab4 = new TendanganBelakang();
                return tab4;
            case 4:
                TendanganSabit tab5 = new TendanganSabit();
                return tab5;
            case 5:
                TendanganSapuan tab6 = new TendanganSapuan();
                return tab6;
            case 6:
                TendanganGuntingan tab7 = new TendanganGuntingan();
                return tab7;
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
