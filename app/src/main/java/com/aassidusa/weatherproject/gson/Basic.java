package com.aassidusa.weatherproject.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2018\2\25 0025.
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
