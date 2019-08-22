package com.chaochaogu.guava.splitter;

import com.google.common.base.Splitter;

/**
 * Splitter 提供了各种方法来处理分割操作字符串，对象等
 *
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaSplitterTest {

    public static void main(String[] args) {
        GuavaSplitterTest tester = new GuavaSplitterTest();
        tester.testSplitter();
    }

    private void testSplitter() {
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, , brown         , fox,              jumps, over, the, lazy, little dog."));
    }
}
