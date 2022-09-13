package com.example.myappquran1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DatabaseAccess {
    private final SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor c=null;
    //private constructor so that object creation from outside of class can be avoided
    private DatabaseAccess(Context context){
        this.openHelper=new DatabaseOpenHelper(context);
    }
    public static DatabaseAccess getInstance(Context context)
    {
        if(instance==null)
        {
            instance=new DatabaseAccess(context);
        }
        return instance;
    }
    public void open()
    {
        this.db=openHelper.getWritableDatabase();
    }
    public void close()
    {
        if(db!=null)
        {
            this.db.close();
        }
    }
    public String getTranslation(int id)
    {
        c=db.rawQuery("Select MehmoodulHassan from tayah where SuraID = "+id+"",new String[]{});
        StringBuffer buffer =new StringBuffer();
        while(c.moveToNext()){
            String address=c.getString(0);
            buffer.append(""+address);

        }
        return buffer.toString();
    }
    public ArrayList getSurahAyahs(int Surah_no)
    {
        c=db.rawQuery("Select ArabicText,FatehMuhammadJalandhri,MuftiTaqiUsmani from tayah where SuraID = "+Surah_no+"",new String[]{});
        ArrayList<Ayah> SurahAyahs=new ArrayList<>();
        Ayah ayahs;
        while(c.moveToNext()){
            String ayah=c.getString(0);
            String urduTranslatiom=c.getString(1);
            String englishTranslation=c.getString(2);
            ayahs=new Ayah(ayah,urduTranslatiom,englishTranslation);
            SurahAyahs.add(ayahs);
        }
        return SurahAyahs;
    }

    public Ayah getSurahAyah(int Ayah_no)
    {
        c=db.rawQuery("Select ArabicText,FatehMuhammadJalandhri,MuftiTaqiUsmani from tayah where AyaID = "+Ayah_no+"",new String[]{});
        //ArrayList<Ayah> SurahAyah=new ArrayList<>();
        Ayah ayahs = new Ayah();
        while(c.moveToNext()){
            String ayah=c.getString(0);
            String urduTranslatiom=c.getString(1);
            String englishTranslation=c.getString(2);
            ayahs=new Ayah(ayah,urduTranslatiom,englishTranslation);
            //SurahAyah.add(ayahs);
        }
        return ayahs;
    }

    public ArrayList getSurahAyahUrdu(int Ayah_no)
    {
        c=db.rawQuery("Select ArabicText,FatehMuhammadJalandhri from tayah where SuraID = "+Ayah_no+"",new String[]{});
        //ArrayList<Ayah> SurahAyah=new ArrayList<>();
        ArrayList<Urdu_Ayah> UrduAyahs=new ArrayList<>();
        Urdu_Ayah ayahs1 = new Urdu_Ayah();
        while(c.moveToNext()){
            String ayah1=c.getString(0);
            String urduTranslatiom1=c.getString(1);
            ayahs1=new Urdu_Ayah(ayah1,urduTranslatiom1);
            UrduAyahs.add(ayahs1);
        }
        return UrduAyahs;
    }

    public Surah_Details getSurahDetails(int Sura_no)
    {
        c=db.rawQuery("Select SurahIntro,SurahNameE,SurahNameU,Nazool from tsurah where SurahID = "+Sura_no+"",new String[]{});
        //ArrayList<Ayah> SurahAyah=new ArrayList<>();
        Surah_Details sd = new Surah_Details();
        while(c.moveToNext()){
            String intro=c.getString(0);
            String ename=c.getString(1);
            String uname=c.getString(2);
            String nazool=c.getString(3);
            sd=new Surah_Details(intro,ename,uname,nazool);
            //SurahAyah.add(ayahs);
        }
        return sd;
    }

}
