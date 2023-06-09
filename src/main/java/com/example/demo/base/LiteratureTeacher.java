package com.example.demo.base;

import java.util.ArrayList;

public class LiteratureTeacher extends Teacher implements BeginClass{

    public String name = "王六";
    public String major = "数学";
    public String classroom = "C楼";


    //随机输出3个汉字
    @Override
    public void beginClass() {
        Character[] chars = new Character[3];
        for(int i=0;i<3;i++) {
            chars[i]=(char) (0x4e00 +(int)(Math.random()*(0x9fa5- 0x4e00+1)));
        }
        System.out.println("result : " + chars.toString());
    }
}
