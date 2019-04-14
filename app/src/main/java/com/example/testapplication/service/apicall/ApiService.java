package com.example.testapplication.service.apicall;

import com.example.testapplication.service.model.CateoryResponse;

import org.json.JSONObject;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface ApiService {

    @GET("/feeds/category.json")
    Call<String> detCategory();

    @GET
    Call<CateoryResponse> getCategoryDetails(@Url String url);


}
