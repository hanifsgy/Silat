package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class BelajarTangkisanLengan extends AppCompatActivity {
    Button tangkisBawah,tangkisDuaLenganSamping,tangkisLuar,tangkisAtas,tangkisDalam,tangkisDuaLenganDada,tangkisDuaLenganRendah,tangkisanSiku,tangkisanTanganBelah,tepisan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_tangkisan_lengan);
        tangkisBawah = (Button) findViewById(R.id.bTangkisanBawah);
        tangkisBawah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this, TangkisBawahActivity.class);
                startActivity(a);
            }
        });
        tangkisDuaLenganSamping = (Button) findViewById(R.id.bTangkisanDuaLenganSamping);
        tangkisDuaLenganSamping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this,TangkisDuaLenganSamping.class);
                startActivity(a);
            }
        });
        tangkisLuar = (Button) findViewById(R.id.bTangkisanLuar);
        tangkisLuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b = new Intent(BelajarTangkisanLengan.this,TangkisLuarActivity.class);
                startActivity(b);
            }
        });
        tangkisAtas = (Button) findViewById(R.id.bTangkisanAtas);
        tangkisAtas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(BelajarTangkisanLengan.this,TangkisAtasActivity.class);
                startActivity(n);
            }
        });
        tangkisDalam = (Button) findViewById(R.id.bTangkisanDalam);
        tangkisDalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this, TangkisanDalamActivity.class);
                startActivity(a);
            }
        });
        tangkisDuaLenganDada = (Button) findViewById(R.id.bTangkisanDuaLenganDada);
        tangkisDuaLenganDada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BelajarTangkisanLengan.this, TangkisanLenganActivity.class);
                startActivity(i);
            }
        });
        tangkisDuaLenganRendah = (Button) findViewById(R.id.bTangkisanDuaLenganRendah);
        tangkisDuaLenganRendah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BelajarTangkisanLengan.this,TangkisanDuaLenganRendahActivity.class);
                startActivity(i);
            }
        });
        tangkisanSiku = (Button) findViewById(R.id.bTangkisanSiku);
        tangkisanSiku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this, TangkisanSikuActivity.class);
                startActivity(a);
            }
        });
        tangkisanTanganBelah =(Button) findViewById(R.id.bTangkisanTanganBelah);
        tangkisanTanganBelah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this, TangkisanTanganBelah.class);
                startActivity(a);
            }
        });
        tepisan = (Button) findViewById(R.id.bTangkisanTepisan);
        tepisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarTangkisanLengan.this, TepisanActivity.class);
                startActivity(a);

            }
        });
    }
}
