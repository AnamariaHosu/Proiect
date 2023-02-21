package com.example.recipeapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Fragment3#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Fragment3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment3.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment3 newInstance(String param1, String param2) {
        Fragment3 fragment = new Fragment3();
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
        View view = inflater.inflate(R.layout.fragment_3,container,false);

      TextView  textView3=view.findViewById(R.id.textView3);
        textView3.setText("Jordan B. Peterson este unul dintre cei mai sclipitori ganditori ai momentului.\n" +
                "\n" +
                "Psihologul canadian a devenit in ultimii ani un veritabil fenomen mediatic: pe YouTube poate fi vazut in peste 200 de prelegeri si interviuri, care aduna mai bine de 30 de milioane de vizualizari; iar pe Twitter si Facebook este urmarit de 300 000 de oameni.\n" +
                "\n" +
                "Plin de umor si asociind in mod surprinzator adevaruri ale traditiei occidentale cu ultimele descoperiri din neurostiinte, Peterson ne povesteste despre homari si asertivitate, despre skateboarding si adevaratii barbati, despre Iadul ranchiunii si arogantei, dar si despre lumina pe care o poate aduce in viata noastra mangaierea unei pisici sau un moment de sinceritate fata de sine - dar si fata de apropiatii nostri");
        // Inflate the layout for this fragment
        return view;
    }
}