package net.mbr.reporter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import net.mbr.reporter.model.Data;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyDataAdapter adapter;
   private List<Data> data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //generate fake data for test
data=new ArrayList<>();
        Data data1 = new Data();
        data1.setName("maryam");
        data1.setFamily("biabani");
        data1.setId(1);
        Data data2=new Data();
        data2.setName("roya");
        data2.setFamily("royayi");
        data2.setId(2);

        data.add(data1);
        data.add(data2);
        System.out.println(data.size());
        //-----------------------------------
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new MyDataAdapter(data);
        recyclerView.setAdapter(adapter);


    }
}