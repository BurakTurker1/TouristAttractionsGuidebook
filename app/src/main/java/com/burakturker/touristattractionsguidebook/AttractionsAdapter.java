package com.burakturker.touristattractionsguidebook;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.burakturker.touristattractionsguidebook.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class AttractionsAdapter extends RecyclerView.Adapter<AttractionsAdapter.AttractionsHolder> {
    ArrayList<Attractions> attractionsArrayList;

    public AttractionsAdapter(ArrayList<Attractions> attractionsArrayList) {
        this.attractionsArrayList = attractionsArrayList;
    }

    @NonNull
    @Override
    public AttractionsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new AttractionsHolder(recyclerRowBinding);
        //xml i bağlama
    }

    @Override
    public void onBindViewHolder(@NonNull AttractionsHolder holder, int position) {
        //viewHolder bağlandıgında neler olacak, değerler verilecek
        holder.binding.RecaylerViewTextView.setText(attractionsArrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);
                intent.putExtra("Attraction",attractionsArrayList.get(position));
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        //xml in kaç kere oluşturulacak
        return attractionsArrayList.size();
    }

    public class AttractionsHolder extends RecyclerView.ViewHolder{
         private RecyclerRowBinding binding;
        public AttractionsHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
