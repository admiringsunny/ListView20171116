package com.ramson.mobilesmachines.listview20171116;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class MyAdapter extends BaseAdapter {

    Context context;
    List<MyClass> myClasses;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<MyClass> myClasses) {
        this.context = context;
        this.myClasses = myClasses;
    }

    @Override
    public int getCount() {
        return myClasses.size();
    }

    @Override
    public Object getItem(int i) {
        return myClasses.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.list_items, null);
        }

        ImageView img_list_item = (ImageView) view.findViewById(R.id.img_list_item);
        TextView heading = (TextView) view.findViewById(R.id.heading);
        TextView content = (TextView) view.findViewById(R.id.content);

        heading.setText(myClasses.get(i).getHeading());
        content.setText(myClasses.get(i).getContent());


        return view;
    }
}
