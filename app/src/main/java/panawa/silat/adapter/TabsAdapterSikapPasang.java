package panawa.silat.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapHormat;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegak;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat.SikapTegakTiga;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangDelapan;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangDua;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangEmpat;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangEnam;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangLima;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangSatu;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangTiga;
import panawa.silat.fragment.sikap.pembentukanGerakan.sikapPasang.PasangTuju;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TabsAdapterSikapPasang extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterSikapPasang(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                PasangSatu tab1 = new PasangSatu();
                return tab1;
            case 1:
                PasangDua tab2 = new PasangDua();
                return tab2;
            case 2:
                PasangTiga tab3 = new PasangTiga();
                return tab3;
            case 3:
                PasangEmpat tab4 = new PasangEmpat();
                return tab4;
            case 4:
                PasangLima tab5 = new PasangLima();
                return tab5;
            case 5:
                PasangEnam tab6= new PasangEnam();
                return tab6;
            case 6:
                PasangTuju tab7= new PasangTuju();
                return tab7;
            case 7:
                PasangDelapan tab8= new PasangDelapan();
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

