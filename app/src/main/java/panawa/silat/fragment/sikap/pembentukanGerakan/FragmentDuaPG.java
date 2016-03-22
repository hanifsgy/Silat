package panawa.silat.fragment.sikap.pembentukanGerakan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/4/16.
 */
public class FragmentDuaPG extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.fragment_pg_dua, container, false);


        return sikapView;

    }
}