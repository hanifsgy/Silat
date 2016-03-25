package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukSatu;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukTiga;
import panawa.silat.fragment.tangkisanKaki.KakiBuangLuarActivity;
import panawa.silat.fragment.tangkisanKaki.KakiBusurDalamActivity;
import panawa.silat.fragment.tangkisanKaki.KakiTutupDepanActivity;
import panawa.silat.fragment.tangkisanKaki.KakiTutupSampingActivity;

/**
 * Created by hanifsugiyanto on 3/25/16.
 */
public class TabsAdapterTangkisanKaki  extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterTangkisanKaki(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                KakiBuangLuarActivity tab1 = new KakiBuangLuarActivity();
                return tab1;
            case 1:
                KakiBusurDalamActivity tab2 = new KakiBusurDalamActivity();
                return tab2;
            case 2:
                KakiTutupDepanActivity tab3 = new KakiTutupDepanActivity();
                return tab3;
            case 3:
                KakiTutupSampingActivity tab4 = new KakiTutupSampingActivity();
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

