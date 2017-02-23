package com.example.yifanweather.gson;

/**
 * Created by watermelon on 2017/2/23.
 */

import com.google.gson.annotations.SerializedName;

/**
 * Created by watermelon on 2017/1/26.
 */

public class Forecast {
    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
