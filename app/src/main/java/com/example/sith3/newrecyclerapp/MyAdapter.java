package com.example.sith3.newrecyclerapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private Context mContext;

    private List<Country> mData;

    MyAdapter(Context context, List<Country> data) {
        mContext = context;
        mData = data;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.item_recycler_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Country c = mData.get(position);
        holder.textView1.setText(c.getCountryName());
        holder.textView2.setText(c.getCapital());
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView1,textView2;

        MyViewHolder(View itemView) {
            super(itemView);
            textView1 = itemView.findViewById(R.id.text_view);
            textView2 = itemView.findViewById(R.id.text_view1);
        }
    }
}

