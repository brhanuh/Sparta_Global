package org.example;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MySorter<T> {
    public static  <T extends Comparable<T>>  void sort(List theList){
        Collections.sort(theList);

    }

    public void sort2(List<T>, Comparable<T> myComparator){

    }
}
