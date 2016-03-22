package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import panawa.silat.adapter.TabsAdapterBelajarSikapPembentukanGerakan;
import panawa.silat.adapter.TabsAdapterVideo;
import panawa.silat.extra.SlidingTabLayout;

/**
 * Created by hanifsugiyanto on 3/14/16.
 */
public class VideoActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ViewPager mViewPager;
    TabsAdapterVideo tabsAdapterVideo;
    SlidingTabLayout tabs;
    CharSequence Titles[] = {"Sendiri", "Pasang"};
    int Numboftabs = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarVideo);
        setSupportActionBar(toolbar);
        tabsAdapterVideo = new TabsAdapterVideo(getSupportFragmentManager(),Titles,Numboftabs);
        tabs = (SlidingTabLayout) findViewById(R.id.tabsVideo);
        tabs.setDistributeEvenly(true);
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.MoreWhite);
            }
        });
        tabs.setViewPager(mViewPager);
        mViewPager = (ViewPager) findViewById(R.id.pagerVideo);
        mViewPager.setAdapter(tabsAdapterVideo);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.sejarah) {
            Intent a = new Intent(VideoActivity.this, MainActivity.class);
            startActivity(a);
            // Handle the camera action
        } else if (id == R.id.pencakSilat) {
            Intent a = new Intent(VideoActivity.this, PencakSilatActivity.class);
            startActivity(a);

        } else if (id == R.id.about) {
            Intent a = new Intent(VideoActivity.this, AboutActivity.class);
            startActivity(a);

        } else if (id == R.id.video) {
            Intent a = new Intent(VideoActivity.this, VideoActivity.class);
            startActivity(a);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
