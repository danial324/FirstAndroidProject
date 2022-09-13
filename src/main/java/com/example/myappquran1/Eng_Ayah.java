package com.example.myappquran1;

public class Eng_Ayah {
    private String engAyah;
    private String engTranslation;

    public Eng_Ayah(String ayah, String englishTranslation) {
        this.engAyah = ayah;
        this.engTranslation = englishTranslation;
    }

    public Eng_Ayah() {
    }

    public String getEngAyah() {
        return engAyah;
    }

    public void setEngAyah(String engAyah) {
        this.engAyah = engAyah;
    }

    public String getEngTranslation() {
        return engTranslation;
    }

    public void setEngTranslation(String engTranslation) {
        this.engTranslation = engTranslation;
    }

}
