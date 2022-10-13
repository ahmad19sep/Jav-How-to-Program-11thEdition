package Hacker.java;

import java.util.Arrays;
import java.util.Scanner;

/**
 * LeetCode Example
 * https://leetcode.com/problems/median-of-two-sorted-arrays/submissions/
 */
class LeetCode {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] a = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, a, 0, nums1.length);
        System.arraycopy(nums2, 0, a, nums1.length, nums2.length);
        Arrays.sort(a);

        if (a.length % 2 == 0) {
            float mid = (float) (a[a.length / 2]) + (a[(a.length / 2) - 1]);
            return (mid / 2);
        } else {
            return ((float) (a[a.length / 2]));
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        String[] s1 = s.split(" ");
        int[] nums1=new int[s1.length];
        for (int i=0; i<s1.length; i++){
            nums1[i]= Integer.parseInt(s1[i]);
        }

        s = scanner.nextLine();
        String[] s2 = s.split(" ");

        int[] nums2=new int[s2.length];
        for (int i=0; i<s2.length; i++){
            nums2[i]= Integer.parseInt(s2[i]);

        }System.out.println(  new LeetCode().findMedianSortedArrays(nums1,nums2));
    }}

