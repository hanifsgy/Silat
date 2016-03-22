package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterSikapDuduk;
import panawa.silat.adapter.TabsAdapterTangkisanLenganDada;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class TangkisanLenganActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterTangkisanLenganDada tabsAdapterTangkisanLenganDada;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Dua Lengan Dada", "Dua Lengan Kepal"};
    int Numboftabs = 2;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangkisan_lengan_dada);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterTangkisanLenganDada = new TabsAdapterTangkisanLenganDada(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterTangkisanLenganDada);

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

