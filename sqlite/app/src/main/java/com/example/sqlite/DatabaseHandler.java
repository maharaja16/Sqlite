

package com.example.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;




import java.util.List;



public class DatabaseHandler extends SQLiteOpenHelper {

    public static final String CUSTOMER_TABLE = "CUSTOMER_TABLE";
    public static final String COLUMN_CUSTOMER_NAME = "CUSTOMER_NAME";
    public static final String COLUMN_CUSTMOER_AGE = "CUSTMOER_AGE";
    public static final String COLUMN_ACT_CUSTOMER = "ACT_CUSTOMER";
    public static final String COLUMN_ID = "ID";

    public DatabaseHandler(@Nullable Context context) {
        super(context, "Customer.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableStatement = "CREATE TABLE " + getQuerystring(CUSTOMER_TABLE) + "(" + getQuerystring(COLUMN_ID) + " INTEGER PRIMARY KEY AUTOINCREMENT," + getQuerystring(COLUMN_CUSTOMER_NAME) + " TXT, " + getQuerystring(COLUMN_CUSTMOER_AGE) + " INT," + getQuerystring(COLUMN_ACT_CUSTOMER) + " BOOL )";

        db.execSQL(getQuerystring(createTableStatement));

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public boolean addone( Computermodel computermodel){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put(getQuerystring(COLUMN_CUSTOMER_NAME), computermodel.getName());
        cv.put(getQuerystring(COLUMN_CUSTMOER_AGE), computermodel.getAge());
        cv.put(getQuerystring(COLUMN_ACT_CUSTOMER), computermodel.getBooleanisactive());

         long insert = db.insert(getQuerystring(CUSTOMER_TABLE), null, cv);
         if (insert ==-1){
             return  false;
         }
          else {
              return true;
         }

    }
    public boolean DeleteOne (Computermodel computermodel){
         SQLiteDatabase db = this.getWritableDatabase();
         String querystring = "DELETE FROM" + CUSTOMER_TABLE + "WHERE" + COLUMN_ID + "" + Computermodel.getID();

        Cursor cursor = db.rawQuery(querystring, null);
        if(cursor.moveToFirst()){

        }
        else{
            return false;
        }

    }
    public String[] getEveryone() {
        List<Computermodel> returnList = new ArrayList<>();

     String querystring = "SELECT * FROM" + CUSTOMER_TABLE;
     SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor;
        cursor = getCursor(querystring, db);

        if(cursor.moveToFirst()) {
            do {
                int customerId = cursor.getInt(0);
                String customerName = cursor.getString(1);
                int customerage = cursor.getInt(2);
                int customerActive = cursor.getInt(3);

                Computermodel computermodel = new Computermodel(  COLUMN_CUSTOMER_NAME, COLUMN_CUSTMOER_AGE, COLUMN_CUSTMOER_AGE, COLUMN_ID, COLUMN_ACT_CUSTOMER );
                 returnList.add(new Computermodel());
            }while (cursor.moveToNext());


        }
        else{


        }

        cursor.close();
        db.close();




    }

    private Cursor getCursor(String querystring, SQLiteDatabase db) {
        Cursor cursor;
        cursor = db.rawQuery(getString(string(querystring)), getEveryone() );

        return cursor;
    }

    private String getQuerystring(String querystring) {
        return querystring;
    }

    private String getString(String querystring) {
        return string(querystring);
    }

    private String string(String querystring) {
        return querystring;
    }
}
