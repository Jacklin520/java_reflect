package com.lin.reflect;

import com.lin.domain.Persion;

/**
 * @Author: jacklin
 * @Date: 2019/11/12 0:19
 * @Version 1.0
 */
public class ReflectDemo1 {
    public static void main(String[] args) throws Exception {
        Class cls = Class.forName("com.lin.domain.Persion");
        System.out.println(cls);
        Class cls2 = Persion.class;
        System.out.println(cls2);
        Persion p = new Persion();
        Class cls3 = p.getClass();
        System.out.println(cls3);
        //== 比较三个对象
        System.out.println(cls == cls2);
        System.out.println(cls == cls3);
    }
}
