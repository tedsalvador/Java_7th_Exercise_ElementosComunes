package com.example.commonarray.service;

import com.example.commonarray.model.ArrayElement;
import java.util.ArrayList;
import java.util.List;

public class ArrayService {
    public List<ArrayElement> findCommonElements(int[] array1, int[] array2) {
        List<ArrayElement> commonElements = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    commonElements.add(new ArrayElement(array1[i], i, j));
                }
            }
        }
        return commonElements;
    }
}

