package com.cloverat.single;

/**
 * 单例饿汉
 *
 * @author chenyujun
 * @date 18-3-29
 */
public class HungryManSingleton {

    private static HungryManSingleton hungryMan = new HungryManSingleton();

    private HungryManSingleton() {

    }

    public static HungryManSingleton getInstance() {
        return hungryMan;
    }
}
