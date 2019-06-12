package com.amit.androidchallenge;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    ArrayList<Model> arrayList;

    MyAdapter(ArrayList<Model>arrayList)
    {
        this.arrayList=arrayList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.single_user_layout,viewGroup,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        Model model=arrayList.get(i);
        Picasso.get().load(model.getPhoto()).placeholder(R.drawable.profile).into(myViewHolder.photo);
        myViewHolder.name.setText(model.getName());
        myViewHolder.age.setText(model.getAge());
        myViewHolder.location.setText(model.getLocation());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
       private CircleImageView photo;
       private TextView name,age,location;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            photo=itemView.findViewById(R.id.photo);
            name=itemView.findViewById(R.id.name);
            age=itemView.findViewById(R.id.age);
            location=itemView.findViewById(R.id.location);
        }
    }
}
