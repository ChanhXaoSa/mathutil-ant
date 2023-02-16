/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanh.mathutil.main;
import com.chanh.mathutil.core.MathUtility;
/**
 *
 * @author Triệu
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    //dan dev phai co trach nhiem test code cua minh chay dung hay sai
    //truoc khi lap rap no voi cac class khac de tao nen chuc nang
    //ghi chu
    //co nhieu quy tac dat ten ham cho viec kiem thu
    //thuong ten ham se bao ham ngu nghia cua viec kiem thu
    //ham duoi nay se dung de test ham tinh giai thua trong tinh huong
    //dua n dung chuan thi ta hu vong - excepted
    //ham chay ngon nhu thiet ke, vi du n=0 thi ham tra ve 1
    //
    public static void testFactorialGivenRightArgumentRunsWell() {
        //test case 1 getFactorial with n=0
        //expected value = 1 hu vọng đưa n=0 vào thì hàm trả về là 1
        int n = 0;
        long expectedValue = 1;
        long actualValue = (long) MathUtility.getFactorial(n);
        
        System.out.println("Test " + n + "; expected =" + expectedValue + 
                "; actual value = "+ actualValue);
    }
}
