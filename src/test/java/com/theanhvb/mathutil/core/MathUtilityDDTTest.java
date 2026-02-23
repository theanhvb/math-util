package com.theanhvb.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.theanhvb.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    //hàm trả về mảng 2 chiều - mảng 2 chiều như chung cư hình chữ nhật tầng x số phòng một tầng
    // chung cư 20 x 10 nghĩa là : 20 tầng mỗi tầng 10 phòng
    // [20][10] nghĩa là 20 dãy  biến, mỗi dẫy là 10 biến
    // 20 cái mảng 1 chiều, mảng 1 chiều 10 phần tử
    // mảng của mảng khác

    // hàm này dùng để trả về tập data dùng để test hàm tính giai thừa
    // mảng 2 chiều[?][2]
    // chuẩn bị data để đưa vào, nhồi vào hàm test - data driven
    public static Object[][] initData(){

        Object dataSet[][] = {  {0, 1},
                                {1, 1},
                                {2, 2},
                                {3, 6},
                                {4, 24},
                                {5, 120}
                                    };

        return dataSet;
    }

    @ParameterizedTest
    @MethodSource("initData")
    public void testGetFactorialGivenRightArg5RunsWell( int n, long expected){

        assertEquals(expected, getFactorial(n));
    }

}