package com.chaochaogu.guava.charmatcher;

import com.google.common.base.CharMatcher;

/**
 * CharMatcher提供了各种方法来处理各种JAVA char类型值
 *
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaCharMatcher {

    public static void main(String[] args) {
        GuavaCharMatcher tester = new GuavaCharMatcher();
        tester.testCharMatcher();
    }

    private void testCharMatcher() {
        System.out.println(CharMatcher.digit().retainFrom("mahesh123")); // only the digits
        System.out.println(CharMatcher.whitespace().trimAndCollapseFrom("     Mahesh     Parashar ", ' '));
        // trim whitespace at ends, and replace/collapse whitespace into single spaces
        System.out.println(CharMatcher.javaDigit().replaceFrom("mahesh123", "*")); // star out all digits
        System.out.println(CharMatcher.javaDigit().or(CharMatcher.javaLowerCase()).retainFrom("mahesh123"));
        // eliminate all characters that aren't digits or lowercase
    }
}
