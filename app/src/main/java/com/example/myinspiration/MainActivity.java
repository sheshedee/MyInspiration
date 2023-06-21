package com.example.myinspiration;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.idCourseRV);

        // created new array list..
        ArrayList<RecyclerData> recyclerDataArrayList = new ArrayList<>();

        // added data to array list
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspo));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lock1));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lock2));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lock3));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.screen));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.screen1));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.screen2));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.screen3));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lockscreen));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lockscreen1));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.lockscreen2));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspire));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspire1));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspire2));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspire3));
        recyclerDataArrayList.add(new RecyclerData(R.drawable.inspiration));




        // added data from arraylist to adapter class.
        RecyclerViewAdapter adapter=new RecyclerViewAdapter(recyclerDataArrayList,this);

        // setting grid layout manager to implement grid view.
        // in this method '2' represents number of columns to be displayed in grid view.
        GridLayoutManager layoutManager=new GridLayoutManager(this,2);

        // at last set adapter to recycler view.
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
