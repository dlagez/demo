package com.example.demo.base;

public class MathTeacher extends Teacher implements BeginClass{

    public String name = "王六";
    public String major = "数学";
    public String classroom = "C楼";

    // 上课时会随机⼀个3位的正整数m，并反转输出
    @Override
    public void beginClass() {
        int x = (int)(Math.random()*900)+100;
        System.out.println(reverseInteger(x));
    }

    // 反转三位数整数
    public int reverseInteger(int number) {
        int a = number / 100;//百位
        int b = number / 10 % 10;//十位
        int c = number % 10;//个位
        return c * 100 + b * 10 + a;
    }
}
