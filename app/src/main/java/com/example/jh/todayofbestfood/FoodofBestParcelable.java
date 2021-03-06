package com.example.jh.todayofbestfood;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by pdg on 2017-05-24.
 */

public class FoodofBestParcelable implements Parcelable {

    private String _tableid;
    private String _restaurantName;
    private String _recommendMenu;
    private float _restaurantgrade;
    private String _latitude;
    private String _longitude;
    private String _foodImgName;
    private String _foodTagName;
    private String _foodPostscript;

    public String get_restaurantName() {
        return _restaurantName;
    }

    public String get_recommendMenu() {
        return _recommendMenu;
    }

    public float get_restaurantgrade() {
        return _restaurantgrade;
    }

    public String get_latitude() {
        return _latitude;
    }

    public String get_longitude() {
        return _longitude;
    }

    public String get_foodImgName() {
        return _foodImgName;
    }

    public String get_foodTagName() {
        return _foodTagName;
    }

    public String get_foodPostscript() {
        return _foodPostscript;
    }

    public FoodofBestParcelable(String name, String menu, float grade, String postscript,
                                String latitude, String longitude, String imgName,
                                String tagname) {

        System.out.println("FoodofBestParcelable 생성");
        _restaurantName = name;
        _recommendMenu = menu;
        _restaurantgrade = grade;

        _latitude = latitude;
        _longitude = longitude;
        _foodImgName = imgName;
        _foodTagName = tagname;
        _foodPostscript = postscript;
    }

    public FoodofBestParcelable(Parcel src){
        _restaurantName = src.readString();
        _recommendMenu = src.readString();
        _restaurantgrade = src.readFloat();
        _latitude = src.readString();
        _longitude = src.readString();
        _foodImgName = src.readString();
        _foodTagName = src.readString();
        _foodPostscript = src.readString();
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator(){
        public FoodofBestParcelable createFromParcel(Parcel in){
            return new FoodofBestParcelable(in);
        }

        public FoodofBestParcelable[] newArray(int size){
            return new FoodofBestParcelable[size];
        }

    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(_restaurantName);
        dest.writeString(_recommendMenu);
        dest.writeFloat(_restaurantgrade);
        dest.writeString(_latitude);
        dest.writeString(_longitude);
        dest.writeString(_foodImgName);
        dest.writeString(_foodTagName);
        dest.writeString(_foodPostscript);
    }
}
