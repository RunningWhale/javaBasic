package org.example.entity;

public class Provice {
    private Integer id;
    private String name;
    private String jiancheng;
    private String shenghui;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJiancheng(String jiancheng) {
        this.jiancheng = jiancheng;
    }

    public void setShenghui(String shenghui) {
        this.shenghui = shenghui;
    }

    public String getName() {
        return name;
    }

    public String getJiancheng() {
        return jiancheng;
    }

    public String getShenghui() {
        return shenghui;
    }
}
