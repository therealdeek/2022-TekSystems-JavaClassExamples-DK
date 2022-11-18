package com.sbaQuestion1_List_Inheritance;

import java.util.ArrayList;
import java.util.List;

public class ArrayToList implements MyList{

    List<String> arrayToList;


    public ArrayToList() {
        this.arrayToList = new ArrayList<>();
    }

    @Override
    public ArrayList<String> arrayToList() {
        return null;
    }

    @Override
    public void convert(String[] a) {
        this.arrayToList.clear();
        for (int i = 0; i < a.length; i++) {
            this.arrayToList.add(a[i]);
            System.out.println("I have added the string: " + a[i]+
                    "at the index: " + i);
        }
    }

    @Override
    public void replace(int idx) {
        System.out.println("I have replaced the string: "+ this.arrayToList.get(idx) +
                " with a null string");
        this.arrayToList.set(idx, "");
    }

    @Override
    public ArrayList<String> compact() {
        ArrayList<String> newlist = new ArrayList<>();

        for (String e : this.arrayToList) {
            if (!e.equals(""))
                newlist.add(e);
        }

        return newlist;
    }
}
