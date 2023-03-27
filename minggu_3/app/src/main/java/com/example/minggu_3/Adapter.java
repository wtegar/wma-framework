package com.example.minggu_3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.HolderData> {
    List<String> listData;
    LayoutInflater inflater;

    public Adapter(Context context, List<String> listData) {
        this.listData = listData;
        this.inflater = LayoutInflater.from(context);

    }

    @NonNull
    @Override
    public HolderData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new HolderData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderData holder, int position) {
        holder.txtData.setText(listData.get(position));
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public class HolderData extends RecyclerView.ViewHolder{
        TextView txtData;
        public HolderData(@NonNull View itemView) {
            super(itemView);
            txtData = itemView.findViewById(R.id.dataText);
        }
    }

}
