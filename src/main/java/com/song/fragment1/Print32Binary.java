package com.song.fragment1;

/**
 * 打印一个整数Int的32位二进制数
 */
public class Print32Binary {
    /**
     * 打印二进制数据
     *
     * @param num
     */
    public static void print(int num) {
        for (int i = 31; i >= 0; i--) {
            System.out.print((num & (1 << i)) == 0 ? "0" : "1");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int num = 1;
        print(num);
    }
}
