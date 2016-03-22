package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterKuda;
import panawa.silat.adapter.TabsAdapterSikapTegakHormat;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class KudaActivity extends AppCompatActivity {
        Toolbar toolbar;
        ViewPager mViewPager;
        TabsAdapterKuda tabsAdapterKuda;
        SlidingTabLayout tabs;
        CharSequence Titles[] = {"Kuda Belakang", "Kuda Depan", "Kuda Khusus", "Kuda Samping", "Kuda Silang","Kuda Tengah"};
        int Numboftabs = 6;

        @Override
        public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kuda);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterKuda = new TabsAdapterKuda(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterKuda);

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
