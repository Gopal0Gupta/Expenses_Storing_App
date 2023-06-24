package com.example.roomlibrarysqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
EditText edtnum,edttxt;
Button btnadd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnadd = findViewById(R.id.btnadd);
        edtnum = findViewById(R.id.edtnum);
        edttxt = findViewById(R.id.edttxt);

        DBhelper dBhelper = DBhelper.getdb(this);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = edttxt.getText().toString();
                String amount = edtnum.getText().toString();

                dBhelper.expenseDao().addtx(new Expense(title,amount));
            }
        });
        ArrayList<Expense> arrayList = (ArrayList<Expense>) dBhelper.expenseDao().getexpenseslist();
        for(int i=0;i<arrayList.size();i++){
            Log.d("data","Title : "+arrayList.get(i).getTitle()+"Amount : "+arrayList.get(i).getAmmount());
        }
    }
}