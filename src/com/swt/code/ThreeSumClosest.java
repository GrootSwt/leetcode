/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。
 * 找出 nums 中的三个整数，使得它们的和与 target 最接近。
 * 返回这三个数的和。假定每组输入只存在唯一答案。
 */
package com.swt.code;

import java.util.Arrays;

/**
 * @author 孙文涛
 */
public class ThreeSumClosest {
	/**
	 * 1、进行排序
	 * 2、双指针方法
	 * 3、小于目标值则增加，左指针移动
	 * 4、大于目标值就减小，右指针移动
	 * @param nums
	 * @param target
	 * @return
	 */
	public Integer threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int result = nums[0] + nums[1] + nums[nums.length - 1];
		for (int i = 0; i < nums.length - 2; i++) {
			int x = i + 1;
			int y = nums.length - 1;
			while(x < y) {
				int temp = nums[i] + nums[x] + nums[y];
				 if(temp == target) {
					 return temp;
				 }else if(Math.abs(temp - target) < Math.abs(result - target)) {
					 result = temp;
				 }
				 
				 if(temp <= target) {
					 x++;
				 }else {
					 y--;
				 }
			}
		}
		return result;
	}
}
