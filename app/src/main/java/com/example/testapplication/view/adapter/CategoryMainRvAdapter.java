package com.example.testapplication.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LayoutAnimationController;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.testapplication.R;
import com.example.testapplication.service.model.CategoryDetails;
import com.example.testapplication.view.ui.ProductDetailsActivity;

import java.util.ArrayList;
import java.util.List;

public class CategoryMainRvAdapter extends RecyclerView.Adapter<CategoryMainRvAdapter.ViewHolder> {

    Context mCtx;
    ArrayList<CategoryDetails> listData;

    public CategoryMainRvAdapter(Context mCtx, ArrayList<CategoryDetails> listData) {
        this.mCtx = mCtx;
        this.listData = listData;
    }

    @NonNull
    @Override
    public CategoryMainRvAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mCtx).inflate(R.layout.row_category_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryMainRvAdapter.ViewHolder holder, final int position) {

//        Glide.with(mCtx)
//                .load(hero.getImageurl())
//                .into(holder.imageView);
//
//        holder.tvTitle.setText(hero.getName());

        holder.ivUpDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                rotate(holder.ivUpDown);
                if (holder.llImage.isShown()) {
                    holder.ivUpDown.animate().rotation(180).setDuration(1);
                    holder.llImage.setVisibility(View.GONE);
                } else {
                    holder.ivUpDown.animate().rotation(0).setDuration(1);
                    holder.llImage.setVisibility(View.VISIBLE);
                    setupLayoutAnimation(holder.llImage);
                }
            }
        });

        holder.iv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mCtx, ProductDetailsActivity.class);
                i.putExtra("path",listData.get(position).getPath().get(0));
                mCtx.startActivity(i);
            }
        });holder.iv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mCtx, ProductDetailsActivity.class);
                i.putExtra("path",listData.get(position).getPath().get(1));
                mCtx.startActivity(i);
            }
        });holder.iv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mCtx, ProductDetailsActivity.class);
                i.putExtra("path",listData.get(position).getPath().get(2));
                mCtx.startActivity(i);
            }
        });holder.iv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(mCtx, ProductDetailsActivity.class);
                i.putExtra("path",listData.get(position).getPath().get(3));
                mCtx.startActivity(i);
            }
        });

        holder.tvTitle.setText(listData.get(position).getCategoryName());

        Glide.with(mCtx).
                load(listData.get(position).getUrls().get(0)).placeholder(R.drawable.placeholder).into(holder.iv1);
        Glide.with(mCtx).
                load(listData.get(position).getUrls().get(1)).placeholder(R.drawable.placeholder).into(holder.iv2);Glide.with(mCtx).
                load(listData.get(position).getUrls().get(2)).placeholder(R.drawable.placeholder).into(holder.iv3);Glide.with(mCtx).
                load(listData.get(position).getUrls().get(3)).placeholder(R.drawable.placeholder).into(holder.iv4);

    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ImageView iv1, iv2, iv3, iv4;
        TextView tvTitle, tvTitle1, tvTitle2, tvTitle3, tvTitle4;
        LinearLayout llImage;
        ImageView ivUpDown;

        public ViewHolder(View itemView) {
            super(itemView);

            iv1 = (ImageView) itemView.findViewById(R.id.iv1);
            iv2 = (ImageView) itemView.findViewById(R.id.iv2);
            iv3 = (ImageView) itemView.findViewById(R.id.iv3);
            iv4 = (ImageView) itemView.findViewById(R.id.iv4);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvTitle1 = (TextView) itemView.findViewById(R.id.tv_title1);
            tvTitle2 = (TextView) itemView.findViewById(R.id.tv_title2);
            tvTitle3 = (TextView) itemView.findViewById(R.id.tv_title3);
            tvTitle4 = (TextView) itemView.findViewById(R.id.tv_title4);
            llImage = (LinearLayout) itemView.findViewById(R.id.ll_main);
            ivUpDown = (ImageView) itemView.findViewById(R.id.iv_up_down);
        }
    }

    private void setupLayoutAnimation(LinearLayout llMenu) {

        AnimationSet set = new AnimationSet(true);
        Animation animation = new AlphaAnimation(0.0f, 1.0f);
        animation.setDuration(100);
        set.addAnimation(animation);
        animation = new ScaleAnimation(1.0f, 1.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        animation.setDuration(100);
        set.addAnimation(animation);
        LayoutAnimationController controller = new LayoutAnimationController(set, 1f);
        llMenu.setLayoutAnimationListener(null);
        llMenu.setLayoutAnimation(controller);
    }

    private void rotate(ImageView imgview) {
        final RotateAnimation rotateAnim = new RotateAnimation(0.0f, 180,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f,
                RotateAnimation.RELATIVE_TO_SELF, 0.5f);

        rotateAnim.setDuration(1);
        rotateAnim.setFillAfter(true);
        imgview.startAnimation(rotateAnim);
    }
}
