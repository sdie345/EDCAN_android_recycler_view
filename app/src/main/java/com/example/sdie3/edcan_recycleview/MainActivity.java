package com.example.sdie3.edcan_recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ListItem> data = new ArrayList<>();
    RecycleViewAdapter adapter;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycleView);
        editText = findViewById(R.id.editText);
        button = findViewById(R.id.button);

//        data.add(new ListItem("title1","content1"));
//        data.add(new ListItem("title2","content2"));
//        data.add(new ListItem("title3","content3"));
//        data.add(new ListItem("title4","content4"));
//        data.add(new ListItem("title5","content5"));
//        data.add(new ListItem("title6","content6"));
//        data.add(new ListItem("title7","content7"));
//        data.add(new ListItem("title8","content8"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        adapter = new RecycleViewAdapter(data);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int postiton = recyclerView.getChildAdapterPosition(v);
                Toast.makeText(MainActivity.this,   data.get(postiton).title + " " + data.get(postiton).content, Toast.LENGTH_SHORT).show();
            }
        });
        recyclerView.setAdapter(adapter);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data.add(new ListItem(editText.getText().toString(), "content"));
                editText.setText("");
                adapter.notifyDataSetChanged();
            }
        });
    }
}
