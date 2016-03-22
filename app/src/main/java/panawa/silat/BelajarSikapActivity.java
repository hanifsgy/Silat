package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hanifsugiyanto on 3/4/16.
 */
public class BelajarSikapActivity extends AppCompatActivity {
    Button bPG,bSikapDuduk,bSikapHT,bSikapPasang;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_sikap);

        bPG = (Button) findViewById(R.id.bPembentukanGerakan);
        bPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarSikapActivity.this,PembentukanGerakanActivity.class);
                startActivity(intent);
            }
        });
        bSikapDuduk= (Button) findViewById(R.id.bSikapDuduk);
        bSikapDuduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent V = new Intent(BelajarSikapActivity.this,SikapDudukActivity.class);
                startActivity(V);
            }
        });
        bSikapHT = (Button) findViewById(R.id.bSikapHormatDanTegak);
        bSikapHT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BelajarSikapActivity.this, SikapHormatDanTegak.class);
                startActivity(i);
            }
        });
        bSikapPasang = (Button) findViewById(R.id.bSikapPasang);
        bSikapPasang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(BelajarSikapActivity.this, SikapPasangActivity.class);
                startActivity(a);
            }
        });
    }
}
