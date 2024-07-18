package com.example.commonarray;

import com.example.commonarray.model.ArrayElement;
import com.example.commonarray.service.ArrayService;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        ArrayService service = new ArrayService();
        List<ArrayElement> commonElements = service.findCommonElements(array1, array2);

        for (ArrayElement element : commonElements) {
            System.out.println(element);
        }
    }
}
