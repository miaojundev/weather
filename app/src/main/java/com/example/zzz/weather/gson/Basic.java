package com.example.zzz.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzz on 2019/12/26.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }
}
