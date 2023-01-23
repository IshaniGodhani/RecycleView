package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    int img[]={R.drawable.fb,R.drawable.insta,R.drawable.wp,
            R.drawable.snap,R.drawable.tele,R.drawable.twitter};
    String item[]={"Facebook","Instagram","Whatsapp","Snapchat","Telegram","Twitter"};
    ListView listView;
    RecyclerView recyclerView;
    RecyclerAdapter recyclerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerAdapter=new RecyclerAdapter(this,img,item);
        recyclerView=findViewById(R.id.list_item);
        recyclerView.setAdapter(recyclerAdapter);
    }
}