package com.example.weblist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {
    private List<ZImage>mImageList;
    private Context mContext;
    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView zImage;
        TextView zText;
        CardView cardView;
        public ViewHolder(View view){
            super(view);
            cardView = (CardView) view;
            zImage = view.findViewById(R.id.image_zf);
            zText = view.findViewById(R.id.tx_zf);
        }
    }
    public ImageAdapter(List<ZImage> imageList){
        mImageList = imageList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        if (mContext == null){
            mContext = parent.getContext();
        }
        View view = LayoutInflater.from(mContext).inflate(R.layout.zf_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder( ViewHolder holder, int position) {
        ZImage image = mImageList.get(position);
        holder.zText.setText(image.getName());
        Glide.with(mContext).load(image.getImageId()).into(holder.zImage);
    }

    @Override
    public int getItemCount() {
        return mImageList.size();
    }
}
