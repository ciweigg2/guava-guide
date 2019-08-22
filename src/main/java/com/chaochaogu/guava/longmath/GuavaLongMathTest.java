package com.chaochaogu.guava.longmath;

import java.math.RoundingMode;

/**
 * LongMath提供long基础类型的实用方法
 *
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaLongMathTest {
    public static void main(String[] args) {
        GuavaLongMathTest tester = new GuavaLongMathTest();
        tester.testLongMath();
    }

    private void testLongMath() {
        try {
            System.out.println(com.google.common.math.LongMath.checkedAdd(Long.MAX_VALUE, Long.MAX_VALUE));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println(com.google.common.math.LongMath.divide(100, 5, RoundingMode.UNNECESSARY));
        try {
            //exception will be thrown as 100 is not completely divisible by 3 thus rounding
            // is required, and RoundingMode is set as UNNESSARY
            System.out.println(com.google.common.math.LongMath.divide(100, 3, RoundingMode.UNNECESSARY));
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Log2(2): " + com.google.common.math.LongMath.log2(2, RoundingMode.HALF_EVEN));

        System.out.println("Log10(10): " + com.google.common.math.LongMath.log10(10, RoundingMode.HALF_EVEN));

        System.out.println("sqrt(100): " + com.google.common.math.LongMath.sqrt(com.google.common.math.LongMath.pow(10, 2), RoundingMode.HALF_EVEN));

        System.out.println("gcd(100,50): " + com.google.common.math.LongMath.gcd(100, 50));

        System.out.println("modulus(100,50): " + com.google.common.math.LongMath.mod(100, 50));

        System.out.println("factorial(5): " + com.google.common.math.LongMath.factorial(5));
    }
}
