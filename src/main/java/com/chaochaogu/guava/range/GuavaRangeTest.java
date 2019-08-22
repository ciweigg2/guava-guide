package com.chaochaogu.guava.range;

import com.google.common.collect.Range;

/**
 * Range 表示一个间隔或一个序列。它被用于获取一组数字/串在一个特定范围之内
 *
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaRangeTest {

    public static void main(String[] args) {

        GuavaRangeTest test = new GuavaRangeTest();
        test.testRange();
    }

    private void testRange() {

        Range<Integer> range1 = Range.closed(0, 9);
        Range.open(0, 9);
        Range.closedOpen(0, 9);
        Range.openClosed(0, 9);
        Range.greaterThan(9);
        Range<Integer> range2 = Range.closed(5, 15);
        System.out.println(range1.intersection(range2));
        System.out.println(range1.span(range2));
    }

}
