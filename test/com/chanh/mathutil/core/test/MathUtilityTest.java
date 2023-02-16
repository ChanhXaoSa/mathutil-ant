/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chanh.mathutil.core.test;

import com.chanh.mathutil.core.MathUtility;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Triệu
 */
public class MathUtilityTest {
            //kiểm thử ngoại lệ là sao
//        tức là hàm getF() có thể thiết kế rằng nếu đưa n và chớn
// thì hàm phải ném ra ngoại lệ !!
// tức là getF(-5) thì expected == ngoại lệ illegal argument 
// thấy ngoại lệ mừng rơi nước mắt
    
    
        @Test(expected = Exception.class)
        public void testFactorialGivenWrongArgumentThrowsException() {
            //test case 5 getF() with a wrong arg:n=-5
            //expected result: an exception is thrown: illegal argument exception
            MathUtility.getFactorial(-5);
            //nếu chỉ gõ lệnh trên thì bị màu đỏ do lệnh này gây ra exception và exception là màu đỏ nhưng hàm này kì vọng phải ra màu đỏ
            //nếu có exception thì đúng như thiết kế phải màu xanh
            // lỗi của ta là không so sánh, chưa nhận diện là đã có ngoại lệ rồi
            //ta cần thêm một lệnh đã có ngoại lệ, nếu đã có rồi thì XANH, chưa thì ĐỎ
            //Junit 4 thì không dùng hàm assert() để đo ngoại lệ
            //JUnit 5 thì dùng hàm assert() để đo ngoại lệ
        }
    //trong hàm này se chứa các test case để test getF()
    //với n hợp lệ trong khoảng 0..20
        @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        
        
        
        //Test case #1: test getF() with n = 0
        //expected result = 1; //hy vọng 0! = 1
        int n = 0;
        long expectedValue = 1;//hy vọng 0! = 1
        long actualValue = (long) MathUtility.getFactorial(n);//thực tế getF() trả về mấy??
        
        Assert.assertEquals(expectedValue , actualValue);
        
        //test case #2: test getf() with n = 5;
        //Expected result = 120; //hy vọng 5! = 120, xem máy có làm được hay ho???
        
//        Assert.assertEquals(2, MathUtility.getFactorial(3), MathUtility.getFactorial(3));
        Assert.assertEquals(24, MathUtility.getFactorial(5), Math.abs(24-MathUtility.getFactorial(5)));
//        //test case #3 : test getF() with n = 6; expected = 720
//        Assert.assertEquals(120, MathUtility.getFactorial(7), MathUtility.getFactorial(7));
//        
//        //test case #4 : test getF() with n = 4; expected = 24
//        Assert.assertEquals(120, MathUtility.getFactorial(6), MathUtility.getFactorial(6));
    }
    
}
