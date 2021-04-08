package com.company.bottomup;

import com.company.AbstractSort;

public class MergeSort extends AbstractSort {

    public static void sort(int[] elements) {
        int[] aux = new int[elements.length];
        sort(elements, aux, 0, elements.length - 1);
    }

    private static void sort(int[] elements, int[] aux, int low, int high) {
        if (high <= low) {
            return;
        }

        int mid = low + (high - low) / 2;
        sort(elements, aux, low, mid);
        sort(elements, aux, mid + 1, high);
        merge(elements, aux, low, mid, high);
    }

    private static void merge(int[] elements, int[] aux, int low, int mid, int high) {

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
