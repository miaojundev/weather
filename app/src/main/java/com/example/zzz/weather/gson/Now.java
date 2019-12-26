package com.example.zzz.weather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zzz on 2019/12/26.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }
}
