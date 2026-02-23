package com.theanhvb.mathutil.core;

//day la thu vien toan hoc, mo phong giong thu vien chuan Math, cua JDK
//cac thu vien mang tinh chat tien ich, do dung xai chung cho cac noi, cung cap cac tool nho nho, thi ta se thiet ke thanh cac ham la static
public class MathUtility {
    //ham  tinh n!=1,2,3...n
    //ko co giai thua so am
    // 20! vua du kieu long - 18 con so 0, 21! kieu long chua khong noi
    //0! = 1 quy uoc
    public static long getFactorial(int n) {
        long result;
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0 and 20");

        if (n == 0)
            return 1;

        result = 1;
        for (int i = 1;i <= n; i++)
            result = result * i;
        return result;
    }
}
