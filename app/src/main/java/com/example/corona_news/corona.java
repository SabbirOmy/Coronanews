package com.example.corona_news;

import android.os.AsyncTask;
import android.util.Log;

import org.json.JSONObject;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class corona extends AsyncTask<String,Void,String> {

    String result="";
    String infect,recover,death;

    @Override
    protected String doInBackground(String... urls) {

        URL url;

        HttpsURLConnection myconnect = null;
        try{

            url = new URL(urls[0]);
            myconnect = (HttpsURLConnection) url.openConnection();
            InputStream in = myconnect.getInputStream();
            InputStreamReader mystreamread = new InputStreamReader(in);

            int data = mystreamread.read();

            while(data!= -1){

                char currntchar = (char)data;
                result = result + currntchar;
                data = mystreamread.read();
            }


        } catch(Exception e){

            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);

        try{


            //System.out.println(result);
            JSONObject myobject = new JSONObject(result);
            JSONObject confirmed = new JSONObject(myobject.getString("confirmed"));
            JSONObject recovered = new JSONObject(myobject.getString("recovered"));
            JSONObject deaths = new JSONObject(myobject.getString("deaths"));
            //JSONObject countries = new JSONObject(myobject.getString("name"));



            infect = confirmed.getString("value");
            recover = recovered.getString("value");
            death = deaths.getString("value");





            MainActivity.infected.setText(infect);
            MainActivity.recovered.setText(recover);
            MainActivity.death.setText(death);
            //MainActivity.cname.setText(cname);


        }catch (Exception e){

            e.printStackTrace();
        }
    }
}
