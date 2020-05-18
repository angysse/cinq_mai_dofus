package com.example.cinq_mai_dofus.presentation.model;


import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Arme  implements Parcelable  {

    private String name;
    private String imgUrl;
    private String description;


    private String type;
    private int level;



    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public Arme(Parcel in){
        String[] data= new String[5];

        in.readStringArray(data);
        this.name= data[0];
        this.imgUrl= data[1];
        this.description= data[2];
        this.type= data[3];
        this.level= Integer.parseInt(data[4]);
    }



    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeStringArray(new String[]{this.name,this.imgUrl,this.description,this.type,String.valueOf(this.level)});
    }

    public static final Parcelable.Creator<Arme> CREATOR= new Parcelable.Creator<Arme>() {

        @Override
        public Arme createFromParcel(Parcel source) {
            return new Arme(source);  //using parcelable constructor
        }

        @Override
        public Arme[] newArray(int size) {
            return new Arme[size];
        }
    };



    @Override
    public int describeContents() {
        return 0;
    }


}



