package com.u84buntu.test;

import com.u84buntu.utils.Generator;

class GeneratorTest {
    private final static Generator generator = new Generator();
    private static float[] nums = new float[5];

    public static void main(String[] args) {
        /**
        * Test #1
        * generate numbers
        * First - generate int
        * Second - generate float
        * Third - generate long
        **/
        System.out.println("Integer: " + generator.generateInteger(32));
        System.out.println("Float: " + generator.generateFloat());
        System.out.println("Long: " + generator.generateLong());

         /**
         * Test #2
         * fill array
         * First - fill array "nums"
         * Second - print array
          * @param array
         **/
        generator.fillArray(nums);
        System.out.println("Array #1: ");
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);

        /**
          * Test #3
          * random choice
          * print random number from an array "nums"
          * @param array
          * @output number
          **/
        System.out.print("Random choice: " +
                generator.randomChoice(nums));

    }
}
