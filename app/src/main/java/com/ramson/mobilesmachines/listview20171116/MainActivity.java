package com.ramson.mobilesmachines.listview20171116;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView list;
    private List<MyClass> allMyClass;
    private MyAdapter adapter;
    private ArrayAdapter arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        list = (ListView) findViewById(R.id.list_item);

        allMyClass = Data.getAllMyClass();
        adapter = new MyAdapter(this, allMyClass);
        Collections.sort(allMyClass, comparator);
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, "selected: " + allMyClass.get(i).getHeading(), Toast.LENGTH_SHORT).show();
    }

    Comparator<MyClass> comparator = new Comparator<MyClass>() {
        @Override
        public int compare(MyClass o1, MyClass o2) {
            return o1.getHeading().compareTo(o2.getHeading());
        }
    };

}
