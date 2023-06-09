package com.example.demo.base;

public class ComputerTeacher extends Teacher implements BeginClass{

    public String name = "张三";
    public String major = "计算机";
    public String classroom = "A楼";

    @Override
    public void beginClass() {
        int m = (int) (10 * Math.random());
        int n = (int) (10 * Math.random());
        System.out.println(m * Math.pow(2, n));
    }
}
