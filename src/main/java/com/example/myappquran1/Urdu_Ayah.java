package com.example.myappquran1;

public class Urdu_Ayah {
    private String urduAyah;
    private String urduTranslation;

    public Urdu_Ayah(String ayah, String englishTranslation) {
        this.urduAyah = ayah;
        this.urduTranslation = englishTranslation;
    }

    public Urdu_Ayah() {
    }

    public String getEngAyah() {
        return urduAyah;
    }

    public void setEngAyah(String engAyah) {
        this.urduAyah = engAyah;
    }

    public String getEngTranslation() {
        return urduTranslation;
    }

    public void setEngTranslation(String engTranslation) {
        this.urduTranslation = engTranslation;
    }

}
