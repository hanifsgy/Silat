package panawa.silat;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import panawa.silat.adapter.TabsAdapterBelajarSikapPembentukanGerakan;
import panawa.silat.adapter.TabsAdapterTangkisanLengan;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/25/16.
 */
public class TangkisanLenganActivity extends AppCompatActivity {
    Toolbar toolbar;
    ViewPager mViewPager;
    TabsAdapterTangkisanLengan tabsAdapterTangkisanLengan;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Siku Atas", "Siku Bawah", "Siku Dalam", "Tangkisan Dalam", "Tangkisan Dua Lengan Rendah", "Tangkisan Lengan Kepal",
            "Tangkisan Tangan Belah", "Tangkisan Atas", "Tangkisan Bawah", "Tangkisan Dua Lengan Samping", "Tangkisan Luar", "Tepisan"};
    int Numboftabs = 12;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tangkisan_lengan);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tabsAdapterTangkisanLengan = new TabsAdapterTangkisanLengan(getSupportFragmentManager(), Titles, Numboftabs);

        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(tabsAdapterTangkisanLengan);

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