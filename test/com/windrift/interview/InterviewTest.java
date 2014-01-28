package com.windrift.interview;

import org.junit.Test;

public class InterviewTest{


    //either is null
    @Test
    public void findArray1() {
        int[] arr1 = {4, 9, 3, 7, 8};
        int[] arr2 = {3, 7};
        if (Interview.findArray(null, arr2) != -1) System.out.println("findArray1 fail!");
        if (Interview.findArray(arr1, null) != -1) System.out.println("findArray1 fail!");
        if (Interview.findArray(null, null) != -1) System.out.println("findArray1 fail!");
    }
    //either is 0 length
    @Test
    public void findArray2() {
        int[] arr1 = {4, 9, 3, 7, 8};
        int[] arr2 = {};
        int[] arr3 = {};
        if (Interview.findArray(arr1, arr2) != -1) System.out.println("findArray2 fail!");
        if (Interview.findArray(arr2, arr1) != -1) System.out.println("findArray2 fail!");
        if (Interview.findArray(arr2, arr3) != -1) System.out.println("findArray2 fail!");
    }

    //array found at beginning
    @Test
    public void findArray3() {
        int[] arr1 = {4, 9, 3, 7, 8};
        int[] arr2 = {4, 9, 3, 7};
        if (Interview.findArray(arr1, arr2) != 0) System.out.println("findArray3 fail!");
    }

    //array found in middle
    @Test
    public void findArray4() {
        int[] arr1 = {4, 9, 3, 7, 8};
        int[] arr2 = {3, 7};
        if (Interview.findArray(arr1, arr2) != 2) System.out.println("findArray4 fail!");
    }

    //array found at end
    @Test
    public static void findArray5() {
        int[] arr1 = {4, 9, 3, 7, 8};
        int[] arr2 = {3, 7, 8};
        if (Interview.findArray(arr1, arr2) != 2) System.out.println("findArray5 fail!");
    }

    //two arrays are identical
    @Test
    public void findArray6() {
        int[] arr1 = {4, 9, 3, 7, 8};
        if (Interview.findArray(arr1, arr1) != 0) System.out.println("findArray6 fail!");
    }

    //more than 1 appearances found
    @Test
    public static void findArray7() {
        int[] arr1 = {4, 9, 3, 6, 9, 3, 8};
        int[] arr2 = {9, 3};
        if (Interview.findArray(arr1, arr2) != 1) System.out.println("findArray7 fail!");
    }

    // arr1 is shorter than arr2
    @Test
    public void findArray8() {
        int[] arr1 = {3, 7};
        int[] arr2 = {4, 9, 3, 7, 8};
        if (Interview.findArray(arr1, arr2) != -1) System.out.println("findArray8 fail!");
    }
    // length of either array is 1
    @Test
    public void findArray9() {
        int[] arr1 = {2};
        int[] arr2 = {1,2};
        if (Interview.findArray(arr1, arr2) != -1) System.out.println("findArray9 fail!");
        if (Interview.findArray(arr2, arr1) != 1) System.out.println("findArray9 fail!");
        if (Interview.findArray(arr1, arr1) != 0) System.out.println("findArray9 fail!");
    }

}
