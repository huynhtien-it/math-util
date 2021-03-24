/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huynhtienit.mathutil.main;

import com.huynhtienit.mathutil.MathUtillity;

/**
 *
 * @author Acer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("Hello GitHub");
//        System.out.println("This is 1st upload that connects to remove server: GitHub");
        //tui muốn test 5! có bằng 120 hay không?
        int n = 5; //5! coi bằng mấy
        long expected = 120; //tui kì vọng, hi vọng bạn/hàm tính ra 120
        long actual = MathUtillity.getFactorial(n);
        
        System.out.println("5! expected: " + expected + "; actual " + actual);
        
        //xét trường hợp 2: 0! bằng mấy
        n = 0; //0! coi bằng mấy
        expected = 1; //tui kì vọng, hy vọng bạn/hàm tính ra 1
        
        actual = MathUtillity.getFactorial(n);
        System.out.println("0! expected: " + expected + "; actual " + actual);
    }
    
}

//Trong quy trình làm phần mềm, dân dev phải có trách nhiệm tét từng hàm, 
//từng class trước khi mà mình viết ra, trước ki đóng gói gửi cho bên QA/QC test độc lập
//TỪNG HÀM, TỪNG CLASS PHẢI DDUOCWWJ TÉT CẨN THẬN TRƯỚC KHI CHÚNG ĐƯỢC DÙNG ĐỂ PHỐI HỢP VỚI CÁC CLASS KHÁC. 
//TEST NGAY MỨC HÀM, MỨC CLASS VỪA HOÀN THIỆN, CHƯA THÈM BÀN VỀ UI, THÌ MỨC ĐỘ TEST SỚM NÀY 
//GỌI LÀ UNIT TEST LEVEL - TEST TỪNG ĐƠN THỂ, TỪNG ĐƠN VỊ CODE

//Vậy làm sao để test từng hàm, từng class????
//có nhiều cách để test từng hàm, từng class.
//1. Cách 1: Dùng sout(gọi-hàm-cần-test) để in ra giá trị xử lý của hàm (dùng trong OOP)

//2. Cách 2: Dùng JOptionPane của môn Java Desktop để pop-up một của sổ
//in kết quả sửa lý của hàm để kiểm tra hàm chạy đúng sai (môn java desktop)

//3. Cách 3: Dùng LOG FILE, trang web in ra kết quả xử lý của hàm (môn java web)

//dù là cách nào thì ta cũng cần phải in ra giá trị hàm đã xử lý
//gọi là ACTUAL VALUE
//rồi ta đi so sánh cái giá trị trả về của hàm có giống như ta tính toán
//trước đó hay không, cái ta hi vọng hàm trả về - gọi là EXPECTED VALUE

//nếu ACTUAL VALUE = EXPECTED VALUE -> hàm chạy ngon
//nếu khác                          -> hàm chạy sai

//nguyên tắc của test so sánh output value (actual) vs value đã tính toán (expected)

//3 CÁCH NÀY ĐỀU CÙNG MỘT NGUYÊN TẮC GỌI HÀM ĐỂ XEM HÀM XỬ LÝ RA KẾT QUẢ MẤY
//SAU ĐÓ DÙNG MẮT ĐỂ SO SÁNH ACTUAL VÀ EXPEXTED RỒI TA TỰ KẾT LUẬN
//CÁCH NÀY TIỀM ẨN SAI SÓT KHI TA PHẢI XEM XÉT QUÁ NHIỀU CẶP VALUE
//VÍ DỤ HÀM GIAI THỪA() PHẢI TEST TRƯỜNG HỢP N < 0, = 0, = 1, 18, 19, 20 (BIÊN)
//21, 30, 1 TRIỆU

//MỖI N ĐỂ TEST TA GỌI LÀ MỘT TÌNH HUỐNG XÀI HÀM, 1 TÌNH HUỐNG TEST
//TEST CASE

//CÁCH 4: không thèm nhìn bằng mắt từng trường hợp expected vs actual
//nhờ máy nhìn giùm luôn, vì máy dư sức biết cách so sánh
//máy quét qua tất cả các cặp expected vs actual
//nếu tất cả đều khớp báo tao màu XANH - ĐƯỜNG THÔNG CODE TỐT
//nếu có xuất hiện ít nhất 1 thằng không khớp với actual vs expected
//BÁO TAO MÀU ĐỎ, ĐƯỜNG KẸT, DO CODE CÓ TRỤC TRẶC TÍNH TOÁN
//MUỐN LÀM ĐƯỢC ĐIỀU NÀY TA CẦN THƯ VIỆN HỖ TRỢ
//Java: JUnit, TestNG
//C#: NUnit, MSTest, xUnit
//PHP: PHPUnit
//... mọi ngôn ngữ đều có thư viện xanh đỏ giúp cảnh báo hàm tốt hay không
