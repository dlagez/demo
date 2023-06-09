package com.example.demo.base;

public class EnglishTeacher extends Teacher implements BeginClass{

    public String name = "李五";
    public String major = "英语";
    public String classroom = "B楼";

    @Override
    public void beginClass() {
        int m = (int) (26 * Math.random());
        System.out.println(generateStrings(m));
    }

    static String generateStrings(int length) {
        String allCharacters = "abcdefghijklmnopqrstuvwxyz";
        // 初始化字符串
        StringBuilder randomString = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // 随机去一个字符
            int randomIndex = (int) (Math.random() * allCharacters.length());
            // 加入到
            randomString.append(allCharacters.charAt(randomIndex));
        }
        return randomString.toString();
    }
}
