package com.example.recoded.inventory;

import android.provider.BaseColumns;

public class Contract {
    private  Contract(){}

    //first table name and it's colomn'S name we made them final to have ability to change from other places
    public static class InventoryEntry implements BaseColumns{
        public static final String ID ="_ID";
        public static final String TABLE_NAME="entry";
        public static final String  COLOMN_NAME_PRODUCT_NAME="product name";
        public static final String  COLOMN_NAME_PRICE="price";
        public static final String COLOMN_NAME_QUANTITY="quantity";
        public static final String COLOMN_NAME_SUPPLIER_NAME="supplier name";
        public static final String COLOMN_NAME_SUPPLIER_PHONE_NUMBER="supplier phone number";
    }
}
