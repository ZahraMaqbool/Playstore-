package pk.com.shumaila.playstore;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView ivDpImage;
    RecyclerView rvRecyclerview;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvRecyclerview=findViewById(R.id.rvRecyclerview);

       ivDpImage = findViewById(Rgit.id.ivDpImage);



        rvRecyclerview = findViewById(R.id.rvRecyclerview);
        VerticalAppListAdapter adapter = new VerticalAppListAdapter(childMode(), ParentMode());


        rvRecyclerview.setAdapter(adapter);
        rvRecyclerview.setLayoutManager(new LinearLayoutManager(this));

        rvRecyclerview.setHasFixedSize(true);
    }


    public List<List<PlayStoreModelOneApps>> childMode() {
        List<List<PlayStoreModelOneApps>> appList = new ArrayList<>();
        appList.add(RecommendedForYou());

        appList.add(PopularApp());
        appList.add(Education());
        appList.add(VideoChattingApp());
        appList.add(EditingLikePro());
        appList.add(SocialsApp());
        return appList;

    }

//    public List<playStoreModelTwoCategory>ParentMode(){
//        List<playStoreModelTwoCategory> categoryList = new ArrayList<>();
//        categoryList.add(new playStoreModelTwoCategory("Recommended For You"));
//        categoryList.add(new playStoreModelTwoCategory("Popular Apps"));
//        categoryList.add(new playStoreModelTwoCategory("Education"));
//        categoryList.add(new playStoreModelTwoCategory("Video Chatting"));
//        categoryList.add(new playStoreModelTwoCategory("Editing like Pro"));
//        categoryList.add(new playStoreModelTwoCategory("Social Apps"));
//        return categoryList;
//
//
//
//    }
//    public List<PlayStoreModelOneApps> RecommendedForYou(){
//        List<PlayStoreModelOneApps> appList=new ArrayList<>();
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"TikTok \n 4.9* \n 42 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"SnapChat\n 2.3*\n 45MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Temo \n3.1*\n 23MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Messanger\n 5.1*\n 40MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Likee\n2.1*\n 21MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Bigoo Live\n 3.1*\n 23MB"));
//        return appList;
//
//
//    }

//}





    public List<playStoreModelTwoCategory>ParentMode(){
        List<playStoreModelTwoCategory> categoryList=new ArrayList<>();
        categoryList.add(new playStoreModelTwoCategory("Recommended For You"));
        categoryList.add(new playStoreModelTwoCategory("Recommended For You"));
        categoryList.add(new playStoreModelTwoCategory("Recommended For You"));


//        categoryList.add(new Category("Popular Apps"));
//        categoryList.add(new Category("Education"));
//        categoryList.add(new Category("Video Chatting"));
//        categoryList.add(new Category("Editing like Pro"));
//        categoryList.add(new Category("Social Apps"));
        return categoryList;



    }
    public List<PlayStoreModelOneApps> RecommendedForYou() {
        List<PlayStoreModelOneApps> appList1 = new ArrayList<>();
        appList1.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
        appList1.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
        appList1.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));


//        appList1.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));

