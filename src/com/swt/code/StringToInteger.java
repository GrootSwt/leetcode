/**
 * 首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：

    如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
    假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
    该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。

注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。

在任何情况下，若函数不能进行有效的转换时，请返回 0 。
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class StringToInteger {

	public int myAtoi(String str) {
		char[] array = str.toCharArray();
		int length = array.length;
		int i = 0; // 角标
		boolean flag = true; // +为true，-为false
		int result = 0;

		// 去除空格
		while (i < length && array[i] == ' ') {
			i++;
		}

		// 如果为空字符串，返回0
		if (i == length) {
			return 0;
		}

		// 判断去除空格后首个字母是否为 +，-，数字，其他
		if (array[i] == '-') {
			flag = false;
			i++;
		} else if (array[i] == '+') {
			i++;
		} else if (!Character.isDigit(array[i])) {
			return 0;
		}

		// 获得具体数值
		while (i < length && Character.isDigit(array[i])) {
			// 判断是否越界
			// result * 10 + array[i] > Integer.MAX_VALUE
			int temp = array[i] - '0';
			if (result > (Integer.MAX_VALUE - temp) / 10) {
				return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}

			result = result * 10 + temp;
			i++;
		}

		return flag ? result : 0 - result;
	}

	public static void main(String[] args) {
		StringToInteger sti = new StringToInteger();
		int result = sti.myAtoi("42");
		System.out.println(result);

	}

}
