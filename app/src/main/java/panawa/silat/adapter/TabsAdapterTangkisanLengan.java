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
import panawa.silat.fragment.tangkisanLengan.SikuAtas;
import panawa.silat.fragment.tangkisanLengan.SikuBawah;
import panawa.silat.fragment.tangkisanLengan.SikuDalam;
import panawa.silat.fragment.tangkisanLengan.TangkisAtasActivity;
import panawa.silat.fragment.tangkisanLengan.TangkisBawahActivity;
import panawa.silat.fragment.tangkisanLengan.TangkisDuaLenganSamping;
import panawa.silat.fragment.tangkisanLengan.TangkisLuarActivity;
import panawa.silat.fragment.tangkisanLengan.TangkisanDalamActivity;
import panawa.silat.fragment.tangkisanLengan.TangkisanDuaLenganRendahActivity;
import panawa.silat.fragment.tangkisanLengan.TangkisanLenganKepal;
import panawa.silat.fragment.tangkisanLengan.TangkisanTanganBelah;
import panawa.silat.fragment.tangkisanLengan.TepisanActivity;

/**
 * Created by hanifsugiyanto on 3/25/16.
 */
public class TabsAdapterTangkisanLengan extends FragmentStatePagerAdapter {
    CharSequence Titles[]; // This will Store the Titles of the Tabs which are Going to be passed when ViewPagerAdapter is created
    int NumbOfTabs; // Store the number of tabs, this will also be passed when the ViewPagerAdapter is created


    // Build a Constructor and assign the passed Values to appropriate values in the class
    public TabsAdapterTangkisanLengan(FragmentManager fm, CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.Titles = mTitles;
        this.NumbOfTabs = mNumbOfTabsumb;

    }

    //This method return the fragment for the every position in the View Pager
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                SikuAtas tab1 = new SikuAtas();
                return tab1;
            case 1:
                SikuBawah tab2 = new SikuBawah();
                return tab2;
            case 2:
                SikuDalam tab3 = new SikuDalam();
                return tab3;
            case 3:
                TangkisanDalamActivity tab4 = new TangkisanDalamActivity();
                return tab4;
            case 4:
                TangkisanDuaLenganRendahActivity tab5 = new TangkisanDuaLenganRendahActivity();
                return tab5;
            case 5:
                TangkisanLenganKepal tab6 = new TangkisanLenganKepal();
                return tab6;
            case 6:
                TangkisanTanganBelah tab7 = new TangkisanTanganBelah();
                return tab7;
            case 7:
                TangkisAtasActivity tab8 = new TangkisAtasActivity();
                return tab8;
            case 8:
                TangkisBawahActivity tab9 = new TangkisBawahActivity();
                return tab9;
            case 9:
                TangkisDuaLenganSamping tab10 = new TangkisDuaLenganSamping();
                return tab10;
            case 10:
                TangkisLuarActivity tab11 = new TangkisLuarActivity();
                return tab11;
            case 11:
                TepisanActivity tab12 = new TepisanActivity();
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
