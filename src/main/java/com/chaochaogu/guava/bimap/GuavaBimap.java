package com.chaochaogu.guava.bimap;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * BiMap是一种特殊的映射其保持映射，同时确保没有重复的值是存在于该映射和一个值可以安全地用于获取键背面的倒数映射
 * @author Ciwei
 * @date 2019/8/14
 */
public class GuavaBimap {

    public static void main(String[] args) {

        BiMap<Integer, String> empIDNameMap = HashBiMap.create();

        empIDNameMap.put(new Integer(101), "Mahesh");
        empIDNameMap.put(new Integer(102), "Sohan");
        empIDNameMap.put(new Integer(103), "Ramesh");

        //empIDNameMap.inverse()取value返回key empIDNameMap.inverse().inverse()原map取值
        System.out.println(empIDNameMap.inverse().get("Mahesh"));
    }
}
