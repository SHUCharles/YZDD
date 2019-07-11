package com.it.shu.entity;

public class ImageVO {
    private String image_id;
    private String data_id;
    private String image_name;
    private String image_address;
    private Double data_horizontal;
    private Double data_ordinate;

    public String getImage_id() {
        return image_id;
    }

    public void setImage_id(String image_id) {
        this.image_id = image_id;
    }

    public String getData_id() {
        return data_id;
    }

    public void setData_id(String data_id) {
        this.data_id = data_id;
    }

    public String getImage_name() {
        return image_name;
    }

    public void setImage_name(String image_name) {
        this.image_name = image_name;
    }

    public String getImage_address() {
        return image_address;
    }

    public void setImage_address(String image_address) {
        this.image_address = image_address;
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
}