//        appList.add(new App(R.drawable.img_2,"TikTok \n 4.9* \n 42 MB"));
//        appList.add(new App(R.drawable.img_3,"SnapChat\n 2.3*\n 45MB"));
//        appList.add(new App(R.drawable.img_4,"Temo \n3.1*\n 23MB"));
//        appList.add(new App(R.drawable.img_5,"Messanger\n 5.1*\n 40MB"));
//        appList.add(new App(R.drawable.img_6,"Likee\n2.1*\n 21MB"));
//        appList.add(new App(R.drawable.img_7,"Bigoo Live\n 3.1*\n 23MB"));
        return appList1;

    }
        public List<PlayStoreModelOneApps> PopularApp () {
            List<PlayStoreModelOneApps> appList2 = new ArrayList<>();
            appList2.add(new PlayStoreModelOneApps(R.drawable.girl, "Twitch\n 45MB"));
            appList2.add(new PlayStoreModelOneApps(R.drawable.girl, "Twitch\n 45MB"));
            appList2.add(new PlayStoreModelOneApps(R.drawable.girl, "Twitch\n 45MB"));

//        appList.add(new PlayStoreModelOneApps(R.drawable.girl, "Threads \n 34MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl, "FaceBook\n 34MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl, "Text Now\n 40MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl, "Whatsapp\n 34MB"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl, "RedIt\n 32MB"));
            return appList2;


        }
        public List<PlayStoreModelOneApps> Education () {
            List<PlayStoreModelOneApps> appList3 = new ArrayList<>();
            //appList.add(new playStoreModelTwoCategory(R.drawable.girl,"Zoom \n34MB"));
            appList3.add(new PlayStoreModelOneApps(R.drawable.girl, "Class Dojo\n 23Mb"));
            appList3.add(new PlayStoreModelOneApps(R.drawable.girl, "Learning \n34Mb"));
            appList3.add(new PlayStoreModelOneApps(R.drawable.girl, "Google ClassRoom\n34Mb"));
            appList3.add(new PlayStoreModelOneApps(R.drawable.girl, "E_Learning \n40Mb"));
            return appList3;


        }

        public List<PlayStoreModelOneApps> VideoChattingApp() {
            List<PlayStoreModelOneApps> appList4 = new ArrayList<>();
            appList4.add(new PlayStoreModelOneApps(R.drawable.girl, "Chamet \n23MB"));
            appList4.add(new PlayStoreModelOneApps(R.drawable.girl, "Chamet \n23MB"));
            appList4.add(new PlayStoreModelOneApps(R.drawable.girl, "Chamet \n23MB"));
            appList4.add(new PlayStoreModelOneApps(R.drawable.girl, "Chamet \n23MB"));


//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Video Call \n 40Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Whatsapp \n32Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Skip\n 40Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Glide\n 40Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Tawasl\n 23Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Comera\n 21Mb"));
//        appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Botim\n 20Mb"));
            return appList4;


        }
        public List<PlayStoreModelOneApps> SocialsApp() {
            List<PlayStoreModelOneApps> appList5 = new ArrayList<>();
            appList5.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
            appList5.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
            appList5.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
            appList5.add(new PlayStoreModelOneApps(R.drawable.girl, "InstaGram \n4.6* \n 45 MB"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"InstaGram \n4.6* \n 45 MB"));

//        appList.add(new App(R.drawable.img_2,"TikTok \n 4.9* \n 42 MB"));
//        appList.add(new App(R.drawable.img_3,"SnapChat\n 2.3*\n 45MB"));
//        appList.add(new App(R.drawable.img_4,"Temo \n3.1*\n 23MB"));
//        appList.add(new App(R.drawable.img_5,"Messanger\n 5.1*\n 40MB"));
//        appList.add(new App(R.drawable.img_6,"Likee\n2.1*\n 21MB"));
//        appList.add(new App(R.drawable.img_7,"Bigoo Love\n 3.1*\n 23MB"));
//        appList.add(new App(R.drawable.img_9,"Busines Whatsapp \n40MB"));
//        appList.add(new App(R.drawable.img_10,"GB Whatsapp\n 20Mb"));
            return appList5;
        }

        public List<PlayStoreModelOneApps> EditingLikePro() {
            List<PlayStoreModelOneApps> appList6 = new ArrayList<>();
            appList6.add(new PlayStoreModelOneApps(R.drawable.girl, "Picsart\n 40Mb"));
            appList6.add(new PlayStoreModelOneApps(R.drawable.girl, "Picsart\n 40Mb"));
            appList6.add(new PlayStoreModelOneApps(R.drawable.girl, "Picsart\n 40Mb"));
            appList6.add(new PlayStoreModelOneApps(R.drawable.girl, "Picsart\n 40Mb"));

//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Picsart\n 40Mb"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Picsart\n 40Mb"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Picsart\n 40Mb"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Picsart\n 40Mb"));
//    appList.add(new PlayStoreModelOneApps(R.drawable.girl,"Picsart\n 40Mb"));

//        appList.add(new App(R.drawable.img_28,"Photo ShOP \n30Mb"));
//        appList.add(new App(R.drawable.img_29,"Photo editor\n 30Mb"));
//        appList.add(new App(R.drawable.img_30,"Collage Maker\n 30Mb"));
//        appList.add(new App(R.drawable.img_31,"video editor \n 40Mb"));
//        appList.add(new App(R.drawable.img_32,"Photo Collage App \n 30Mb"));
            return appList6;

        }
    }

