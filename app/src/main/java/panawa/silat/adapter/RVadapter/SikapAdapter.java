package panawa.silat.adapter.RVadapter;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import panawa.silat.R;
import panawa.silat.model.SikapList;

/**
 * Created by hanifsugiyanto on 3/5/16.
 */
public class SikapAdapter extends RecyclerView.Adapter<SikapAdapter.SikapViewHolder> {
    private List<SikapList> sikapLists;


    public SikapAdapter(List<SikapList> sikapLists) {
        this.sikapLists = sikapLists;
//        this.recyclerView = recyclerView;
//        final LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
//        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
//            @Override
//            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
//                super.onScrolled(recyclerView, dx, dy);
//                totalItemCount = linearLayoutManager.getItemCount();
//                lastVisibleItem = linearLayoutManager.findLastVisibleItemPosition();
//
//                if (!isLoading && totalItemCount <= (lastVisibleItem + visibleThreshold)) {
////                    if (mOnLoadNextListener != null) {
////                        mOnLoadNextListener.onLoadMore();
////                    }
//                    isLoading = true;
//                }
//            }
//        });
    }


//    public void setOnLoadNextListener(OnLoadNextListener mOnLoadNextListener) {
//        this.mOnLoadNextListener = mOnLoadNextListener;
//    }

//    @Override
//    public int getItemViewType(int position) {
//        return sikapLists.get(position);
//    }

    @Override
    public SikapViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sikap_list_content, parent, false);

        return new SikapViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SikapViewHolder sikapViewHolder, int position) {
        SikapList sikapList = sikapLists.get(position);
        sikapViewHolder.title.setText(sikapList.getTitle());
        sikapViewHolder.content.setText(sikapList.getContent());
    }

    @Override
    public int getItemCount() {
        return sikapLists.size();
    }

    public static class SikapViewHolder extends RecyclerView.ViewHolder{
        public TextView title,content;


        public SikapViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.tvTitle);
            content = (TextView) itemView.findViewById(R.id.tvContent);
        }
    }
}
