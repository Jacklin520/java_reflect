package com.lin.domain;

/**
 * @Author: jacklin
 * @Date: 2019/11/12 0:17
 * @Version 1.0
 */
public class Persion {
    private String name;
    private int age;

    public String a;
    protected String b;
    String c;
    private String d;


    public Persion() {
    }

    public Persion(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                ", d='" + d + '\'' +
                '}';
    }


    public void eat(){
        System.out.println("eat...");
    }

    public void eat(String food){
        System.out.println("eat..."+food);
    }
}