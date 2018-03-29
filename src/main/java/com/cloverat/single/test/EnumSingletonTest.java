package com.cloverat.single.test;

import com.cloverat.single.EnumSingleton;

/**
 * @author chenyujun
 * @date 18-3-29
 */
public class EnumSingletonTest {

    public static void main(String[] args) {
        System.out.println(EnumSingleton.INSTANCE.getType());
    }
}
