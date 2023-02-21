package com.example.recipeapp;

import static java.lang.Math.log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
 private Button startservice, stopservice;
private Intent serviceIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startservice=findViewById(R.id.btnStartService);
        stopservice=findViewById(R.id.btnStopService);
        serviceIntent=new Intent(getApplicationContext(),MyService.class);

        startservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startService(new Intent(getApplicationContext(), MyService.class));

            }
        });
        stopservice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(),MyService.class));

            }
        });

        String[] imageTitles = {"Title 1", "Title 2", "Title 3"};

        ListView listView = findViewById(R.id.listView);
        int[] images = {R.drawable.carte1, R.drawable.carte2b, R.drawable.carte3};


        listView.setAdapter(new ImageListAdapter(this, images, imageTitles));

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ImageActivity.class);
                Toast.makeText(MainActivity.this, "review page", Toast.LENGTH_SHORT).show();
                intent.putExtra("val",position);
                startActivity(intent);
            }
        });

    }
}