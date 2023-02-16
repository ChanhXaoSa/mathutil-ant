/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanh.mathutil.core;

/**
 *
 * @author Triệu
 */
public class MathUtility {

    public static final double PI = 3.1415;

    //ham tinh n giai thua 1*2*3*4*...*n trong do khong co giai thua am
    //0! = 1! = 1
    //vi giai thua tang gia tri rat nhanh
    //21! la gioi han cua kieu long
    //ham nay chi tinh tu 0-20
    //co 2 cach viet ham nay : for truyen thong va de quy - recusion
    public static double getFactorial(int n) {

        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0..20!");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        //song sot den doan nay thi s tu 2..20 for ma choi
        long product = 1;
        for (int i = 2; i < n; i++) {
            product *= i;
        }
        return product;
    }
}
