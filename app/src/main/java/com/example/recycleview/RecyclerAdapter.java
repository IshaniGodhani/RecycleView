package com.example.recycleview;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.ads.mediation.Adapter;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>
{

    Activity activity;
    int[] img;
    String[] item;
    public RecyclerAdapter(Activity activity, int[] img, String[] item) {
        this.activity=activity;
        this.img=img;
        this.item=item;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(activity).inflate(R.layout.item_category,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.imageView.setImageResource(img[position]);
        holder.textView.setText(""+item[position]);
    }

    @Override
    public int getItemCount()
    {
        return item.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView textView;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.img_item);
            textView=itemView.findViewById(R.id.item_txt);
        }
    }
}
