/**
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class IntegerReverse {
	
	/**
	 * 获取整数的最后一位，然后将整数去掉个位，最后判断是否超过最大值或者最小值
	 * @param x
	 * @return
	 */
	public int reverse(int x) {
		long result = 0;
		while (x != 0) {
			result = result * 10 + x % 10;
			x = x / 10;
		}
		return (int) result == result ? (int) result : 0;
	}

	public static void main(String[] args) {
		IntegerReverse integerReverse = new IntegerReverse();
		int result = integerReverse.reverse(-1234560);
		System.out.println(result);
	}
}
