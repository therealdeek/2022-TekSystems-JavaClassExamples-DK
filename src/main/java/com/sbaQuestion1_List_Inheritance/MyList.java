package com.sbaQuestion1_List_Inheritance;

import java.util.ArrayList;

public interface MyList {
    //initialize empty list arrayToList
    ArrayList<String> arrayToList();

    /*
    adds the strings in the array a, to the list arrayList. Also prints
    "I have added the string:{string} at the index:{index}".
     */
    void convert(String[] a);

    /*/replaces the string at the index idx of arrayToList, with an
    empty string. Also prints "I have replaced the string:{string} with
    a null string".
    */
    void replace(int idx);

    /* It should remove all the empty string from the list and return
    the resulting list.
     */

    ArrayList<String> compact();

}
