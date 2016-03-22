package panawa.silat.fragment.belaan.elakan.hindaran;

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
public class HindaranSatu extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View elakanView = inflater.inflate(R.layout.fragment_hindaran_kaki_silang, container, false);


        return elakanView;
    }
}

