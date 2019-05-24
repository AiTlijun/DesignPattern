package com.jun.top;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName: Solution
 * @Description: Solution
 * @Author: lijun
 * @Date: 2019/4/19 0019上午 10:37
 * @Version: 1.0.0$
 **/

public class Solution {

    /* Given an unsorted integer array, find the smallest missing positive integer.
     Example 1:
     Input: [1,2,0]
     Output: 3
     Example 2:
     Input: [3,4,-1,1]
     Output: 2
     Example 3:
     Input: [7,8,9,11,12]
     Output: 1*/
    public int firstMissingPositive(Vector<Integer> nums) {

        return 0;
    }

    //有N个台阶，可以走两步也可以走一步 一共有多少种走法
    public int CountNumber(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            return CountNumber(n - 1) + CountNumber(n - 2);
        }
    }

    //-Xms4g -Xmx4g -Xmn1024m -Xss128K -XX:PermSize=320M -XX:MaxPermSize=320m -XX:SurvivorRatio=6
    public static void main(String[] args) {
        //Solution solution = new Solution();
        // System.out.println(solution.CountNumber(10000));

       /* mat(0);
        mat(10000);

        mat(100000);

        mat(1000000);*/

        /*TreeNode r1 = new TreeNode(1);
        TreeNode r2 = new TreeNode(2);
        TreeNode r3 = new TreeNode(3);
        TreeNode r4 = new TreeNode(4);
        TreeNode r5 = new TreeNode(5);
        TreeNode r6 = new TreeNode(6);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r3.right = r6;*/
        for (int i = 0; i < 100; i++) {
            call();
        }

    }

    public static void call(){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });
        String result = null;
        try {
            result = executorService.invokeAny(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("result = " + result);

        executorService.shutdown();

    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }




    public static void mat(int initialCapacity) {
        HashMap<Integer, String> map;
        if (initialCapacity == 0) {
            map = new HashMap<Integer, String>();
        } else {
            map = new HashMap<Integer, String>(initialCapacity);
        }
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            map.put(i, "里面那个价格" + i);
        }
        long sendTime = System.currentTimeMillis();
        System.out.println("发费时间：" + (sendTime - startTime));
    }
}
