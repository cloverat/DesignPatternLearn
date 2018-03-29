package com.cloverat.single;

/**
 * 双检锁
 *
 * @author chenyujun
 * @date 18-3-29
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton singleton;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getInstance() {
        DoubleCheckLockSingleton local = singleton;
        if (null == singleton) {
            synchronized (DoubleCheckLockSingleton.class) {
                local = singleton;
                if (null == local) {
                    singleton = local = new DoubleCheckLockSingleton();
                }
            }
        }

        return local;
    }
}
