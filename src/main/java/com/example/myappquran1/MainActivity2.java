package com.example.myappquran1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity2 extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {
                    case R.id.nav_engTranslation:
                        //Toast.makeText(getApplicationContext(),"Search by Ayat clicked",Toast.LENGTH_LONG).show();
                        Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                        startActivity(intent1);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_urduTranslation:
                        //Toast.makeText(getApplicationContext(),"Search by Ayat clicked",Toast.LENGTH_LONG).show();
                        Intent intent5 = new Intent(MainActivity2.this, Surah_List.class);
                        intent5.putExtra("type","Urdu");
                        startActivity(intent5);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_surahDetails:
                        //Toast.makeText(getApplicationContext(),"Search by Ayat clicked",Toast.LENGTH_LONG).show();
                        Intent intent2 = new Intent(MainActivity2.this, sDetails_List.class);
                        startActivity(intent2);
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.nav_surah :
                        //Toast.makeText(getApplicationContext(),"Search by Surat clicked",Toast.LENGTH_LONG).show();
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent3 = new Intent(MainActivity2.this, Surah_List.class);
                        intent3.putExtra("type","UrduEng");
                        startActivity(intent3);
                        break;

                    case R.id.nav_Ayah:
                        Toast.makeText(getApplicationContext(),"Search by Surat clicked",Toast.LENGTH_LONG).show();
                        //drawerLayout.closeDrawer(GravityCompat.START);
                        Intent intent4 = new Intent(MainActivity2.this, Ayah_List.class);
                        startActivity(intent4);
                        break;


                }

                return true;
            }
        });




    }
}