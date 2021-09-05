/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 */
package com.swt.code;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 孙文涛
 */
public class SumTwoNumbers {
	/**
	 * 暴力破解法
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if ((nums[i] + nums[j]) == target) {
					result[0] = i;
					result[1] = j;
					return result;
				}
			}
		}
		result[0] = -1;
		result[1] = -1;
		return result;
	}

	/**
	 * 获取差值，对比Map中是否有和差值相等的键， 如果有，获取值对比是否为i； 如果不是，返回i和值
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum02(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] { i, map.get(complement) };
			}
		}

		throw new IllegalArgumentException("no two sum solution");
	}

	/**
	 * 在往Map中存放元素的同时，判断是否有满足条件的元素
	 * 
	 * @param nums
	 * @param target
	 * @return
	 */
	public int[] twoSum03(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement) && map.get(complement) != i)
				return new int[] { i, map.get(complement) };
			map.put(nums[i], i);
		}

		throw new IllegalArgumentException("no two sum solution");
	}
	/**
	 * 测试
	 * @param args
	 */
	public static void main(String[] args) {
		SumTwoNumbers sumTwoNumbers = new SumTwoNumbers();
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int target = 10;
		int[] twoSum = sumTwoNumbers.twoSum03(nums, target);
		for (int i = 0; i < twoSum.length; i++) {
			System.out.println(twoSum[i]);
		}
	}
}
