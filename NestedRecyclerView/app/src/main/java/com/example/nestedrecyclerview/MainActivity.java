package com.example.nestedrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.nestedrecyclerview.adapter.MainRecyclerAdapter;
import com.example.nestedrecyclerview.model.AllCategory;
import com.example.nestedrecyclerview.model.CategoryItem;

import java.util.ArrayList;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mainCategoryRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    private List<AllCategory> allCategoryList;

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


        List<CategoryItem> categoryItemList2 = new ArrayList<> ();
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList.add(new CategoryItem (1, R.drawable.hollywood6));

        List<CategoryItem> categoryItemList3 = new ArrayList<> ();
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList.add(new CategoryItem (1, R.drawable.hollywood6));


        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood6));


        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood1));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood2));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood3));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood4));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood5));
        categoryItemList4.add(new CategoryItem(1, R.drawable.hollywood6));

        setMainCategoryRecycler(allCategoryList);




    }
    private void setMainCategoryRecycler(List<AllCategory> allCategoryList){

        mainCategoryRecycler = findViewById(R.id.main_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager (this);
        mainCategoryRecycler.setLayoutManager(layoutManager);
        mainRecyclerAdapter = new MainRecyclerAdapter(this, allCategoryList);
        mainCategoryRecycler.setAdapter(mainRecyclerAdapter);

    }

}