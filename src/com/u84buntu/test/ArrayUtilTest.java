package com.u84buntu.test;

import com.u84buntu.utils.ArrayUtil;

class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        //ArrayUtil test
        float[] arr = util.multipleArray(new float[]{2, 3, 4},
                                         new float[]{4, 1, 3});
        for (float a:
             arr)
            System.out.println(a);
    }
}
