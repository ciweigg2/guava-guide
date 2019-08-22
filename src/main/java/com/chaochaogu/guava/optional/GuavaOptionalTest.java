package com.chaochaogu.guava.optional;

import com.google.common.base.Optional;

/**
 * Optional用于包含非空对象的不可变对象
 * Optional对象，用于不存在值表示null
 * 这个类有各种实用的方法，以方便代码来处理为可用或不可用，而不是检查null值
 * @author Ciwei
 * @date 2019/8/13
 */
public class GuavaOptionalTest {

    public static void main(String[] args) {

        Integer va1ue1 = null;
        Integer value2 = Integer.valueOf(10);

        // Optional.fromNullable - allows passed parameter to be null
        Optional<Integer> a = Optional.fromNullable(va1ue1);

        // Optional.of - throws NullPointerException if passed parameter is null
        Optional<Integer> b = Optional.of(value2);

        System.out.println(sum(a,b));
    }

    private static Integer sum(Optional<Integer> value1, Optional<Integer> value2) {

        // Optional.isPresent - checks the value is present or not
        System.out.println("first parameter is present : " + value1.isPresent());
        System.out.println("second parameter is present : " + value2.isPresent());

        // Optional.or - returns the value if present otherwise returns the default value passed
        Integer a = value1.or(Integer.valueOf(0));

        // Optional.get - gets the value, value should be present
        Integer b = value2.get();

        return a + b;
    }

}
