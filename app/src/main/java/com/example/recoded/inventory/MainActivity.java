package com.example.recoded.inventory;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    InventoryDbHelper mDbHelper = new InventoryDbHelper(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try  {
            SQLiteDatabase db = InventoryDbHelper.getWritableDatabase();
            ContentValues values= new ContentValues();
            values.put(Contract.InventoryEntry.COLOMN_NAME_PRODUCT_NAME,)
        }

    }
}
