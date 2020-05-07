package com.example.cinq_mai_dofus;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ArmeActivity extends AppCompatActivity {

    private  final String BASE_URL = "https://fr.dofus.dofapi.fr/";


    private RecyclerView recyclerView;
    private ListAdapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    private Gson gson;
    private SharedPreferences s;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        gson = new GsonBuilder()
                .setLenient()
                .create();

        s = getSharedPreferences("Dofus Arme ", Context.MODE_PRIVATE);



        List<Arme> liste = cache();
        if(liste != null){
            showList(liste);
        }else{
            makeApiCall();
        }



        makeApiCall();
    }

    private void showList(List<Arme> list) {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        recyclerView.setHasFixedSize(true);
        // use a linear layout manager
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        mAdapter = new ListAdapter(list,getApplicationContext());
        recyclerView.setAdapter(mAdapter);
    }




    private void makeApiCall(){ //permet de faire l'appel serveur


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        DofusAPI commerceApi = retrofit.create(DofusAPI.class);

        Call<List<Arme>> call = commerceApi.getCommerceResponse();

        call.enqueue(new Callback<List<Arme>>() {
            @Override
            public void onResponse(Call<List<Arme>> call, Response<List<Arme>> response) {
                if(response.isSuccessful() && response.body() != null){

                    List<Arme> listArme = response.body();
                    saveList(listArme);
                    showList(listArme);
                    Toast.makeText(getApplicationContext(), "API Success", Toast.LENGTH_SHORT).show();


                }else {
                    showError();
                }
            }


            @Override
            public void onFailure(Call<List<Arme>> call, Throwable t) {
                showError();
            }
        });
    }

    private void showError() {
        Toast.makeText(getApplicationContext(), "API Error", Toast.LENGTH_SHORT).show();

    }

    private void saveList(List<Arme> list){

        String jsonString  = gson.toJson(list);

        s.edit().putString("jsonString",jsonString).apply();


    }
    private List<Arme> cache(){

        String jsonArme = s.getString("jsonString",null);
        if(jsonArme == null){
            return null;
        }else{
            Type listeType = new TypeToken<List<Arme>>(){}.getType();
            return gson.fromJson(jsonArme,listeType);
        }


    }
}
