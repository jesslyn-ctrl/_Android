package com.example.submission.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.submission.R;
import com.example.submission.model.Hotel;

import java.util.ArrayList;

public class CardViewListHotelAdapter extends RecyclerView.Adapter<CardViewListHotelAdapter.CardViewViewHolder> {
    private ArrayList<Hotel> listHotel;
    Context context;

    public CardViewListHotelAdapter(ArrayList<Hotel> list) {
        this.listHotel = list;
    }
    public CardViewListHotelAdapter(ArrayList<Hotel> my_list, Context context) {
        this.listHotel = my_list;
        this. context = context;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_hotel, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewViewHolder holder, int pos) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class CardViewViewHolder extends RecyclerView.ViewHolder {
        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
