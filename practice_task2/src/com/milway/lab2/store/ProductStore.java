package com.milway.lab2.store;

import com.milway.lab2.model.Timber;

import java.util.Arrays;

public class ProductStore {
    private Timber[] arr = new Timber[3];
    private int count = 0;

    public Timber[] getArr() {
        return Arrays.copyOf(arr, count);
    }

    public Timber get(int id) {
        return arr[0];
    }

    public void add(Timber newTimber) {
        if (arr.length == count)
            arr = Arrays.copyOf(arr, count + count / 2); //created new array's length
        arr[count++] = newTimber;
    }

    @Override
    public String toString() {
        return ("ProductStore"+
                ", arr=" + Arrays.toString(arr) +
                ", count=" + count);
    }
}
