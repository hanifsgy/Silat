package panawa.silat.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import panawa.silat.BelajarSikapActivity;
import panawa.silat.KudaActivity;
import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/3/16.
 */
public class FragmentKudaKuda extends Fragment{
    Button bKuda;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.fragment_kuda_kuda, container, false);

        bKuda = (Button) sikapView.findViewById(R.id.bKudaKuda);
        bKuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KudaActivity.class);
                startActivity(intent);
            }
        });
        return sikapView;
    }
}
