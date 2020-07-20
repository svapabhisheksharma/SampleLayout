package com.example.homesmaple;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapterVertical extends RecyclerView.Adapter<ListAdapterVertical.MyViewHolder> {

    private List<Model> modelList;

    public ListAdapterVertical(List<Model> modelList) {
        this.modelList = modelList;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView title, text1, text2;
        MyViewHolder(View view) {
            super(view);
            title = view.findViewById(R.id.title);
            text1 = view.findViewById(R.id.text1);
            text2 = view.findViewById(R.id.text2);
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card2, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Model model = modelList.get(position);
        holder.title.setText(model.getTitle());
        holder.text1.setText(model.getText1());
        holder.text2.setText(model.getText2());

    }


    @Override
    public int getItemCount() {
        return modelList.size();
    }
}
