package panawa.silat.fragment;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import panawa.silat.R;

/**
 * Created by hanifsugiyanto on 3/15/16.
 */
public class FragmentPasang extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_video_pasang, container, false);

//        final VideoView videoView = (VideoView) view.findViewById(R.id.videoView);
////        Uri video = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.pasang_dua_lengan_rendah);
//        Uri video = Uri.parse("android.resource://[package]/"+R.raw.tepisan);
//        videoView.setVideoURI(video);
//        videoView.start();


        return view;
    }
}
