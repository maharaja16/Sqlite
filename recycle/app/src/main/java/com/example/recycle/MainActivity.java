package com.example.recycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.HashMap;


import java.util.HashSet;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Exampleitem>   exampleList;
    private OnItemClickListener mListener;
    private Object mexampleList;


    public  interface OnItemClickListener {
        void onItemClicked(int position);
    }
    public  void setonItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }


  private RecyclerView mRecyclerView;
  private ExampleAdapter mAdapter;
  private RecyclerView.LayoutManager mLayoutManager;

  private Button buttonInsert;
  private Button buttonRemove;
  private EditText editTextInsert;
  private EditText editTextRemove;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        fillExampleList();



        createExampleList();
        buildrecycleView();

        buttonInsert =findViewById (R.id.button_insert);
        buttonRemove =findViewById (R.id.button_remove);
        editTextInsert = findViewById (R.id.edittext_insert);
        editTextRemove = findViewById (R.id.edittext_remove);


        buttonInsert.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt (editTextInsert.getText ().toString ());
                insertItem (position);

            }
        });
        buttonRemove.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                int position = Integer.parseInt (editTextRemove.getText ().toString ());
                removeItem (position);

            }
        });


        //ArrayList<Object> mexampleList = new ArrayList<> ( );
     //  mexampleList.add (new Exampleitem (R.drawable.ic_android, "Line 1", "Line 2"));
      //  mexampleList.add (new Exampleitem (R.drawable.ic_baseline_audiotrack_24, "Line 3", "Line 4"));
      //  mexampleList.add (new Exampleitem (R.drawable.ic_baseline_wb_sunny_24, "Line 5", "Line 6"));


      //  mRecyclerView = findViewById (R.id.recyclerView);
      //  mRecyclerView.setHasFixedSize (true);
      //  mLayoutManager = new LinearLayoutManager (this);
      //  mAdapter = new ExampleAdapter ();


       // mRecyclerView.setLayoutManager (mLayoutManager);
       // mRecyclerView.setAdapter (mAdapter);


    }
    public void insertItem(int position) {
        HashSet<Exampleitem> mExampleList = new HashSet<>();
        mExampleList.add( new  Exampleitem (R.drawable.ic_android, "This item is inserted" + position, "This is Line 2"));
        mAdapter.notifyDataSetChanged ();
    }
    public void removeItem(int position) {
        HashMap<Object, Object> mExampleList = new HashMap<>();
        mExampleList.remove(position);
    }

    public void changeItem(int position, String text){
    }


    public ArrayList<Exampleitem> getExampleList() {
        return exampleList;
    }

    public void createExampleList()  {
        ArrayList<Object> mexampleList = new ArrayList<> ( );
        mexampleList.add (new Exampleitem (R.drawable.ic_android, "Line 1", "Line 2"));
        mexampleList.add (new Exampleitem (R.drawable.ic_baseline_audiotrack_24, "Line 3", "Line 4"));
        mexampleList.add (new Exampleitem (R.drawable.ic_baseline_wb_sunny_24, "Line 5", "Line 6"));
    }
    public void buildrecycleView(){
        mRecyclerView = findViewById (R.id.recyclerView);
        mRecyclerView.setHasFixedSize (true);
        mLayoutManager = new LinearLayoutManager (this);
      //  mAdapter = new ExampleAdapter ();


        mRecyclerView.setLayoutManager (mLayoutManager);
        mRecyclerView.setAdapter (mAdapter);



    }

    private void fillExampleList(){


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater ();
        inflater.inflate (R.menu.example_menu, menu);


        MenuItem searchItem = menu.findItem (R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView ();

        searchView.setImeOptions (EditorInfo.IME_ACTION_DONE);

        searchView.setOnQueryTextListener (new SearchView.OnQueryTextListener ( ) {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter ().filter (newText);
                return false;
            }
        });
        return  true;
    }
}