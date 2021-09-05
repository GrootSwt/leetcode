/**
 * 给你 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class MaxArea {
	public int maxArea(int[] height) {
		int result = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int temp = 0;
				if (height[j] > height[i]) {
					temp = (j - i) * height[i];
				} else {
					temp = (j - i) * height[j];
				}

				if (temp > result) {
					result = temp;
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		MaxArea maxArea = new MaxArea();
		int result = maxArea.maxArea02(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });
		System.out.println(result);
	}

	public int maxArea02(int[] height) {
		int result = 0;

		int i = 0, j = height.length - 1;
		while (i < j) {
			int area = (j - i) * Math.min(height[i], height[j]);
			result = Math.max(result, area);
			if (height[i] <= height[j]) {
				i++;
			} else {
				j--;
			}
		}

		return result;
	}
}
