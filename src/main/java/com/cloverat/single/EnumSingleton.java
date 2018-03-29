package com.cloverat.single;

/**
 * 枚举类
 *
 * @author chenyujun
 * @date 18-3-29
 */
public enum EnumSingleton {
    
    INSTANCE;

    // https://blog.csdn.net/u013256816/article/details/50562905

    //枚举式式最简单最优秀的单例写法，
    //可以防止反射工具（详细参考《如何防止单例模式被JAVA反射攻击》）和序列化破坏（详细参考《JAVA序列化 》），
    //《Effective Java》的作者Joshua Bloch推荐使用这种写法，
    //博主也认为这种写法不错，只是用的人较少，没有普遍性，
    //建议编程时采用占位符式（不能防止反射和序列化破坏），当然写成枚举式就更好啦。

    static int value;

    public static int getValue() {
        return value;
    }

    String type;

    public String getType() {
        return type;
    }
}
