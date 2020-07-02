/**
 * 
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class RomanToInt {
	public int romanToInt(String s) {
		int[] values = { 1000, 500, 100, 50, 10, 5, 1 };
		String[] romans = { "M", "D", "C", "L", "X", "V", "I" };
		int[] values02 = { 900, 400, 90, 40, 9, 4 };
		String[] romans02 = { "CM", "CD", "XC", "XL", "IX", "IV" };
		int result = 0;
		boolean flag = false;
		while (!s.isEmpty()) {
			flag = false;
			// 先判断长度是否大于两位
			if (s.length() >= 2) {
				String temp = s.substring(0, 2);
				// 判断是否满足romans02条件
				for (int i = 0; i < values02.length; i++) {
					if (temp.equals(romans02[i])) {
						result += values02[i];
						s = s.substring(2);
						flag = true;
						break;
					}
				}
			}
			// 如果不满足romans02条件
			// 再获取单个字符
			if (!flag) {
				String temp = s.substring(0, 1);
				for (int i = 0; i < values.length; i++) {
					if (temp.equals(romans[i])) {
						result += values[i];
						s = s.substring(1);
					}
				}
			}
		}

		return result;
	}

	public static void main(String[] args) {
		RomanToInt romanToInt = new RomanToInt();
		System.out.println(romanToInt.romanToInt("MCMXCIV"));
	}
}
