package com.sitman.piramit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;

import java.util.Random;

public class Piramit extends AppCompatActivity {

    Bulmaca [] bulmacalar;
    Ekran ekran;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Random random = new Random();
        String [] bulmacaBilgileri = {"443252145336141522663", "234524435626143614625", "543236612135654465432", "355424315665631243245", "653634542621351325265","5432366121355654465432",
                "445385279314268683141625276595138379834951283","3453424689297681612115485464767575283728237238723112","233154981265474421359918674282318723683821",
                "1349255483261923745644123753534921392382387182137315061242984"};
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piramit);

        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        bulmacalar = new Bulmaca[bulmacaBilgileri.length];
        for(int i=0;i<bulmacaBilgileri.length;i++)
        {
            bulmacalar[i] = new Bulmaca(bulmacaBilgileri[i]);
        }
        ekran = (Ekran)findViewById(R.id.ekran);
        ekran.bulmaca = bulmacalar[random.nextInt(bulmacaBilgileri.length)];
        ekran.hucreGenislik = displayMetrics.widthPixels / (ekran.bulmaca.getBuyukluk() + 2);
    }




}
