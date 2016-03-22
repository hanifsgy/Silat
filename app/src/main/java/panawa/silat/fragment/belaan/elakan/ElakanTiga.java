package panawa.silat.fragment.belaan.elakan;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/6/16.
 */
public class ElakanTiga extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View elakanView = inflater.inflate(R.layout.fragment_elakan_samping, container, false);


        return elakanView;
    }
}
