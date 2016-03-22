package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentDelapanPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentDuaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentEmpatPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentEnamPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentLimaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentSatuPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentTigaPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.FragmentTujuhPG;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukSatu;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukTiga;

/**
 * Created by hanifsugiyanto on 3/4/16.
 */
public class TabsAdapterSikapDuduk extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSikapDuduk(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                DudukSatu tab1 = new DudukSatu();
                return tab1;
            case 1:
                DudukDua tab2 = new DudukDua();
                return tab2;
            case 2:
                DudukTiga tab3 = new DudukTiga();
                return tab3;
            case 3:
                DudukEmpat tab4 = new DudukEmpat();
                return tab4;
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


