package com.example.demo.base;

import java.util.ArrayList;

public class question2 {

    // 首先统计偶数列的竹节汇总，再统计奇数列竹节汇总，
    // 然后选出最大数。
    // 两次遍历，时间复杂度为O（n）。
    public Integer numOfAnt(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return null;
        }
        Integer largeNumber = 0;
        Integer sum = 0;
        // 取数为偶数
        for (int i = 0; i < list.size(); i = i+2) {
            sum = sum + list.get(i);
        }
        if (sum > largeNumber) {
            largeNumber = sum;
        }
        // 取数为奇数
        for (int i = 1; i < list.size(); i = i+2) {
            sum = sum + list.get(i);
        }
        if (sum > largeNumber) {
            largeNumber = sum;
        }
        return largeNumber;
    }
}
