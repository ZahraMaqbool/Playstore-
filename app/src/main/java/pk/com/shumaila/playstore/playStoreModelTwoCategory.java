package pk.com.shumaila.playstore;

import java.util.Objects;

public class playStoreModelTwoCategory {

    private String categoryName;

    public playStoreModelTwoCategory() {
    }

    public playStoreModelTwoCategory(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof playStoreModelTwoCategory)) return false;
        playStoreModelTwoCategory that = (playStoreModelTwoCategory) o;
        return Objects.equals(categoryName, that.categoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(categoryName);
    }

    @Override
    public String toString() {
        return "playStoreModelTwoCategory{" +
                "categoryName='" + categoryName + '\'' +
                '}';
    }

    //    public class Category {
//        private String name;
//
//        public Category() {
//        }
//
//        public Category(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        @Override
//        public String toString() {
//            return "Category{" +
//                    "name='" + name + '\'' +
//                '}';
//    }
//
//
//    }
}
