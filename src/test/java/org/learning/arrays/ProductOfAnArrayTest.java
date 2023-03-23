package org.learning.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfAnArrayTest {

    private ProductOfAnArray productOfAnArray = new ProductOfAnArray();

    @Test
    public void test_product_of_array() {
        var nums = new int[]{1,2,3,4};
        var result = productOfAnArray.productExceptSelf(nums);
        var expected = new int[]{24, 12, 8, 6};
        assertArrayEquals(expected, result);
    }
}