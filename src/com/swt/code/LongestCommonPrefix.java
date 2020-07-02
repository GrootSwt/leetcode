/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		String str = strs[0];
		String result = "";
		boolean flag = false;
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < str.length()) {
				str = strs[i];
			}
		}

		for (int j = 1; j <= str.length(); j++) {
			String temp = str.substring(0, j);
			for (int k = 0; k < strs.length; k++) {
				if (!(strs[k].substring(0,j).equals(temp))) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				if (result.length() < temp.length()) {
					result = temp;
				}
			}

			flag = false;
		}
		return result;
	}

	public static void main(String[] args) {

		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String[] strs = { "ca","a" };
		String result = lcp.longestCommonPrefix(strs);
		System.out.println(result);

	}
}
