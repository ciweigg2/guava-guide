package com.chaochaogu.guava.collections2;

import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

import java.util.Collection;
import java.util.List;

/**
 * @author 马秀成
 * @date 2019/8/22
 * @jdk.version 1.8
 * @desc filter（）：只保留集合中满足特定要求的元素
 */

public class FilterDemo {

    public static void main(String[] args) {
        List<String> list= Lists.newArrayList("moon","dad","refer","son");
        Collection<String> palindromeList= Collections2.filter(list, input -> {
            return new StringBuilder(input).reverse().toString().equals(input); //匹配倒过来也相等的字符串
        });
        System.out.println(palindromeList);
    }

}
