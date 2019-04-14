package com.example.testapplication.view.ui;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.testapplication.R;
import com.example.testapplication.service.apicall.APIClient;
import com.example.testapplication.service.apicall.APIClinetGson;
import com.example.testapplication.service.apicall.ApiService;
import com.example.testapplication.service.model.CategoryDetails;
import com.example.testapplication.service.model.CateoryResponse;
import com.example.testapplication.view.adapter.CategoryMainRvAdapter;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Iterator;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMainCategory;
    private ApiService apiService;
    private ArrayList<CategoryDetails> categoryDetails = new ArrayList<>();

    ProgressDialog progressDoalog;
    JSONArray inner;
    String key;
    ArrayList<CateoryResponse> cateoryResponses;
    int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvMainCategory = (RecyclerView) findViewById(R.id.rv_main_category);
        rvMainCategory.setLayoutManager(new LinearLayoutManager(this));
        apiService = APIClient.getClient().create(ApiService.class);


        progressDoalog = new ProgressDialog(this);
        progressDoalog.setProgressStyle(ProgressDialog.STYLE_SPINNER);

        progressDoalog.setMessage("Please wait");
        progressDoalog.setCancelable(false);

        getMainCategoryData();

    }

    private void getMainCategoryData() {
        progressDoalog.show();
        Call<String> categoryCall = apiService.detCategory();

//        categoryCall.enqueue(new Callback<Response>() {
//            @Override
//            public void onResponse(Call<Response> call, Response<Response> response) {
//
//                try {
//                    JSONObject j =  new JSONObject(response.body().toString());
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFailure(Call<Response> call, Throwable t) {
//
//            }
//        });
        categoryCall.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {

//                try {
//                    JSONObject jsonObject =  new JSONObject(response.body());
//                } catch (JSONException e) {
//                    e.printStackTrace();
//                }
                parseData(response);
//                JsonObject post = new JsonObject().get(response.body().toString()).getAsJsonObject();
//                JsonObject categoryObj=post.getJsom

            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {
                Log.e("error", "error");
            }
        });
    }


    private void parseData(Response<String> response) {
        try {

            JSONObject jsonObject = new JSONObject(response.body());
            JSONArray jsonArray = jsonObject.getJSONArray("category");

            JSONObject jsonObject1 = jsonArray.getJSONObject(0);

            Iterator<String> keys = jsonObject1.keys();
            while (keys.hasNext()) {
                key = keys.next();
                Log.e("category key", key);
                inner = new JSONArray();
                inner = jsonObject1.getJSONArray(key);
                cateoryResponses = new ArrayList<>(inner.length());
                ArrayList<String> path = new ArrayList<>();
                count = 0;
                for (int i = 0; i < inner.length(); i++) {

                    apiService = APIClinetGson.getClient().create(ApiService.class);
                    Log.e("SubCategory", key + " -> " + inner.get(i));
                    path.add("/feeds/" + key + "/" + inner.get(i) + ".json");
                }
                ArrayList<String> urls = new ArrayList<>();
                if(key.equalsIgnoreCase("lips")){
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/Lip-Primer---SUGAR-logo-and-cap-on-right_0002_06-compressor.png?v=1548150564");
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/NEM01_2-compressor_3c5680fd-501b-4e92-ae96-8b4b0c4e0fdc.png?v=1550498636") ;
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/NEM01_2-compressor_3c5680fd-501b-4e92-ae96-8b4b0c4e0fdc.png?v=1550498636") ;
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/1-compressor_02ca904e-fdd3-457c-8399-f16cf80fd6cd.png?v=1542960501");
                }else if(key.equalsIgnoreCase("face")){
                   urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/GFMSM05-compressor.png?v=1545113200");
                   urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/10-compressor_e4cdb7ca-1651-4afd-9ad3-009910cfe142.jpg?v=1545550432");
                   urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/GFMSM05-compressor.png?v=1545113200");
                   urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/CWF02-compressor.png?v=1545049129");
                }else {
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara02-compressor_1.png?v=1546241379");
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/New-Mascara02-compressor_1.png?v=1546241379");
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/SOG_1.png?v=1543998348");
                    urls.add("https://cdn.shopify.com/s/files/1/0906/2558/products/01_Jabong.png?v=1523521722");
                }
                categoryDetails.add(new CategoryDetails(key,path,urls));
            }

        rvMainCategory.setAdapter(new CategoryMainRvAdapter(MainActivity.this, categoryDetails));
            progressDoalog.dismiss();
            Log.e("total size", ": " + categoryDetails.size());
        } catch (JSONException e) {
            Log.e("error", "_" + e.getMessage());
            e.printStackTrace();
        }
    }

    public void getCategoryDetails() {
//        final CateoryResponse[] cateoryResponse = new CateoryResponse[1];
        apiService = APIClinetGson.getClient().create(ApiService.class);

        ArrayList<Call<CateoryResponse>> list = new ArrayList<>();

        try {

            if (count < inner.length()) {
                final String url = "/feeds/" + key + "/" + inner.get(count) + ".json";
                Log.e("url", ": " + url + count);


                Call<CateoryResponse> call = apiService.getCategoryDetails(url);
                list.add(call);
                call.enqueue(new Callback<CateoryResponse>() {
                    @Override
                    public void onResponse(Call<CateoryResponse> call, Response<CateoryResponse> response) {
                        if (response.isSuccessful()) {
                            count++;
                            Log.e("count", ": " + count);
                            getCategoryDetails();
                        }
                    }

                    @Override
                    public void onFailure(Call<CateoryResponse> call, Throwable t) {
                        Log.e("error", "error");
                    }
                });

            } else {

                Log.e("count", ": " + count);
                count = 0;
            }

            // call.enqueue(new Callback<CateoryResponse>() {
//                @Override
//                public void onResponse(Call<CateoryResponse> call, Response<CateoryResponse> response) {
//                    Log.e("count", ": " + count);
//                    cateoryResponses.add(response.body());
//                    count++;
//                    getCategoryDetails();
//                }
//                @Override
//                public void onFailure(Call<CateoryResponse> call, Throwable t) {
//                    Log.e("error","error");
//                }
//            });
//        if(count < inner.length()) {
//            Log.e("url", ": " + url);
//            apiService = APIClinetGson.getClient().create(ApiService.class);
//
//            Call<CateoryResponse> call = apiService.getCategoryDetails(url);
//
//            call.enqueue(new Callback<CateoryResponse>() {
//                @Override
//                public void onResponse(Call<CateoryResponse> call, Response<CateoryResponse> response) {
//                    Log.e("count", ": " + count);
//                    cateoryResponses.add(response.body());
//                    count++;
//                    getCategoryDetails();
//                }
//                @Override
//                public void onFailure(Call<CateoryResponse> call, Throwable t) {
//                    Log.e("error","error");
//                }
//            });
//        }else {
//            categoryDetails.add(new CategoryDetails(key,cateoryResponses));
//            Log.e("test " ," - " + count + "size " + categoryDetails.size());
//            count =0;
//        }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
