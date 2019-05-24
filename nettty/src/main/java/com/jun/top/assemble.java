package com.jun.top;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName: assemble
 * @Description: 1
 * @Author: lijun
 * @Date: 2019/5/17 0017上午 11:34
 * @Version: 1$
 **/
public class assemble {
    //拿值的数组
    private Double[] arr;
    //给定的目标数
    private Double W;
    //取数的个数
    private int m;
    //结果集，存的是数在数组中的位置
    private Set<Set<Integer>> result = new HashSet<Set<Integer>>();

    assemble(Double[] arr, Double W, int m) {
        this.arr = arr;
        this.W = W;
        this.m = m;
    }

    //控制取数次数
    public Set<Set<Integer>> init() {
        m -= 1;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] < W) {
                Set<Integer> set = new HashSet<Integer>();
                set.add(x);
                iteration(set, m);
            }
        }
        return result;
    }

    //遍历把值存入set中
    public Set<Integer> ergodicSet(int y, Set<Integer> set) {
        Set<Integer> newset = new HashSet<Integer>();
        newset.add(y);
        Iterator<Integer> it2 = set.iterator();
        while (it2.hasNext()) {
            int i = it2.next();
            newset.add(i);
        }
        return newset;
    }

    //递归取数的位置
    public void iteration(Set<Integer> set, int m) {
        m -= 1;

        Iterator<Integer> it = set.iterator();
        Double v = 0.0;
        while (it.hasNext()) {
            int i = it.next();
            v += arr[i];
        }
        for (int y = 0; y < arr.length; y++) {
            if (!set.contains(y)) {
                //是否是最后一次取值
                if (m != 0) {
                    //小于目标数把数的位置存入set
                    if (arr[y] + v < W) {
                        Set<Integer> newset = ergodicSet(y, set);
                        iteration(newset, m);
                    }
                } else {
                    //最后一次等于目标数把数的位置存入result
                    if (arr[y] + v == W) {
                        Set<Integer> newset = ergodicSet(y, set);
                        result.add(newset);
                    }
                }
            }

        }
    }

    public static void main(String args[]) {
        /*Double [] array={1.0, 1.0, 1.0, 1.0, 1.0, 1.0};
        assemble ass=new assemble(array,100.0,n);
        Set<Set<Integer>> r=new HashSet<Set<Integer>>();
        r=ass.init();
        Iterator<Set<Integer>> iter = r.iterator();
        //打出所以可能
        while (iter.hasNext()) {
            Set<Integer> z=iter.next();
            Iterator<Integer> zit = z.iterator();
            while (zit.hasNext()) {
                System.out.print(zit.next());

            }
            System.out.println();
        }*/
        StringBuffer sb = new StringBuffer();

        switch (2) {
            case 1:
                sb.append("hello");
            case 2:
                sb.append("b");
            case 3:
                sb.append("c");
            default:
                sb.append("9");
        }
        System.out.println(sb.toString());
    }
}
