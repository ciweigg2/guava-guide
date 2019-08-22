package com.chaochaogu.guava.caseformat;

import com.google.common.base.CaseFormat;

/**
 * CaseFormat是一种实用工具类，以提供不同的ASCII字符格式之间的转换
 *
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaCaseFormatTest {

    public static void main(String[] args) {
        GuavaCaseFormatTest tester = new GuavaCaseFormatTest();
        tester.testCaseFormat();
    }

    private void testCaseFormat() {
        String data = "test_data";
        System.out.println(CaseFormat.LOWER_HYPHEN.to(CaseFormat.LOWER_CAMEL, "test-data"));
        System.out.println(CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "test_data"));
        System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, "test_data"));
    }
}
