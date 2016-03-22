package panawa.silat.fragment.seranganTungkai;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;

import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/9/16.
 */
public class TendanganLurus extends Fragment {
//    ScrollView scrollView;
//    TextView textView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.fragment_serangan_tungkai_lurus, container, false);
//        textView = (TextView) getActivity().findViewById(R.id.textLurus);
//        scrollView = (ScrollView) getActivity().findViewById(R.id.scrollVertical);
//        scrollView.addView(textView);

        return sikapView;
    }
}
