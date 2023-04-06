package com.example.demo.base;

import java.math.BigDecimal;

public class demo {
    public static void main(String[] args) {
        BigDecimal bigDecimal = new BigDecimal("1120.01");
        BigDecimal bigDecimal2 = new BigDecimal("1121.00");
        BigDecimal add = bigDecimal2.add(bigDecimal);
        String s = bigDecimal.stripTrailingZeros().toPlainString();

        System.out.println(s);
    }
}
