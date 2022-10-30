package com.heipet.heipet;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

public class BD_helper extends SQLiteOpenHelper {
    public static final String DBNAME = "login.db";
    public BD_helper( Context context) {
        super(context, "login.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE usuario (nome text primary key,  senha text )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS usuario");

    }

    public Boolean insertData(String nome,  String senha){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put("nome", nome);
        values.put("senha", senha);

        long result = db.insert("usuario", null, values);
        if(result==-1) return false;
        else return true;
    }

    public Boolean checkUsername(String nome){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from usuario where nome=?", new String[] {nome});
        if(cursor.getCount()>0) return true;
        else return false;
    }

    public Boolean checkUserPass(String nome,  String senha){
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from usuario where nome =? and senha=?", new String[] { nome, senha });
        if(cursor.getCount()>0) return true;
        else return false;
    }
}
