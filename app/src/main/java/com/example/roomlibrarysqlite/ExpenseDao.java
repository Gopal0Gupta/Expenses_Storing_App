package com.example.roomlibrarysqlite;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface ExpenseDao {
    @Query("select * from EXPENSE")
    List<Expense> getexpenseslist();

    @Insert
    void addtx(Expense expense);
    @Update
    void update(Expense expense);
    @Delete
    void delete(Expense expense);

}
