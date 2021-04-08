package com.company;

public class AbstractSort {

    @SuppressWarnings({"unchecked", "rawtypes"})
    public static boolean less (Comparable w, Comparable v) {
        if(v.compareTo(w) < 0) {
            return true;
        }else{
            return false;
        }
    }

    @SuppressWarnings("rawtypes")
    public static void swap(Comparable[] elements, int a, int b) {
        Comparable tmp = elements[a];
        elements[a] = elements[b];
        elements[b] = tmp;
    }

}
