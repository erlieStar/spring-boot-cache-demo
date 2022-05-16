package com.javashitang.util;

/**
 * @Author lilimin
 * @Date 2022/5/16
 */
public class ThreadLocalUtil {

    private static ThreadLocal<String> threadLocal = new ThreadLocal<>();

    public static void setPath(String path) {
        threadLocal.set(path);
    }

    public static String getPath() {
        return threadLocal.get();
    }

    public static void remove() {
        threadLocal.remove();
    }
}
