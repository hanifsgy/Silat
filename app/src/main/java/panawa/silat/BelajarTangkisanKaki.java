package panawa.silat;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class BelajarTangkisanKaki extends AppCompatActivity {
    Button kakiBuangLuar,kakiBuangDalam,kakiTutupDepan,kakiTutupSamping;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_tangkisan_kaki);
        kakiBuangLuar = (Button) findViewById(R.id.bKakiBuangLuar);
        kakiBuangLuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarTangkisanKaki.this,KakiBuangLuarActivity.class);
                startActivity(intent);
            }
        });
        kakiBuangDalam = (Button) findViewById(R.id.bKakiBusurDalam);
        kakiBuangDalam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarTangkisanKaki.this, KakiBusurDalamActivity.class);
                startActivity(intent);
            }
        });
        kakiTutupDepan = (Button) findViewById(R.id.bKakiTutupDepan);
        kakiTutupDepan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarTangkisanKaki.this, KakiTutupDepanActivity.class);
                startActivity(intent);
            }
        });
        kakiTutupSamping = (Button) findViewById(R.id.bKakiTutupSamping);
        kakiTutupSamping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BelajarTangkisanKaki.this, KakiTutupSampingActivity.class);
                startActivity(intent);
            }
        });
    }
}
