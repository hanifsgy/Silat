package panawa.silat.fragment.sikap.pembentukanGerakan.sikapHormat;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/7/16.
 */
public class SikapHormat extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View hormatView = inflater.inflate(R.layout.fragment_sikap_hormat, container, false);


        return hormatView;

    }
}
