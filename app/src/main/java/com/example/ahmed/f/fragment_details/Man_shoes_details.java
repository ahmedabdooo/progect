package com.example.ahmed.f.fragment_details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ahmed.f.R;
import com.example.ahmed.f.dat_aview.User_InForm_Data;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Man_shoes_details extends AppCompatActivity {

    ImageView image_sold;
    TextView name_sold,salary_sold ,salarynumper_sold , discrption_sold , url_sold;
    DatabaseReference fNotesDatabase;
    DatabaseReference sav;
    FirebaseAuth fAuth;
    String Matches ="";
    String noteID;
    boolean isExist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_shoes_details);

        image_sold = findViewById(R.id.image_pro);
        name_sold = findViewById(R.id.name_pro);
        salary_sold = findViewById(R.id.salary_pro);

        discrption_sold = findViewById(R.id.discrption_pro);

        fNotesDatabase = FirebaseDatabase.getInstance().getReference("Manshoes");

        try {
            noteID = getIntent().getStringExtra("MenShoes_ID");

            //Toast.makeText(this, noteID, Toast.LENGTH_SHORT).show();

            if (!noteID.trim().equals("")) {
                isExist = true;
            } else {
                isExist = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (getIntent()!=null){
            Matches = getIntent().getStringExtra("MenShoes_ID");
        }
        if (!Matches.isEmpty()){
            getdata(Matches);
        }
    }

    private void getdata(String matches) {

        fNotesDatabase.child(matches).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                User_InForm_Data add_data1 = dataSnapshot.getValue(User_InForm_Data.class);
                Picasso.with(getBaseContext()).load(add_data1.getImage_progects()).into(image_sold);
                name_sold.setText(add_data1.getName_progects());
                salary_sold.setText(add_data1.getSalary_progects());

                discrption_sold.setText(add_data1.getDiscrption_progects());


            }


            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
}
