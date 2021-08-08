package com.example.bookfromlistapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bookfromlistapp.adabter.RecycviewAdabter;
import com.example.bookfromlistapp.model.VolumeInfo;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    EditText bookname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclelist);
        bookname=findViewById(R.id.bookname);
        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(getParent(),LinearLayoutManager.VERTICAL,false));

        bookname.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                loaddata(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }


        });

    }
    private void loaddata(String input) {
        BooksViewModel viewModel = new ViewModelProvider(this).get(BooksViewModel.class);
        final Observer<VolumeInfo> responseObserver= volumeInfo -> {
            if(viewModel!=null){
                RecycviewAdabter recycviewAdabter=new RecycviewAdabter(getBaseContext(),volumeInfo);
                recyclerView.setAdapter(recycviewAdabter);
                recycviewAdabter.notifyDataSetChanged();


            }
            else
                Toast.makeText(MainActivity.this,"Error fetching data",Toast.LENGTH_LONG).show();
        };
        viewModel.Apicall(input);
        viewModel.getbooksobserve().observe(this,responseObserver);
    }
}