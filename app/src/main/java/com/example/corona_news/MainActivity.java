package com.example.corona_news;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
public static TextView cname;
public static TextView infected;
public static TextView recovered;
public static TextView death;
public static Spinner spcountry;
String [] countrynames;

final String base_url = "https://covid19.mathdro.id/api";
final String path="/countries/";
String Country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //System.out.println("behuda");
        Log.i("myTag","Behuda");

        cname = findViewById(R.id.gbl);
        infected = findViewById(R.id.infec);
        recovered = findViewById(R.id.recov);
        death = findViewById(R.id.death);
        countrynames = getResources().getStringArray(R.array.country_name);
        spcountry = (Spinner) findViewById(R.id.csp);

        spcountry.setOnItemSelectedListener(this);
        ArrayAdapter adapterspinner = new ArrayAdapter(this,android.R.layout.simple_spinner_item,countrynames);
        adapterspinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spcountry.setAdapter(adapterspinner);

        ImageView whc =(ImageView)findViewById(R.id.who2);
        ImageView bbn =(ImageView)findViewById(R.id.bbc) ;
        ImageView cn = (ImageView)findViewById(R.id.cnn);
        ImageView unf = (ImageView)findViewById(R.id.un);
        ImageView ir = (ImageView)findViewById(R.id.iec);
        ImageView alo = (ImageView)findViewById(R.id.pro);
        ImageView star = (ImageView)findViewById(R.id.da);
        ImageView somo = (ImageView)findViewById(R.id.som);
        ImageView tv = (ImageView)findViewById(R.id.inde);
        ImageView na = (ImageView)findViewById(R.id.bd);



        whc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inc = new Intent(MainActivity.this,who.class);
                startActivity(inc);
            }
        });

        bbn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inb = new Intent(MainActivity.this,bbc.class);
                startActivity(inb);
            }
        });

        cn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inn = new Intent(MainActivity.this,cnn.class);
                startActivity(inn);
            }
        });

        unf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inu = new Intent(MainActivity.this,unicef.class);
                startActivity(inu);
            }
        });

        ir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent icr = new Intent(MainActivity.this,iecdr.class);
                startActivity(icr);
            }
        });

        alo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent inp = new Intent(MainActivity.this,prothom.class);
                startActivity(inp);
            }
        });

        star.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ids = new Intent(MainActivity.this,dailys.class);
                startActivity(ids);
            }
        });

        somo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent imy = new Intent(MainActivity.this,somoy.class);
                startActivity(imy);
            }
        });

        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent itv = new Intent(MainActivity.this,indepen.class);
                startActivity(itv);
            }
        });

        na.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ico = new Intent(MainActivity.this,cobd.class);
                startActivity(ico);
            }
        });
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        Country = spcountry.getItemAtPosition(position).toString();

        cname.setText(Country);
        corona getdata = new corona();

        if(Country.equals("Global Data")){

           getdata.execute(base_url);

       }else{
           getdata.execute(base_url + path + Country);

       }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {



    }
}
