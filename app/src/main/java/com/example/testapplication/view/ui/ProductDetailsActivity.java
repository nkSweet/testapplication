package com.example.testapplication.view.ui;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.TextView;

import com.androidpagecontrol.PageControl;
import com.example.testapplication.R;
import com.example.testapplication.service.apicall.APIClinetGson;
import com.example.testapplication.service.apicall.ApiService;
import com.example.testapplication.service.model.CateoryResponse;
import com.example.testapplication.view.adapter.ProductVpAdapter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ProductDetailsActivity extends AppCompatActivity {

    private TextView tvTitle,tvDetails,tvPrice;
    private ViewPager vpCategory;
    private PageControl pageControl;
    private ApiService apiService;
    private String path = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details_activity);
            path =  getIntent().getStringExtra("path");
        apiService = APIClinetGson.getClient().create(ApiService.class);
        tvDetails = (TextView)findViewById(R.id.tv_details_dis);
        tvTitle = (TextView)findViewById(R.id.tv_details_title);
        tvPrice = (TextView)findViewById(R.id.tv_details_price);
        vpCategory = (ViewPager) findViewById(R.id.pager);
         pageControl = (PageControl) findViewById(R.id.page_control);

        getProductDetails();

    }

    private void getProductDetails(){
        Call<CateoryResponse> call =  apiService.getCategoryDetails(path);
        call.enqueue(new Callback<CateoryResponse>() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onResponse(Call<CateoryResponse> call, Response<CateoryResponse> response) {
                tvTitle.setText(response.body().getProducts()[0].getTitle());
                tvPrice.setText("Price : " + response.body().getProducts()[0].getVariants()[0].getPrice());
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {

                    tvDetails.setText(Html.fromHtml(response.body().getProducts()[0].getBody_html(), Html.FROM_HTML_MODE_COMPACT));
                }else {
                    tvDetails.setText(Html.fromHtml(response.body().getProducts()[0].getBody_html()));

                }

                vpCategory.setAdapter(new ProductVpAdapter(ProductDetailsActivity.this,response.body().getProducts()[0].getImages()));
                pageControl.setViewPager(vpCategory);
                pageControl.setPosition(0);

            }

            @Override
            public void onFailure(Call<CateoryResponse> call, Throwable t) {
                Log.e("error","error");
            }
        });

    }
}
