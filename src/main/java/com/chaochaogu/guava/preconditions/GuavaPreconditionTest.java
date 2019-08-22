package com.chaochaogu.guava.preconditions;

import com.google.common.base.Preconditions;

/**
 * Preconditions提供静态方法来检查方法或构造函数，被调用是否给定适当的参数
 * 其方法失败抛出IllegalArgumentException
 * @author Ciwei
 * @date 2019/8/13
 */
public class GuavaPreconditionTest {

    public static void main(String[] args) {

        try {
            System.out.println(sqrt(-3.0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(sum(null, 3));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(getValue(6));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }

    private static Integer sum(Integer p1, Integer p2) throws NullPointerException {
        Integer a = Preconditions.checkNotNull(p1, "First Parameter is null");
        Integer b = Preconditions.checkNotNull(p2, "Second Parameter is null");
        return a + b;
    }

    private static int getValue(int i) throws IndexOutOfBoundsException {
        int[] intArr = {3, 4, 5};
        Preconditions.checkElementIndex(i, intArr.length, "Illegal Argument passed : Invalid Index");
        return intArr[i];
    }

    private static double sqrt(double v) throws IllegalArgumentException {
        Preconditions.checkArgument(v > 0.0, "Illegal Argument passed : Negative value %s", v);
        return Math.sqrt(v);
    }
}
