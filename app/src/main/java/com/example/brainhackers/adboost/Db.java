package com.example.brainhackers.adboost;

/**
 * Created by shivang on 28/10/17.
 */

public class Db {
    private String Dbid;
    private String Area;
    private String Hoarding;
    private int eyeCount;

    public Db(){

    }

    public Db(String dbid, String area, String hoarding, int eyeCount) {
        this.Dbid = dbid;
        this.Area = area;
        this.Hoarding = hoarding;
        this.eyeCount = eyeCount;
    }

    public String getDbid(){
        return this.Dbid;
    }

    public String getArea(){
        return this.Area;
    }

    public String getHoarding(){
        return this.Hoarding;
    }

    public int eyeCount(){
        return this.eyeCount;
    }


}
