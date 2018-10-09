package com.shrekos.kataTest;

public class Solution {
    public int solution(int number) {
        int result = 0;
        for (int i = 1; i <= number; i++) {
            if (i%3 == 0 || i%5 ==0) {
               result = result + i;
            }
        }
        return result;
    }
}
