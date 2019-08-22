package com.chaochaogu.guava.ordering;

import com.google.common.collect.Ordering;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Ordering(排序)可以被看作是一个丰富的比较具有增强功能的链接，多个实用方法，多类型排序功能等
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaOrderingTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList();
        List<String> names = new ArrayList();
        numbers.add(15);
        numbers.add(19);
        numbers.add(1);
        numbers.add(3);
        numbers.add(67);
        numbers.add(127);
        names.add("alley");
        names.add("zoe");
        names.add("jack");
        names.add("rose");
        names.add("belly");
        names.add("cherry");

        System.out.println("origin numbers : " + numbers);
        System.out.println("origin names : " + names);

        Ordering<Comparable> ordering = Ordering.natural();
        Collections.sort(numbers, ordering);
        Collections.sort(names, ordering);
        System.out.println("natural ordering numbers : " + numbers);
        System.out.println("natural ordering names : " + names);

        names.add(null);
        System.out.println("origin add null names : " + names);
        Collections.sort(numbers, ordering.nullsFirst().reverse());
        Collections.sort(names, ordering.nullsFirst().reverse());
        System.out.println("nullFirst then reverse ordering numbers : " + numbers);
        System.out.println("nullFirst then reverse ordering names : " + names);
    }
}
