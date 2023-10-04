package com.calexample;

import java.util.Scanner;

public class Jumper{
    public static int minJumps(int[] heights, int maxJump) {
        int n = heights.length;

       
        int[] dp = new int[n];
        for (int i = 0; i < n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

       
        dp[0] = 0;

       
        for (int i = 1; i < n; i++) {
           
            for (int j = 1; j <= maxJump && j <= i; j++) {
               
                if (Math.abs(heights[i] - heights[i - j]) <= maxJump) {
                    dp[i] = Math.min(dp[i], dp[i - j] + 1);
                }
            }
        }

       
        return dp[n - 1] == Integer.MAX_VALUE ? -1 : dp[n - 1];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxJump = scanner.nextInt();

        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }

        int result = minJumps(heights, maxJump);
        System.out.println(result);
    }
}