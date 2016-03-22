package panawa.silat.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import panawa.silat.BelajarSikapActivity;
import panawa.silat.MainActivity;
import panawa.silat.R;
import panawa.silat.adapter.RVadapter.SikapAdapter;
import panawa.silat.model.SikapList;

/**
 * Created by hanifsugiyanto on 3/3/16.
 */
public class FragmentSikap extends Fragment {
    protected RecyclerView.LayoutManager mLayoutManager;
    RecyclerView recyclerView;
    LinearLayoutManager llm;
    SikapAdapter sikapAdapter;
    List<SikapList> sikapLists = new ArrayList<>();
    Button bSikap;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View sikapView = inflater.inflate(R.layout.fragment_sikap, container, false);

//        recyclerView = (RecyclerView) sikapView.findViewById(R.id.rvSikap);
//        sikapAdapter = new SikapAdapter(sikapLists);
//        recyclerView.setHasFixedSize(true);
//        mLayoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setLayoutManager(mLayoutManager);
//        recyclerView.setItemAnimator(new DefaultItemAnimator());
//        recyclerView.setAdapter(sikapAdapter);
////        llm = new LinearLayoutManager(getActivity());
////        mLayoutManager = new LinearLayoutManager(getActivity());
////        recyclerView.setItemAnimator(new DefaultItemAnimator());
////        sikapLists = new ArrayList<>();
//
////        recyclerView.setHasFixedSize(true);
//
//
        bSikap = (Button) sikapView.findViewById(R.id.bSikapPencakSilat);
        bSikap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BelajarSikapActivity.class);
                startActivity(intent);
            }
        });
//        recyclerView.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), recyclerView, new ClickListener() {
//            @Override
//            public void onClick(View view, int position) {
//                SikapList data = sikapLists.get(position);
//                Toast.makeText(getActivity(), data.getTitle() + " is selected!", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onLongClick(View view, int position) {
//
//            }
//        }));

//        fetchSikapContent();
        return sikapView;
    }
//    private void fetchSikapContent(){
//       SikapList data = new SikapList("Pembentukan Gerakan","Belajar sikap pembentukan gerakan dalam pencak silat");
//       sikapLists.add(data) ;
//
//        data = new SikapList("Sikap Duduk","Belajar sikap duduk dalam pencak silat");
//        sikapLists.add(data);
//
//        data = new SikapList("Sikap Hormat dan Tegak","Belajar sikap hormat dan tegak dalam pencak silat");
//        sikapLists.add(data);
//
//        data = new SikapList("Sikap Pasang","Belajar sikap pasang dalam pencak silat");
//        sikapLists.add(data);
//
//        sikapAdapter.notifyDataSetChanged();
//    }
//
//    public interface ClickListener {
//        void onClick(View view, int position);
//
//        void onLongClick(View view, int position);
//    }
//    class RecyclerTouchListener implements RecyclerView.OnItemTouchListener {
//
//        private GestureDetector gestureDetector;
//        private FragmentSikap.ClickListener clickListener;
//
//        public RecyclerTouchListener(Context context, final RecyclerView recyclerView, final FragmentSikap.ClickListener clickListener) {
//            this.clickListener = clickListener;
//            gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener() {
//                @Override
//                public boolean onSingleTapUp(MotionEvent e) {
//                    return true;
//                }
//
//                @Override
//                public void onLongPress(MotionEvent e) {
//                    View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
//                    if (child != null && clickListener != null) {
//                        clickListener.onLongClick(child, recyclerView.getChildPosition(child));
//                    }
//                }
//            });
//        }
//
//        @Override
//        public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
//
//            View child = rv.findChildViewUnder(e.getX(), e.getY());
//            if (child != null && clickListener != null && gestureDetector.onTouchEvent(e)) {
//                clickListener.onClick(child, rv.getChildPosition(child));
//            }
//            return false;
//        }
//
//        @Override
//        public void onTouchEvent(RecyclerView rv, MotionEvent e) {
//        }
//
//        @Override
//        public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
//
//        }
//    }


}
