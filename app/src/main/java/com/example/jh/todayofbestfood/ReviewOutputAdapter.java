package com.example.jh.todayofbestfood;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by pdg on 2017-05-22.
 */

public class ReviewOutputAdapter extends RecyclerView.Adapter<ReviewOutputAdapter.ViewHolder> {

    private ArrayList<FoodOfBestInfo> _FoodOfBestInfoArrayList;

    public ReviewOutputAdapter(ArrayList<FoodOfBestInfo> foodOfBestInfoArrayList) {
        _FoodOfBestInfoArrayList = foodOfBestInfoArrayList;
    }

    //ViewHolder를 만들때
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_reviewoutput, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ReviewOutputAdapter.ViewHolder holder, int position) {
        FoodOfBestInfo foodOfBestInfo = _FoodOfBestInfoArrayList.get(position);
        holder.reviewSelect_TV.setText(foodOfBestInfo.getFood_postscript() + "\n" + foodOfBestInfo.getRestaurant_grade());
    }

    @Override
    public int getItemCount() {
        return _FoodOfBestInfoArrayList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(View itemView) {
            super(itemView);
            reviewSelect_TV = (TextView)itemView.findViewById(R.id.reviewSelect_TV);
        }

        TextView reviewSelect_TV;
    }
}
