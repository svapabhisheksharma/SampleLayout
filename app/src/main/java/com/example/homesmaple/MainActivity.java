package com.example.homesmaple;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Model> modelList = new ArrayList<>();
    private ListAdapterHorizontal listAdapter;
    private ListAdapterVertical listAdapter1;
    private ListAdapterVertical listAdapter2;
    private ListAdapterVertical listAdapter3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        RecyclerView recyclerView1 = findViewById(R.id.recyclerview1);
        RecyclerView recyclerView2 = findViewById(R.id.recyclerview2);
        RecyclerView recyclerView3 = findViewById(R.id.recyclerview3);
        listAdapter = new ListAdapterHorizontal(modelList);
        listAdapter1 = new ListAdapterVertical(modelList);
        listAdapter2 = new ListAdapterVertical(modelList);
        listAdapter3 = new ListAdapterVertical(modelList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext());
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext());
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView1.setLayoutManager(linearLayoutManager1);
        recyclerView2.setLayoutManager(linearLayoutManager2);
        recyclerView3.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(listAdapter);
        recyclerView1.setAdapter(listAdapter1);
        recyclerView2.setAdapter(listAdapter2);
        recyclerView3.setAdapter(listAdapter3);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        recyclerView2.setItemAnimator(new DefaultItemAnimator());
        recyclerView3.setItemAnimator(new DefaultItemAnimator());
        addItems();
    }
    private void addItems() {
        Model model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        model = new Model("Random Text", "Random Text", "Random Text");
        modelList.add(model);
        listAdapter.notifyDataSetChanged();
        listAdapter1.notifyDataSetChanged();
        listAdapter2.notifyDataSetChanged();
        listAdapter3.notifyDataSetChanged();
    }
}
