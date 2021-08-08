package com.example.bookfromlistapp.adabter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookfromlistapp.R;
import com.example.bookfromlistapp.model.VolumeInfo;

public class RecycviewAdabter extends RecyclerView.Adapter<RecycviewAdabter.ViewHolder>{
    Context context;
    VolumeInfo volumes;

    public RecycviewAdabter(Context context,VolumeInfo volumes){
        this.context=context;
        this.volumes=volumes;
    }

    @NonNull
    @Override
    public RecycviewAdabter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate= LayoutInflater.from(context).inflate(R.layout.recycleviewadabter,parent,false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull RecycviewAdabter.ViewHolder holder, int position) {
        holder.title.setText(volumes.getTitle());
        holder.desc.setText(volumes.getDescription());
        holder.publisher.setText(volumes.getPublisher());

    }

    @Override
    public int getItemCount() {
        if (String.valueOf(volumes.getAuthors().size())!=null)
            return volumes.getAuthors().size();

        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title,publisher,desc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=(ImageView)itemView.findViewById(R.id.bookimage);
            title=(TextView)itemView.findViewById(R.id.name);
            publisher=(TextView)itemView.findViewById(R.id.publisher);
            desc=(TextView)itemView.findViewById(R.id.desc);


        }
    }
}
