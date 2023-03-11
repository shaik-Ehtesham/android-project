package com.example.recycler_view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class shyariAdapter extends RecyclerView.Adapter<shyariAdapter.dataViewholder> {
    private Context context;
    private ArrayList<shyaridata> list;

    public shyariAdapter(Context context, ArrayList<shyaridata> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public dataViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.model,parent,false);
        return new dataViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull dataViewholder holder, int position) {
        holder.textview.setText(list.get(position).getText());

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class dataViewholder extends RecyclerView.ViewHolder {
        private TextView textview;
        private ImageView v,v1,s1;

        public dataViewholder(@NonNull View itemView) {
            super(itemView);
            v = itemView.findViewById(R.id.v);
            v1 = itemView.findViewById(R.id.v);
            s1 = itemView.findViewById(R.id.v);
            textview = itemView.findViewById(R.id.textview);
        }
    }
}
