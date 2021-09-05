/**
 * 字符          数值
	I             1
	V             5
	X             10
	L             50
	C             100
	D             500
	M             1000
	I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
	X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
	C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class IntToRoman {

	public String intToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] romans = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < values.length && num > 0;i++) {
			if(values[i] <= num) {
				sb.append(romans[i]);
				num = num - values[i];
				i = 0;
			}
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		IntToRoman intToRoman = new IntToRoman();
		System.out.println(intToRoman.intToRoman(58));
	}

}
