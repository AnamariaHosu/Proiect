package com.example.recipeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class Fragment1 extends Fragment {

    //TextView textView1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_1,container,false);

        // Inflate the layout for this fragment
      TextView textView1 = view.findViewById(R.id.textView1);
        textView1.setText("Claire Wright e disperata. Englezoaica, studenta la actorie in New York si fara viza de rezident, accepta singura slujba pe care o poate obtine: sa lucreze pentru o firma de avocati care se ocupa de divorturi si sa agate soti infideli prin barurile hotelurilor. Insa la un moment dat jocul se schimba. Cand unul dintre barbatii pe care-i agatase devine suspect in anchetarea unei crime, politia ii cere lui Claire sa-si foloseasca talentele de actrita pentru a-l face sa marturiseasca. De la inceput, ea pune la indoiala rolul pe care i se cere sa-l joace: Este Patrick Fogler un criminal? Sau exista in tot acest aranjament lucruri care nu i se spun? Claire isi va da seama curand ca joaca cel mai periculos rol al vietii ei.");
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
    }
}