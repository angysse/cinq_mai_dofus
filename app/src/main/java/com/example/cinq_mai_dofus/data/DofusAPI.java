package com.example.cinq_mai_dofus.data;



import com.example.cinq_mai_dofus.presentation.model.Arme;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DofusAPI {

    @GET("weapons")
    Call<List<Arme>> getCommerceResponse();


}
