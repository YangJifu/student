package com.yang.student.suanfa;

import java.util.Arrays;

/*
    冒泡排序（Bubble Sort）也是一种简单直观的排序算法。它重复地走访过要排序的数列，
    一次比较两个元素，如果他们的顺序错误就把他们交换过来。
    走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
    这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] ={5,3,6,9,2,11};
        int len = arr.length;
        System.out.println("排序前："+Arrays.toString(arr));
        BubbleSort b = new BubbleSort();
        b.bubbleSort(arr, len);
    }
    public void bubbleSort(int a[], int len){
        int i,j,temp;
        int flags =0;
        for(j=0;j<len-1;j++){
            for(i=0;i<len-1-j;i++){
                if (a[i] > a[i + 1])
                {
                    temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    flags = 1;//不是有序的，flags设置为1；
                }
            }
            if(flags==0){
                return;
            }
        }

        System.out.println("排序后："+Arrays.toString(a));
    }
}
