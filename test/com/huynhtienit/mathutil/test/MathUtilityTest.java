/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huynhtienit.mathutil.test;

import com.huynhtienit.mathutil.MathUtillity;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Acer
 */
public class MathUtilityTest {
    //đặt tên hàm theo chuẩn test phần mềm, QA/QC
    @Test //biến hàm này thành main(). Shift F6 để chạy
    public void testFactoryalGivenRightArgumentReturnGoodResult()
    {
        int n = 5; 
        long expected = 120;
        long actual = MathUtillity.getFactorial(n);
        
        assertEquals(expected, actual);
        assertEquals(720, MathUtillity.getFactorial(6)); //6! đúng là 720?
        assertEquals(24, MathUtillity.getFactorial(4));
        assertEquals(6, MathUtillity.getFactorial(3));
        assertEquals(2, MathUtillity.getFactorial(2));
        assertEquals(1, MathUtillity.getFactorial(1));
        assertEquals(1, MathUtillity.getFactorial(0));
        //màu đỏ đến theo 2 nghĩa:
        //hàm tính đúng, kì vọng sai
        //hàm tính sai, kì vọng đúng
        //mỗi lời gọi hàm ở trên đc gọi là 1 Test Cáe
        //một tình huống test hàm, với 1 đầu vào, và nhận đầu ra
    }
    
    //test ngoại lệ thì test như thế nào??
    //vì khi ngoại lệ xảy ra, app dừng liền, màu đỏ, vì có điều
    //ko ổn đã diễn ra
    //thêm nữa ngoại lệ ko phải là value để so sánh, ko biết nó
    //là số mấy, chuỗi gì
    //ngoại lệ chỉ có thể ước lượng nó, chạm nó khi nó xảy ra
    //test ngoại lệ nên được đọc/diễn giải như sau:
    //tui đưa vào các tình huống dữ liệu cà chớn, ví dụ -5
    //ví dụ 22,40
    //tui muốn nhìn xem ngoại lệ có xảy ra trong tình huống này
    //hay không, nếu có xảy ra, thì mừng lắm luôn, vì app/hàm chạy
    //đúng như thiết kế
    //tức là nếu getFactorial(-5) mà ném ra ngoại lệ
    //IlligalArgumentException, có nghĩa là hàm đúng
    //CÓ NGHĨA LÀ MÀU XANH (đừng bối rối khi có Exeption mà lại XANH
    //XANH vì thiết kế nói rằng tình huống -5 phải có ngoại lệ
    //và nếu ngoại lệ xh, thì hàm đúng
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException()
    {
        MathUtillity.getFactorial(-5); //chạy hàm hoi, chưa test
        MathUtillity.getFactorial(21); //biết thừa hàm ném ra Ex
        MathUtillity.getFactorial(-1); //ta phải chụp lại cái Ex
        MathUtillity.getFactorial(4); //nếu có thật, hàm đúng, XANH
    }
}


//Việc test dùng màu sắc, dùng thư viện Unit Test có quy ước
//nếu tất cả các cặp expected và axtual khớp nhau (equals)
//thì coi như hàm chạy đúng mọi tình huống ta đã test -> XANH

//nếu trong tất cả các cặp mà ta test, có ít nhất 1 cặp
//ko khớp nhau - ít nhất 1 màu đỏ, coi như hàm ko ổn -> ĐỎ CHUNG
//Điều này để đảm bảo rằng, phàm hàm mà test các tình huống
//thì phải đúng hết các tình huống đã test
//Nói cách khác, những gì ta chủ động liệt kê,
//thì ta phải thấy đúng