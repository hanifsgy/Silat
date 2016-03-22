package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterSikapPasang;
import panawa.silat.adapter.TabsAdapterSikapTegakHormat;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class SikapPasangActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterSikapPasang tabsAdapterSikapPasang;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Sikap Pasang Satu", "Sikap Pasang Dua", "Sikap Pasang Tiga", "Sikap Pasang Empat", "Sikap Pasang Lima","Sikap Pasang Enam", "Sikap Pasang Tujuh","Sikap Pasang Delapan"};
    int Numboftabs = 8;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikap_tegak_hormat);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterSikapPasang = new TabsAdapterSikapPasang(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterSikapPasang);

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
