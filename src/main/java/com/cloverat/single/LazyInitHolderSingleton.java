package com.cloverat.single;

/**
 * 占位符式
 *
 * @author chenyujun
 * @date 18-3-29
 */
public class LazyInitHolderSingleton {

    private LazyInitHolderSingleton() {
    }

    private static class SingletonHolder {
        private static final LazyInitHolderSingleton INSTANCE = new LazyInitHolderSingleton();
    }

    public static LazyInitHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
