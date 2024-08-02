package pk.com.shumaila.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VerticalAppListAdapter extends RecyclerView.Adapter<VerticalAppListAdapter.VerticalListViewHolder> {


    List<List<PlayStoreModelOneApps>> appList;
    List<playStoreModelTwoCategory> categoryList;

    public VerticalAppListAdapter(List<List<PlayStoreModelOneApps>> appList, List<playStoreModelTwoCategory> categoryList) {
        this.appList = appList;
        this.categoryList = categoryList;
    }




    @NonNull
    @Override
    public VerticalListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootViewVertical = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_vertical_applist, null);
        return new VerticalListViewHolder(rootViewVertical);

    }

    @Override
    public void onBindViewHolder(@NonNull VerticalListViewHolder holder, int position) {
//        Category category=categoryList.get(position);

        holder.tvCategoryName.setText(categoryList.get(position).getCategoryName());
        holder.rvHorizontalAppList.setAdapter(new HorizontalAppListAdapter(appList.get(position)));
        holder.rvHorizontalAppList.setHasFixedSize(true);
        holder.rvHorizontalAppList.setLayoutManager( new LinearLayoutManager(( holder.rvHorizontalAppList.getContext()),LinearLayoutManager.HORIZONTAL,false));

    }
    @Override
    public int getItemCount() {
        return categoryList.size();
    }


    class VerticalListViewHolder extends RecyclerView.ViewHolder{
        RecyclerView rvHorizontalAppList;
        TextView tvCategoryName;

        public VerticalListViewHolder(@NonNull View itemView) {
            super(itemView);
            rvHorizontalAppList=itemView.findViewById(R.id.rvHorizontalAppList);
            tvCategoryName=itemView.findViewById(R.id.tvCategoryName);

        }

    }
    static class AdsViewHolder extends RecyclerView.ViewHolder{
        ImageView ivAds;

        public AdsViewHolder(@NonNull View itemView) {
            super(itemView);
            ivAds=itemView.findViewById(R.id.ivAds);
        }
    }
    interface OnImageClickListener{
        void onImageClick();
}
}


