package com.jun.top;

import org.junit.jupiter.api.Test;

/**
 * @ClassName: shuanfa
 * @Description: 1
 * @Author: lijun
 * @Date: 2019/5/13 0013下午 2:47
 * @Version: 1$
 **/
public class shuanfa {

    @Test
    public void test() { //char[] cs = {'a','b','c','d','e'};
        char[] cs = {'a', 'b', 'c'};
        int length = cs.length;
        recursionSwap(cs, 0, length);
    }

    public void swap(char[] cs, int index1, int index2) {
        char temp = cs[index1];
        cs[index1] = cs[index2];
        cs[index2] = temp;
    }

    public void recursionSwap(char[] cs, int start, int length) {
        if (start >= length - 1) {
            print(cs);
            return;
        }
        for (int i = start; i < length; i++) {
            System.out.println("start=" + start + "  i=" + i);
            swap(cs, start, i);
            recursionSwap(cs, start + 1, length);
            swap(cs, start, i);
        }
    }

    public void print(char[] cs) {
        for (int i = 0; i < cs.length; i++) {
            System.out.print(cs[i]);
        }
        System.out.println();
    }

    public void printABC(char[] cs) {
        for (int i = 0; i < cs.length; i++) {
            for (int j = i + 1; j < cs.length; j++) {

            }
        }
    }
}
