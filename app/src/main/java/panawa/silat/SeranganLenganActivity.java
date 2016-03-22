package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterSeranganLengan;
import panawa.silat.adapter.TabsAdapterSikapDuduk;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class SeranganLenganActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterSeranganLengan tabsAdapterSeranganLengan;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Dobrakan", "Kepret", "Patukan", "Pukulan Bandul","Pukulan Lurus","Sangga","Sikuan","Tamparan","Tebangan","Tebsasan","Totokan","Tusukan"};
    int Numboftabs = 12;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_serangan_lengan);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterSeranganLengan = new TabsAdapterSeranganLengan(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterSeranganLengan);

        tabs = (SlidingTabLayout) findViewById(R.id.tabs);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.MoreWhite);
            }
        });
        tabs.setViewPager(mViewPager);
    }
}
