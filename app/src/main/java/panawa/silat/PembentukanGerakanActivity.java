package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterBelajarSikapPembentukanGerakan;
import panawa.silat.adapter.TabsAdapterPencakSilat;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/4/16.
 */
public class PembentukanGerakanActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterBelajarSikapPembentukanGerakan tabsAdapterBelajarSikapPembentukanGerakan;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Satu", "Dua", "Tiga", "Empat", "Lima", "Emam", "Tujuh", "Delapan"};
    int Numboftabs = 8;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembentukan_gerakan);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterBelajarSikapPembentukanGerakan = new TabsAdapterBelajarSikapPembentukanGerakan(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterBelajarSikapPembentukanGerakan);

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
