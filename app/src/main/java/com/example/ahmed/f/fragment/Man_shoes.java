package com.example.ahmed.f.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ahmed.f.R;
import com.example.ahmed.f.dat_aview.User_InForm_Data;
import com.example.ahmed.f.fragment_details.Man_Clothes_details;
import com.example.ahmed.f.holder.viewHolder;
import com.example.ahmed.f.onclick.itemoclicklisner;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;


public class Man_shoes extends Fragment {


    FirebaseDatabase database;
    DatabaseReference myRef;
    RecyclerView recycler_menue;
    public GridLayoutManager gridLayoutManager;
    FirebaseRecyclerAdapter<User_InForm_Data,viewHolder> adapter;

    public Man_shoes() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_man_shoes, container, false);
        recycler_menue = view.findViewById(R.id.Manshoes);

        myRef = FirebaseDatabase.getInstance().getReference("Manshoes");

        gridLayoutManager = new GridLayoutManager(getContext(),4,GridLayoutManager.VERTICAL,false);

        recycler_menue.setHasFixedSize(true);
        recycler_menue.setLayoutManager(gridLayoutManager);
        lodmenue();

        return view;
    }

    private void lodmenue() {
        adapter = new FirebaseRecyclerAdapter<User_InForm_Data,viewHolder>(User_InForm_Data.class,R.layout.dising_list,viewHolder.class,myRef) {
            @Override
            protected void populateViewHolder(viewHolder viewHolder, User_InForm_Data model, int position) {

                viewHolder.progect_name.setText(model.getName_progects());
                viewHolder.progect_salary.setText(model.getSalary_progects());
                Picasso.with(getContext()).load(model.getImage_progects()).into(viewHolder.progect_image);


                viewHolder.setItemoclicklisner(new itemoclicklisner() {
                    @Override
                    public void onclick(View view, int position, boolean islongclick) {
                        Intent sing_in1 = new Intent(getActivity().getApplication(),Man_Clothes_details.class);
                        sing_in1.putExtra("MenShoes_ID",adapter.getRef(position).getKey());
                        startActivity(sing_in1);
                    }
                });
            }
        };
        recycler_menue.setAdapter(adapter);
    }

}
