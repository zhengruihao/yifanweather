package com.example.yifanweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by watermelon on 2017/1/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
