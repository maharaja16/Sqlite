package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.example.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter<RecyclerView.ViewHolder> mainRecyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        List<CategoryItem> categoryItemList = new ArrayList<> ();
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList.add(new CategoryItem (1, R.drawable.hollywood6));



    }
}