package com.example.sqlite;

import android.widget.Switch;

public class Computermodel {

    private  int id;
    private String name;
    private String Age ;
    private  String booleanisactive;
    private String switch1;

    public Computermodel(int id, String name, String age, String booleanisactive) {
        this.id = id;
        this.name = name;
        Age = age;
        this.booleanisactive = booleanisactive;
    }

    public Computermodel(int id, String error, int i, boolean b) {
    }



    public Computermodel(String columnCustomerName, String columnCustmoerAge, String columnCustmoerAge1, String columnId) {

    }

    public Computermodel() {
    }

    public Computermodel(int i, String toString, int parseInt){


    }

    public static String getID() {
    }
    @Override
    public String toString() {
        return "Computermodel{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", Age='" + Age + '\'' +
                ", booleanisactive=" + booleanisactive + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getBooleanisactive() {
        return booleanisactive;
    }

    public void setBooleanisactive(String booleanisactive) {
        this.booleanisactive = booleanisactive;
    }
}
