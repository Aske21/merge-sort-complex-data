package com.company.bottomup;

import com.company.AbstractSort;

public class MergeSort extends AbstractSort {

    public static void sort(Comparable[] elements) {
        Comparable[] aux = new Comparable[elements.length];
        for (int size = 1; size < elements.length; size *= 2) {
            for (int low = 0; low < elements.length - size; low += 2 * size) {
                int mid = low + size - 1;
                int high = Math.min(low + 2 * size - 1, elements.length - 1);
                merge(elements, aux, low, mid, high);
            }
        }
    }

    private static void merge(Comparable[] elements, Comparable[] aux, int low, int mid, int high) {

        for (int k = low; k <= high; k++) {
            aux[k] = elements[k];
        }

        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            if (i > mid) {
                elements[k] = aux[j++];
            } else if (j > high) {
                elements[k] = aux[i++];
            } else if (less(aux[j], aux[i])) {
                elements[k] = aux[j++];
            } else {
                elements[k] = aux[i++];
            }
        }
    }


}
