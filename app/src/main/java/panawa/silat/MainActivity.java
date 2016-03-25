package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by hanifsugiyanto on 3/25/16.
 */
public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbarMain);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        //Button Image View
        final LinearLayout f = (LinearLayout) findViewById(R.id.buttonSejarah);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, SejarahActivity.class);
                startActivity(a);
            }
        });
        final LinearLayout g = (LinearLayout) findViewById(R.id.buttonSikap);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, BelajarSikapActivity.class);
                startActivity(a);
            }
        });
        final LinearLayout e = (LinearLayout) findViewById(R.id.buttonKuda);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, KudaActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout q = (RelativeLayout) findViewById(R.id.buttonSeranganLengan);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, SeranganLenganActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout j = (RelativeLayout) findViewById(R.id.buttonBelaan);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, BelajarBelaanActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout w = (RelativeLayout) findViewById(R.id.buttonSeranganTungkai);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, SeranganTungkaiActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout z = (RelativeLayout) findViewById(R.id.buttonPertandingan);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, PertandinganActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout x = (RelativeLayout) findViewById(R.id.buttonProfil);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(a);
            }
        });
        final RelativeLayout c = (RelativeLayout) findViewById(R.id.buttonDosen);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(MainActivity.this, DosenActivity.class);
                startActivity(a);
            }
        });



    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.video) {
            Intent a = new Intent(MainActivity.this, VideoActivity.class);
            startActivity(a);
            // Handle the camera action
        } else if (id == R.id.latarBelakang) {
            Intent a = new Intent(MainActivity.this, PencakSilatActivity.class);
            startActivity(a);

        } else if (id == R.id.refrensi) {
            Intent a = new Intent(MainActivity.this, RefrensiActivity.class);
            startActivity(a);

        } else if (id == R.id.main){
            Intent a = new Intent(MainActivity.this,MainActivity.class);
            startActivity(a);
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
