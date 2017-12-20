package com.example.alex.allshop.presentation.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.alex.allshop.R;

/**
 * Created by alex on 20.12.17.
 */

public class MainMenuAdapter extends RecyclerView.Adapter<MainMenuAdapter.ViewHolder> {

    private String[] menuItems;

    public MainMenuAdapter(String[] menuItems){
        this.menuItems=menuItems;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext())
                                .inflate(R.layout.item_menu,parent,false);
        ViewHolder viewHolder=new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
          holder.textItemMenu.setText(this.menuItems[position]);
    }

    @Override
    public int getItemCount() {
        return this.menuItems.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textItemMenu;
        public ViewHolder(View view) {
            super(view);
            this.textItemMenu=(TextView)view.findViewById(R.id.item_text);
        }

    }
}
