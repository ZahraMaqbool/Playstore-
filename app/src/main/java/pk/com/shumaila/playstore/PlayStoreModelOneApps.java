package pk.com.shumaila.playstore;

import java.util.Objects;

public class PlayStoreModelOneApps {

    private int imageResourceidForApps;
    private String appName;

    public PlayStoreModelOneApps() {
    }


    public PlayStoreModelOneApps(int imageResourceidForApps, String appName) {
        this.imageResourceidForApps = imageResourceidForApps;
        this.appName = appName;
    }



    public int getImageResourceidForApps() {
        return imageResourceidForApps;
    }

    public void setImageResourceidForApps(int imageResourceidForApps) {
        this.imageResourceidForApps = imageResourceidForApps;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }


    @Override
    public String toString() {
        return "PlayStoreModelOneApps{" +
                "imageResourceidForApps=" + imageResourceidForApps +
                ", appName='" + appName + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PlayStoreModelOneApps)) return false;
        PlayStoreModelOneApps that = (PlayStoreModelOneApps) o;
        return imageResourceidForApps == that.imageResourceidForApps && Objects.equals(appName, that.appName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imageResourceidForApps, appName);
    }
}
   /* public class App {
        private int imageResourceId;
        private  String name;

        public App(int img_1) {
        }

        public App(int imageResourceId, String name) {
            this.imageResourceId = imageResourceId;
            this.name = name;
        }



        public int getImageResourceId() {
            return imageResourceId;
        }

        public void setImageResourceId(int imageResourceId) {
            this.imageResourceId = imageResourceId;
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "App{" +
                    "imageResourceId=" + imageResourceId +
                    ", name='" + name + '\'' +
           '}';*/



