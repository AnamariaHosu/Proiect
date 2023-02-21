package com.example.recipeapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ImageActivity extends AppCompatActivity {
    Integer valPrim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

         valPrim= getIntent().getIntExtra("val",0);





    }
    public void onClickOpen(View view){
        if(valPrim==0){
            replaceFragment(new Fragment1());
        }else if(valPrim==1){
            replaceFragment(new Fragment2());
        }else if(valPrim==2){
            replaceFragment(new Fragment3());
        }
    }

    private void replaceFragment( Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout, fragment);
        fragmentTransaction.commit();
    }
    public void onClickBtn(View view){
        Intent intent_2=new Intent(this,MainActivity.class);
        Toast.makeText(this, "Back to fist page..", Toast.LENGTH_SHORT).show();
        startActivity(intent_2);
    }


}