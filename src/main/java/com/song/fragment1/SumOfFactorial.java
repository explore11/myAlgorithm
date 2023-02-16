package com.song.fragment1;

/**
 * 计算阶乘的和
 * 10! +9! +8! +7! +6! + 5! +....+1!
 */
public class SumOfFactorial {

    public static long factorial(int N) {
        long result = 0;
        long cur = 1;
        for (int i = 1; i <= N; i++) {
            cur = cur * i;
            result += cur;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = 10;
        System.out.println(factorial(num));
    }
}
