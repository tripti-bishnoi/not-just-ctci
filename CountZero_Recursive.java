package com.resources;


/*
 * count zeros in a sorted array of zero's and one's
 */
public class CountZero_Recursive {

	public static void main(String[] args) {
		System.out.println('z' - 'a');

//		int[] a = { 0, 0, 0, 0, 0, 0 };
//		int[] b = { 1, 1, 1, 1, 1, 1, 1 };
//		int[] c = { 0, 0, 1, 1, 1 };
//		int[] d = { 0, 0, 1, 1, 1, 1, 1, 1 };
//		int[] e = { 0, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
//		int[] f = { 0, 1, 1, 1, 1, 1, 1 };
//
//		// System.out.println("a: " + countZeroes(a, 0, a.length - 1));
//		// System.out.println("b: " + countZeroes(b, 0, b.length - 1));
//		// System.out.println("c: " + countZeroes(c, 0, c.length - 1));
//		// System.out.println("d: " + countZeroes(d, 0, d.length - 1));
//		// System.out.println("e: " + countZeroes(e, 0, e.length - 1));
//		// System.out.println("f: " + countZeroes(f, 0, f.length - 1));
//
//		System.out.println(counting_ceros_rec(a, a.length - 1, 0));
//		System.out.println(counting_ceros_rec(b, b.length - 1, 0));
//		System.out.println(counting_ceros_rec(c, c.length - 1, 0));
//		System.out.println(counting_ceros_rec(d, d.length - 1, 0));
//		System.out.println(counting_ceros_rec(e, e.length - 1, 0));
//		System.out.println(counting_ceros_rec(f, f.length - 1, 0));
	}

	public static int counting_ceros_rec(int[] nums, int n, int counter) {
		// base case
		if (n < 0)
			return counter;

		if (nums[n] == 0) {
			return n + 1;
		} else
			return counter + counting_ceros_rec(nums, n - 1, counter);
	}

	public static int countZeroes(int[] a, int start, int end) {
		if (start >= end) {
			if (a[end] == 0)
				return end + 1;
			else
				return end;
		}

		int mid = (start + end) / 2;

		if (a[mid] == 0)
			return countZeroes(a, mid + 1, end);
		else
			return countZeroes(a, start, mid - 1);
	}

}
