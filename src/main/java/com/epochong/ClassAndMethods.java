package com.epochong;

/**
 * @author epochong
 * @date 2019/8/20 11:26
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class ClassAndMethods<T> {
    public void a(T t) {
        System.out.println(t);
    }

    public <T> void b(T t) {
        System.out.println(t);
    }
}
