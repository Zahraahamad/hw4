package com.example.hw8;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class classAdapter extends RecyclerView.Adapter {
    RecyclerViewClickListener recyclerViewClickListener;
    ArrayList<thelist> list;
    Context context;

    public classAdapter(ArrayList<thelist> list, Context context) {
        this.list = list;
        this.context = context;

    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.book, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        ((ViewHolder) holder).img.setImageResource(list.get(position).getImage());
        ((ViewHolder) holder).name.setText(list.get(position).getName());
        ((ViewHolder) holder).totalPages.setText(list.get(position).getTotalPages() + "");
        ((ViewHolder) holder).authorName.setText(list.get(position).getAuthorName());
        ((ViewHolder) holder).view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(context,MainActivity2.class);
                context.startActivity(i);
                i.putExtra("thelist",list.get(position));
                context.startActivity(i);
            }
        });
        final AlertDialog.Builder builder = new AlertDialog.Builder(context);
        ((ViewHolder)holder).delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.remove(position);
                notifyDataSetChanged();
                Toast.makeText(context,"item is deleted",Toast.LENGTH_SHORT);
                builder.setTitle("delete");
                builder.setMessage("Are you sure you want to delete?");
                builder.setCancelable(false).setPositiveButton("yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    list.remove(position);
                    notifyDataSetChanged();
                    }
                }).setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
               AlertDialog alertDialog = builder.create();
               alertDialog.show();
            }
        });

    }

    @Override
    public int getItemCount() { return list.size();}



    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public ImageView img;
        public TextView name;
        public TextView authorName;
        public View view;
        public TextView totalPages;
        public  ImageView delete;


        public ViewHolder(@NonNull View itemView)  {
            super(itemView);
            view = itemView;
            img = itemView.findViewById(R.id.imageView);
            name = itemView.findViewById(R.id.textView);
            totalPages = itemView.findViewById(R.id.textView3);
            authorName = itemView.findViewById(R.id.textView4);
            delete = itemView.findViewById(R.id.imageView4);
            view.setOnClickListener(this);



        }

        @Override
        public void onClick(View v) {

        }
    }
    public interface RecyclerViewClickListener{
        void OnClick(View v, int position);
    }
}






