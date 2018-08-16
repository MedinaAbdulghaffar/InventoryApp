package com.example.recoded.inventory;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

// we created the helper class to take advantage form the SQLiteOpenHelper by implementing it and overriding it's methods
public class InventoryDbHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME="Inventory.db";
    public static final int DATABASE_VERSION=1;
    private static final String SQL_CREATE_ENTRIES= "CREATE TABLE "+ Contract.InventoryEntry.TABLE_NAME+"("+ Contract.InventoryEntry.ID+"INTEGER PRIMARY KEY"+Contract.InventoryEntry.COLOMN_NAME_PRODUCT_NAME
            +"TEXT"+ Contract.InventoryEntry.COLOMN_NAME_PRICE+"INTEGER"+ Contract.InventoryEntry.COLOMN_NAME_QUANTITY+"TEXT"+
            Contract.InventoryEntry.COLOMN_NAME_SUPPLIER_NAME+"TEXT"+ Contract.InventoryEntry.COLOMN_NAME_SUPPLIER_PHONE_NUMBER+"TEXT";

    //we created an constructor to get the super constructor
   public InventoryDbHelper(Context context){
       super(context,DATABASE_NAME,null, DATABASE_VERSION);

   }

   //in this method we create our
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
