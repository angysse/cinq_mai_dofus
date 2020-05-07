package com.example.cinq_mai_dofus;



import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DofusAPI {

    @GET("weapons")
    Call<List<Arme>> getCommerceResponse();


}
