package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * Created by kang on 2017/3/23.
 */

public class County extends DataSupport {

    private int id;
    private String countyName;
    private String weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
