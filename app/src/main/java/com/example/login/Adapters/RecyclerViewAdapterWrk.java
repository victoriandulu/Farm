package com.example.login.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.login.Models.ProductsModel;
import com.example.login.Models.ProductsModelWrk;
import com.example.login.ProductsActivity;
import com.example.login.R;
import com.example.login.WorkersActivity;

import java.util.ArrayList;

public class RecyclerViewAdapterWrk extends RecyclerView.Adapter <RecyclerViewAdapterWrk.ViewHolder> {

    Context context;
    ArrayList<ProductsModelWrk>list;

    public RecyclerViewAdapterWrk(Context context, Object list, WorkersActivity WorkerActivity) {

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_workers, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(list.get(position).getProdImage());
        holder.textView.setText(list.get(position).getProdName());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.imageview);
            textView=itemView.findViewById(R.id.textView);
        }
    }
}
