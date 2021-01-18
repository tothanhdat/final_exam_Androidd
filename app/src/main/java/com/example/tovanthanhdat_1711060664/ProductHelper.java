package com.example.tovanthanhdat_1711060664;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

import static org.xmlpull.v1.XmlPullParser.TEXT;

public class ProductHelper  extends SQLiteOpenHelper {
    // khai báo tên database và schema
    private static final String DATABASE_NAME = "lunchlist.db";
    private static final int SCHEMA_VERSION = 1;

    public ProductHelper(Context context){
        // gọi constructor của SQLiteOpenHelper truyền tên database và chema
        super(context, DATABASE_NAME, null, SCHEMA_VERSION);
    }

    public ProductHelper(Context context, String name, CursorFactory factory, int version) {
        super(context, name, factory, version);
        // TODO Auto-generated constructor stub
    }
    @Override
    public void onCreate(SQLiteDatabase db) {

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub
    }
}
