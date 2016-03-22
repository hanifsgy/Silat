package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukSatu;
import panawa.silat.fragment.sikap.pembentukanGerakan.duduk.DudukTiga;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapHormat;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegak;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakTiga;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TabsAdapterSikapTegakHormat extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSikapTegakHormat(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SikapTegak tab1 = new SikapTegak();
                return tab1;
            case 1:
                SikapHormat tab2 = new SikapHormat();
                return tab2;
            case 2:
                SikapTegakDua tab3 = new SikapTegakDua();
                return tab3;
            case 3:
                SikapTegakTiga tab4 = new SikapTegakTiga();
                return tab4;
            case 4:
                SikapTegakEmpat tab5 = new SikapTegakEmpat();
                return tab5;
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

