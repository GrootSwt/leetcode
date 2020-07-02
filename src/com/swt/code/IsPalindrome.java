/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class IsPalindrome {
	public boolean isPalindrome(int x) {
		int y = 0;
		int z = x;
		if(x < 0) {
			return false;
		}
		
		if(x == 0) {
			return true;
		}
		
		while(z > 0) {
			y = y * 10 + z % 10;
			z = z / 10;
		}
		
		if(y == x) {
			return true;
		}else {
			return false;
		}
    }
	
	public static void main(String[] args) {
		IsPalindrome isPalindrome = new IsPalindrome();
		
		System.out.println(isPalindrome.isPalindrome(10));
	}
}
