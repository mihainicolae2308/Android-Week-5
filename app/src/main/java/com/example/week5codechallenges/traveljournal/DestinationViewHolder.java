package com.example.week5codechallenges.traveljournal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.week5codechallenges.R;

public class DestinationViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImageViewDestination;
    private TextView mTextViewSeason;
    private TextView mTextViewDestination;


    public DestinationViewHolder(@NonNull View itemView) {
        super(itemView);

        mImageViewDestination = itemView.findViewById(R.id.image_view_destination);
        mTextViewSeason = itemView.findViewById(R.id.text_view_season);
        mTextViewDestination = itemView.findViewById(R.id.text_view_destination);
    }

    public ImageView getImageViewDestination() {
        return mImageViewDestination;
    }

    public void setImageViewDestination(ImageView imageViewDestination) {
        mImageViewDestination = imageViewDestination;
    }

    public TextView getTextViewSeason() {
        return mTextViewSeason;
    }

    public void setTextViewSeason(TextView textViewSeason) {
        mTextViewSeason = textViewSeason;
    }

    public TextView getTextViewDestination() {
        return mTextViewDestination;
    }

    public void setTextViewDestination(TextView textViewDestination) {
        mTextViewDestination = textViewDestination;
    }
}
