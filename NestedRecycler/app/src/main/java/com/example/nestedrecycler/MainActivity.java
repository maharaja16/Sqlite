package com.example.nestedrecycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecycler.Adapter.ParentItemAdapter;
import com.example.nestedrecycler.model.ChildItem;
import com.example.nestedrecycler.model.ParentItem;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        RecyclerView ParentRecyclerViewItem = findViewById(R.id.parent_recyclerview);


        LinearLayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);


        ParentItemAdapter parentItemAdapter = new ParentItemAdapter(ParentItemList());


        ParentRecyclerViewItem.setAdapter(parentItemAdapter);
        ParentRecyclerViewItem.setLayoutManager(layoutManager);
    }

    private List<ParentItem> ParentItemList()
    {
        List<ParentItem> itemList
                = new ArrayList<>();

        ParentItem item = new ParentItem("Title 1", ChildItemList());
        itemList.add(item);
        ParentItem item1 = new ParentItem("Title 2", ChildItemList());
        itemList.add(item1);
        ParentItem item2 = new ParentItem("Title 3", ChildItemList());
        itemList.add(item2);
        ParentItem item3 = new ParentItem("Title 4", ChildItemList());
        itemList.add(item3);

        return itemList;
    }


    private List<ChildItem> ChildItemList()
    {
        List<ChildItem> ChildItemList
                = new ArrayList<> ();

        ChildItemList.add(new ChildItem("Card 1"));
        ChildItemList.add(new ChildItem("Card 2"));
        ChildItemList.add(new ChildItem("Card 3"));
        ChildItemList.add(new ChildItem ("Card 4"));

        return ChildItemList;
    }

}