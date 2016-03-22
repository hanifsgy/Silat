package panawa.silat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import panawa.silat.BelajarBelaanActivity;
import panawa.silat.BelajarSikapActivity;
import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/3/16.
 */
public class FragmentBelaan extends Fragment {
    Button belajarBelaan;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View belaanView = inflater.inflate(R.layout.fragment_belaan, container, false);

        belajarBelaan = (Button) belaanView.findViewById(R.id.bBelajarBelaan);
        belajarBelaan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BelajarBelaanActivity.class);
                startActivity(intent);
            }
        });

        return belaanView;
        
    }
}
