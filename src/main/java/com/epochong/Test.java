package com.epochong;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author epochong
 * @date 2019/8/20 13:10
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
class MyClass<T extends String,E extends Integer > {
    T name;
    E age;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public E getAge() {
        return age;
    }

    public void setAge(E age) {
        this.age = age;
    }
}
public class Test {
    public static void main(String[] args) {
        MyClass<String,Integer> myClass = new MyClass <>();
        Class cls = myClass.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field :
                fields) {
            System.out.println(field.getType());
        }
        Method[] methods = cls.getDeclaredMethods();
        for (Method method :
                methods) {
            System.out.println(method.getName());
        }
    }
}
