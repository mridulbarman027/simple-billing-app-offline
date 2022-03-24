package com.nearbuck.simplebillingappoffline.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.nearbuck.simplebillingappoffline.R;
import com.nearbuck.simplebillingappoffline.models.ItemList;

import java.util.ArrayList;

public class ItemListAdapter extends RecyclerView.Adapter<ItemListAdapter.ItemListViewHolder> {

    private ArrayList<ItemList> itemListArrayList;
    private Context context;

    public ItemListAdapter(ArrayList<ItemList> itemListArrayList, Context context) {
        this.itemListArrayList = itemListArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ItemListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater mLayoutInflater = LayoutInflater.from(context);
        final View view = mLayoutInflater.inflate(R.layout.item_list, parent, false);
        return new ItemListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemListViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        if (itemListArrayList != null) {
            return itemListArrayList.size();
        }
        return 0;
    }

    public static class ItemListViewHolder extends RecyclerView.ViewHolder {
        public ItemListViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
