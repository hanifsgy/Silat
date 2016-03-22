package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterBelajarSikapPembentukanGerakan;
import panawa.silat.adapter.TabsAdapterSikapTegakHormat;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class SikapHormatDanTegak extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterSikapTegakHormat tabsAdapterSikapTegakHormat;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Sikap Hormat Tegak Satu", "Sikap Hormat", "Sikap Tegak Dua", "Sikap Tegak Tiga", "Sikap Tegak Empat"};
    int Numboftabs = 5;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikap_tegak_hormat);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterSikapTegakHormat = new TabsAdapterSikapTegakHormat(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterSikapTegakHormat);

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
