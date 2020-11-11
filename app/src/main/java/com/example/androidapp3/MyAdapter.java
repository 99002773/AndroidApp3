package com.example.androidapp3;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * MyAdapter job is to put data into each row of the list view
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.WordViewHolder> {
   String[] languages;
    public MyAdapter(String[] langData) {
        languages=langData;
    }

    /**
     * oncreateViewHolder job is to buy wooden planks
     * @param parent
     * @param viewType
     * @return
     */
    @NonNull
    @Override
    public MyAdapter.WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    /**
     * onBindViewHolder job is to write data on the planks
     * @param holder
     * @param position
     */

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.WordViewHolder holder, int position) {

    }

    /**
     * job is to keep count of number of items in dataset
     * @return
     */
    @Override
    public int getItemCount() {
        return 0;
    }

    /**
     * WordViewHolder job is to hold the recycled stok and new stock of wooden planks
     */

    public class WordViewHolder extends RecyclerView.ViewHolder {
        public WordViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
