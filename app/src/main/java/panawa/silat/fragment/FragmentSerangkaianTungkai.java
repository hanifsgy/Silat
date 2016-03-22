package panawa.silat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import panawa.silat.R;
import panawa.silat.SeranganTungkaiActivity;

/**
 * Created by hanifsugiyanto on 3/3/16.
 */
public class FragmentSerangkaianTungkai extends Fragment {
    Button seranganTungkai;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.fragment_serangan_tungkai, container, false);
        seranganTungkai = (Button) sikapView.findViewById(R.id.bSeranganTungkai);
        seranganTungkai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),SeranganTungkaiActivity.class);
                startActivity(intent);
            }
        });

        return sikapView;
    }
}
