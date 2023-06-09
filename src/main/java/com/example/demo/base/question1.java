package com.example.demo.base;

// 这个题拿到手就想到了策略模式。由于老师是固定的，并且数量较少。
// 我们可以使用策略模式定义，并使用抽象类定义出老师的属性和方法。
// 在运行是确定执行的是哪个老师的上课操作。

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class question1 {

    public static void main(String[] args) throws IOException {
        String file = "students.csv";
        HashMap<String, String> studentsMap = readFile(file);

        // 使用hashMap可以提高查询的效率。
        HashMap<String, Teacher> teacherMap = new HashMap<>();
        teacherMap.put("计算机", new ComputerTeacher());
        teacherMap.put("英语", new EnglishTeacher());
        teacherMap.put("数学", new MathTeacher());
        teacherMap.put("文学", new LiteratureTeacher());

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (studentsMap.containsKey(s)) {
            String major = studentsMap.get(s);
            Teacher teacher = teacherMap.get(major);
            System.out.println(teacher.major + teacher.name + teacher.classroom);
            teacher.beginClass();
        }
    }

    public static HashMap<String, String> readFile(String file) throws IOException {
        HashMap<String, String> students = new HashMap<>();
        BufferedReader in = new BufferedReader(new FileReader(file));
        String line;

        while ((line = in.readLine()) != null) {
            String columns[] = line.split(",");
            if (!students.containsKey(columns[1])) {
                students.put(columns[0], columns[0]);
            }

        }
        in.close();

        return students;
    }

}
