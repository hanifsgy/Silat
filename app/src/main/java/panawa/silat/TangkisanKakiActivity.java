package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import panawa.silat.adapter.TabsAdapterSikapDuduk;
import panawa.silat.adapter.TabsAdapterTangkisanKaki;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class TangkisanKakiActivity extends AppCompatActivity {
Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterTangkisanKaki tabsAdapterTangkisanKaki;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Kaki Buang Luar", "Kaki Busur SikuDalam", "Kaki Tutup Depan", "Kaki Tutup Samping"};
    int Numboftabs = 4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembentukan_gerakan);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterTangkisanKaki = new TabsAdapterTangkisanKaki(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterTangkisanKaki);

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
