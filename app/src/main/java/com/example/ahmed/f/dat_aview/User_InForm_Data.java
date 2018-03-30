package com.example.ahmed.f.dat_aview;

/**
 * Created by Ahmed on 3/28/2018.
 */

public class User_InForm_Data {

    public String image_progects;
    public String name_progects;
    public String discrption_progects;
    public String salary_progects;
    public String salarynumper_progects;
    public String url_progects;


    public User_InForm_Data(String image_progects, String name_progects, String discrption_progects, String salary_progects, String salarynumper_progects, String url_progects) {
        this.image_progects = image_progects;
        this.name_progects = name_progects;
        this.discrption_progects = discrption_progects;
        this.salary_progects = salary_progects;
        this.salarynumper_progects = salarynumper_progects;
        this.url_progects = url_progects;
    }

    public User_InForm_Data() {
    }

    public String getImage_progects() {
        return image_progects;
    }

    public void setImage_progects(String image_progects) {
        this.image_progects = image_progects;
    }

    public String getName_progects() {
        return name_progects;
    }

    public void setName_progects(String name_progects) {
        this.name_progects = name_progects;
    }

    public String getDiscrption_progects() {
        return discrption_progects;
    }

    public void setDiscrption_progects(String discrption_progects) {
        this.discrption_progects = discrption_progects;
    }

    public String getSalary_progects() {
        return salary_progects;
    }

    public void setSalary_progects(String salary_progects) {
        this.salary_progects = salary_progects;
    }

    public String getSalarynumper_progects() {
        return salarynumper_progects;
    }

    public void setSalarynumper_progects(String salarynumper_progects) {
        this.salarynumper_progects = salarynumper_progects;
    }

    public String getUrl_progects() {
        return url_progects;
    }

    public void setUrl_progects(String url_progects) {
        this.url_progects = url_progects;
    }
}
