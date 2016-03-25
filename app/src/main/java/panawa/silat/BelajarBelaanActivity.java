package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hanifsugiyanto on 3/6/16.
 */
public class BelajarBelaanActivity extends AppCompatActivity {
    Button elakan,hindaran,tangkisanKaki,tangkisanLengan;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_belaan);
        elakan = (Button) findViewById(R.id.bElakan);
        elakan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarBelaanActivity.this, ElakanActivity.class);
                startActivity(intent);
            }
        });
        hindaran = (Button) findViewById(R.id.bHindaran);
        hindaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarBelaanActivity.this, HindaranActivity.class);
                startActivity(intent);
            }
        });
        tangkisanKaki = (Button) findViewById(R.id.bTangkisanKaki);
        tangkisanKaki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarBelaanActivity.this, TangkisanKakiActivity.class);
                startActivity(intent);
            }
        });
        tangkisanLengan = (Button) findViewById(R.id.bTangkisanLengan);
        tangkisanLengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarBelaanActivity.this, TangkisanLenganActivity.class);
                startActivity(intent);
            }
        });
//        bPG = (Button) findViewById(R.id.bPembentukanGerakan);
//        bPG.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(BelajarBelaanActivity.this,PembentukanGerakanActivity.class);
//                startActivity(intent);
//            }
//        });
//        bSikapDuduk= (Button) findViewById(R.id.bSikapDuduk);
//        bSikapDuduk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent V = new Intent(BelajarBelaanActivity.this,SikapDudukActivity.class);
//                startActivity(V);
//            }
//        });
    }

}