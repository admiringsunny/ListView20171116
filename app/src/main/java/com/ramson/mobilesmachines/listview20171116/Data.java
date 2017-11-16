package com.ramson.mobilesmachines.listview20171116;

import java.util.ArrayList;
import java.util.List;

public class Data {

    static List<MyClass> getAllMyClass() {

        List<MyClass> myClasses = new ArrayList<>();
        myClasses.add(new MyClass(0, "Heading4", "Content4"));
        myClasses.add(new MyClass(0, "Heading3", "Content3"));
        myClasses.add(new MyClass(0, "Heading1", "Content1"));
        myClasses.add(new MyClass(0, "Heading2", "Content2"));


        return myClasses;
    }
}
