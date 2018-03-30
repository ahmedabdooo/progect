package com.example.ahmed.f.holder;

/**
 * Created by Ahmed on 3/28/2018.
 */

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmed.f.R;
import com.example.ahmed.f.onclick.itemoclicklisner;


public class viewHolder  extends RecyclerView.ViewHolder implements View.OnClickListener {
    public itemoclicklisner itemoclicklisner;
    public ImageView progect_image;
    public TextView progect_name;
    public TextView progect_salary;


    public viewHolder(View itemView) {
        super(itemView);

      progect_image = itemView.findViewById(R.id.image_progect);
      progect_name = itemView.findViewById(R.id.name_progect);
      progect_salary = itemView.findViewById(R.id.salary_progect);
      itemView.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        itemoclicklisner.onclick(view,getAdapterPosition(),false);
    }

  public void setItemoclicklisner(com.example.ahmed.f.onclick.itemoclicklisner itemoclicklisner) {
    this.itemoclicklisner = itemoclicklisner;
  }
}

