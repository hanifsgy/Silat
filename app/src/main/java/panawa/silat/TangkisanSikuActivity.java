package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterSikapDuduk;
import panawa.silat.adapter.TabsAdapterSiku;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class TangkisanSikuActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterSiku tabsAdapterSiku;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Atas", "Dalam", "Bawah", "Sempok"};
    int Numboftabs = 3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembentukan_gerakan);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterSiku = new TabsAdapterSiku(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterSiku);

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
