package com.example.recipeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment2#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment2 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment2() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment2.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment2 newInstance(String param1, String param2) {
        Fragment2 fragment = new Fragment2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_2,container,false);
     TextView textView2= view.findViewById(R.id.textView2);
       textView2.setText("O cale usoara si eficienta de a-ti forma obiceiuri bune si a scapa de cele proaste\n" +
               "\n" +
               "Schimbari mici, rezultate remarcabile\n" +
               "\n" +
               "„O carte extrem de practica si utila. James Clear extrage informatiile fundamentale despre formarea obiceiurilor, astfel ca tu sa poti realiza mai mult concentrandu-te pe mai putine lucruri.” – Mark Manson, autorul bestsellerului Arta subtila a nepasarii\n" +
               "\n" +
               "„James Clear a petrecut ani de zile perfectionand arta si studiind stiinta obiceiurilor. Aceasta carte antrenanta si practica este ghidul de care ai nevoie ca sa scapi de deprinderile proaste si sa-ti formezi unele bune.” – Adam Grant, autorul bestsellerurilor Originalii si Option B.\n" +
               "\n");
        // Inflate the layout for this fragment
        return view;
    }
}