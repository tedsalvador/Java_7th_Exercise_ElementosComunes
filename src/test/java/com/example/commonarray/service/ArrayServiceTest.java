package com.example.commonarray.service;

import com.example.commonarray.model.ArrayElement;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.List;

public class ArrayServiceTest {
    @Test
    public void testFindCommonElements() {
        ArrayService service = new ArrayService();
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        List<ArrayElement> commonElements = service.findCommonElements(array1, array2);

        assertThat(commonElements, hasSize(3));
        assertThat(commonElements, containsInAnyOrder(
            hasProperty("value", is(3)),
            hasProperty("value", is(4)),
            hasProperty("value", is(5))
        ));
    }
}

