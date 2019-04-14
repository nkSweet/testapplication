package com.example.testapplication.view.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.testapplication.R;
import com.example.testapplication.service.model.CateoryResponse;

public class ProductVpAdapter extends PagerAdapter {
    Context context;
    CateoryResponse.Images[] images;
    LayoutInflater layoutInflater;


    public ProductVpAdapter(Context context, CateoryResponse.Images[] images) {
        this.context = context;
        this.images = images;
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == ((LinearLayout) object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        View itemView = layoutInflater.inflate(R.layout.row_image_vp, container, false);

        ImageView imageView = (ImageView) itemView.findViewById(R.id.iv_viewpager);
//        imageView.setImageResource(images[position]);
        Glide.with(context).
                load(images[position].getSrc()).placeholder(R.drawable.placeholder).into
                (imageView);
        container.addView(itemView);


        return itemView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }
}
