/**
 *  给你一个字符串 s 和一个字符规律 p，请你来实现一个支持 '.' 和 '*' 的正则表达式匹配。
 *
 *	'.' 匹配任意单个字符
 *	'*' 匹配零个或多个前面的那一个元素
 *	所谓匹配，是要涵盖 整个 字符串 s的，而不是部分字符串。
 *	
 *	说明:
 *	
 *	s 可能为空，且只包含从 a-z 的小写字母。
 *	p 可能为空，且只包含从 a-z 的小写字母，以及字符 . 和 *。
 */
package com.swt.code;

/**
 * @author 孙文涛
 */
public class IsMatch {

	public boolean isMatch(String s, String p) {
		// 判断是否为空
		if (p.isEmpty())
			return s.isEmpty();
		// 判断第一个字符是否匹配
		boolean firstMatch = (!s.isEmpty()) && (s.charAt(0) == p.charAt(0) || (p.charAt(0) == '.'));
		// 判断如果p的第二个字符为*
		if (p.length() >= 2 && p.charAt(1) == '*') {
			// s中的第一个字符和p中的第一个字符匹配不上
			// 或者
			// s中的第一个字符和p中的第一个字符匹配上
			return ((isMatch(s, p.substring(2))) || (firstMatch && isMatch(s.substring(1), p)));
		} else {
			return firstMatch && isMatch(s.substring(1), p.substring(1));  
		}
	}

	public static void main(String[] args) {
		IsMatch isMatch = new IsMatch();
		System.out.println(isMatch.isMatch("ab", ".*c"));
	}
}
