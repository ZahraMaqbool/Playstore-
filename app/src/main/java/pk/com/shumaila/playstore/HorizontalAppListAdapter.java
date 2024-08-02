package pk.com.shumaila.playstore;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class HorizontalAppListAdapter extends RecyclerView.Adapter<pk.com.shumaila.playstore.HorizontalAppListAdapter.HorizontalAppListViewHolder> {

        List<PlayStoreModelOneApps> modelappList;

        public HorizontalAppListAdapter(List<PlayStoreModelOneApps> appList) {
            this.modelappList = appList;
        }

    public HorizontalAppListAdapter(List<List<PlayStoreModelOneApps>> lists, List<playStoreModelTwoCategory> playStoreModelTwoCategories) {
    }

    @NonNull
        @Override
        public HorizontalAppListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View rootViewHorizontalApp= LayoutInflater.from(parent.getContext()).inflate(R.layout.row_view_ads_horizontal,null);
            return new HorizontalAppListViewHolder(rootViewHorizontalApp);
        }

        @Override
        public void onBindViewHolder(@NonNull HorizontalAppListViewHolder holder, int position) {
            holder.tvAppsName.setText(modelappList.get(position).getAppName());
            holder.ivAppsImage.setImageResource(modelappList.get(position).getImageResourceidForApps());

//            holder.tvAppName.setText(appList.get(position).getName());
//            holder.ivApp.setImageResource(appList.get(position).getImageResourceId());


        }

        @Override
        public int getItemCount() {
            return modelappList.size();
        }

        class HorizontalAppListViewHolder extends RecyclerView.ViewHolder{

            ImageView ivAppsImage;
            TextView tvAppsName;


            public HorizontalAppListViewHolder(@NonNull View itemView) {
                super(itemView);
                ivAppsImage = itemView.findViewById(R.id.ivAppImage);
                tvAppsName = itemView.findViewById(R.id.tvAppName);

            }
        }


}
















//    class AdsViewHolder extends RecyclerView.ViewHolder{
//        ImageView ivAds;
//
//        public AdsViewHolder(@NonNull View itemView) {
//            super(itemView);
//            ivAds=itemView.findViewById(R.id.ivAds);
//        }
//    }

