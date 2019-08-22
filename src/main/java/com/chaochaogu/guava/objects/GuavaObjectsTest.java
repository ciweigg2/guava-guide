package com.chaochaogu.guava.objects;

/**
 * Objects类提供适用于所有对象，如equals, hashCode等辅助函数
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaObjectsTest {

    public static void main(String[] args) {

        Student s1 = new Student("Mahesh", "Parashar", 1, "VI");
        Student s2 = new Student("Suresh", null, 3, null);

        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode());
    }
}
