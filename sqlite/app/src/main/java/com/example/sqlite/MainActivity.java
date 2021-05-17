package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;


+
import java.util.List;


public class MainActivity extends AppCompatActivity {

    Button button, button2;
    EditText et_name, et_text;
    Switch switch1;
    ListView id_customerlist;

    ArrayAdapter customerArrayAdapter;
    DatabaseHandler databaseHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button =findViewById(R.id.button);
        button2 =findViewById(R.id.button2);
        switch1=findViewById(R.id.Act_switch);
        et_name =findViewById(R.id.et_name);
        et_text =findViewById(R.id.et_text);
        id_customerlist =findViewById(R.id.id_customerlist);


        DatabaseHandler databaseHandler = new DatabaseHandler(MainActivity.this);
        ArrayAdapter CustomerArrayAdapter = new ArrayAdapter<Computermodel>()



        CustomerArrayAdapter.add(CustomerArrayAdapter);



        button2.setOnClickListener(new View.OnClickListener() {
            private Object Computerise;

            @Override
            public void onClick(View v) {
                try{
                    Computermodel computermodel;
                    computermodel = new Computermodel(-1, et_name.getText().toString(), Integer.parseInt(et_text.getText().toString()), Switch1());
                    Toast.makeText(MainActivity.this, Computerise.toString(), Toast.LENGTH_SHORT).show();
                }catch (Exception e){

                    Toast.makeText(MainActivity.this, "Error detected", Toast.LENGTH_SHORT).show();
                    Computerise = new Computermodel(-1, "error", 0, false);
                }
                DatabaseHandler databaseHandler = new DatabaseHandler(MainActivity.this);
                Computermodel computermodel = null;
                boolean success = databaseHandler.addone(computermodel);
                Toast.makeText(MainActivity.this, "success" + success, Toast.LENGTH_SHORT).show();
                ArrayAdapter CustomerArrayAdapter = new ArrayAdapter<Computermodel>(MainActivity.this, android.R.layout.simple_list_item_1, databaseHandler.getEveryone());
                CustomerArrayAdapter.add(CustomerArrayAdapter);

                ;
            }
        });
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                DatabaseHandler databaseHandler = new DatabaseHandler(MainActivity.this);
                List<Computermodel> everyone = databaseHandler.getEveryone();
                ArrayAdapter CustomerArrayAdapter = new ArrayAdapter<Computermodel>(MainActivity.this, android.R.layout.simple_list_item_1, everyone);
                CustomerArrayAdapter.add(CustomerArrayAdapter);

                //Toast.makeText(MainActivity.this, everyone.toString(), Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void Switch1() {

    }

}