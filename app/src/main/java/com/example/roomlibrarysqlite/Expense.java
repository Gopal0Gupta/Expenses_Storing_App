package com.example.roomlibrarysqlite;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "EXPENSE")
public class Expense {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "Title")
    private String title;
    @ColumnInfo(name = "Amount")
    private String ammount;

    Expense (int id,String title,String ammount){
        this.id=id;
        this.title = title;
        this.ammount = ammount;
    }
    @Ignore
    Expense (String title,String ammount){
        this.title = title;
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAmmount() {
        return ammount;
    }

    public void setAmmount(String ammount) {
        this.ammount = ammount;
    }
}
