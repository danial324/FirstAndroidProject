package com.example.myappquran1;

public class Surah_Details {
    private String intro;
    private String eName;
    private String uName;
    private String nazool;

    public Surah_Details(String intro, String eName, String uName, String nazool) {
        this.intro = intro;
        this.eName = eName;
        this.uName = uName;
        this.nazool = nazool;
    }

    public Surah_Details() {
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setNazool(String nazool) {
        this.nazool = nazool;
    }

    public String getIntro() {
        return intro;
    }

    public String geteName() {
        return eName;
    }

    public String getuName() {
        return uName;
    }

    public String getNazool() {
        return nazool;
    }
}
