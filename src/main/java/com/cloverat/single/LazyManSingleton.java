package com.cloverat.single;

/**
 * 单例懒汉
 *
 * @author chenyujun
 * @date 18-3-29
 */
public class LazyManSingleton {

    private static LazyManSingleton lazyManSingleton;

    private LazyManSingleton() {

    }

    public static synchronized LazyManSingleton getInstance() {
        if (lazyManSingleton == null) {
            lazyManSingleton = new LazyManSingleton();
        }
        return lazyManSingleton;
    }
}
