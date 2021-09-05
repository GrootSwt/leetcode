/*
 *  四数之和
 */
package com.swt.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 孙文涛
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        // 排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            // 当前值和下一个值相同的时候应该舍去
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {
                // 当前值和上一个值相同的时候应该舍去
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                // 设置左右指针
                int left = j + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        list.add(temp);

                        // 当前值和下一个值相同的时候应该舍去
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }

                        // 当前值和上一个值相同的时候应该舍去
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }

                        left++;
                        right--;

                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        FourSum fourSum = new FourSum();
        int[] arr = {-5, -4, -3, -2, 1, 3, 3, 5};

        List<List<Integer>> result = fourSum.fourSum(arr, -11);
        System.out.println(result);
    }
}
