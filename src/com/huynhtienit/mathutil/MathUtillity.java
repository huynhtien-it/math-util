package com.huynhtienit.mathutil;

public class MathUtillity {
    //ta se tao cac ham trong class nay fake y chag class Math cua jdk
    //cac ham se xai chung o nhieu noi, lam tien ich dung chung
    //cai gi dung chung thi ta suy nghi den STATIC
    
    public static final double PI = 3.1415; //y chang Math.PI
                                            //Lat hoi Math.
    
    //ham tinh n! = 1.2.3.4.5.6...n
    //Quy uoc: 0! = 1! = 1
    //khong co giai thua am
    //vi giai thua tang cuc nhanh ve gia tri, 21 tràn kiểu long
    //ta sẽ khống chế n đầu vào của hàm từ 0..20
    //kiểu long: 10^18, 18 con số 0 tối đa
    public static long getFactorial(int n)
    {
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0..20");
        if (n == 0 || n == 1)
            return 1; //0! = 1! = 1 tinh luon cho nhan
        //den doan nay sure n tu 2..20
        long result = 0; //cố tình heng, lát tính tiếp
        for (int i = 2; i <= n; i++) 
            result = result * i;
        return result;
    }
}
