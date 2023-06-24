package com.example.roomlibrarysqlite;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Entity;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = Expense.class,exportSchema = false,version = 1)
public abstract class DBhelper extends RoomDatabase {
    private static final String DB_NAME = "expensedb";
    private static DBhelper instance;

    public static synchronized DBhelper getdb(Context context){
        if(instance==null){
            instance = Room.databaseBuilder(context,DBhelper.class,DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }
    public abstract ExpenseDao expenseDao();
}
