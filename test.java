/*题目描述

       给定一个无序数组，包含正数、负数和0，要求从中找出3个数的乘积，使得乘积最大，
       要求时间复杂度：O(n)，空间复杂度：O(1)

        输入描述:

        元素个数n

        无序整数数组A[n]

        输出描述:

        满足条件的最大乘积

        示例1

        输入

        4

        3 4 1 2

        输出

        24*/

package lianxi0428;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] array = new long[n];
        for (int i = 0; i <n ; i++) {
            array[i] = sc.nextLong();
        }
        getLargestMul(array,n);
    }

    public static void getLargestMul(long[] num, int len){
        long max1=0,max2=0,max3=0, min1=0,min2=0;
        for (int i = 0; i <len ; i++) {
            if(num[i]!=0){
                if(num[i]>max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = num[i];
                }else if(num[i]>max2){
                    max3 = max2;
                    max2 = num[i];
                }else if(num[i]>max3){
                    max3 = num[i];
                }else if(num[i]<min1 ){
                    min2 = min1;
                    min1 = num[i];
                }else if(num[i]>min1 && num[i]<min2){
                    min2 = num[i];
                }
            }else continue;

        }
        long max = Math.max(max1*max2*max3,max1*min1*min2);
        System.out.println(max);
    }
}

