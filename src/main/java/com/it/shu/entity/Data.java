package com.it.shu.entity;

import java.util.Date;

public class Data {
    private String data_id;
    private Double data_horizontal;
    private Double data_ordinate;
    private Date update_time;

    public String getData_id() {
        return data_id;
    }

    public void setData_id(String data_id) {
        this.data_id = data_id;
    }

    public Double getData_horizontal() {
        return data_horizontal;
    }

    public void setData_horizontal(Double data_horizontal) {
        this.data_horizontal = data_horizontal;
    }

    public Double getData_ordinate() {
        return data_ordinate;
    }

    public void setData_ordinate(Double data_ordinate) {
        this.data_ordinate = data_ordinate;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
