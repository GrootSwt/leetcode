/**
 * 
 */
package com.swt.code;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 孙文涛
 */
public class LetterCombinations {
	Map<String, String> map = new HashMap<>();
	List<String> list = new ArrayList<>();

	public void backtrack(String combation, String nextDigits) {
		if (nextDigits.length() == 0) {
			list.add(combation);
		} else {
			String digit = nextDigits.substring(0, 1);
			String letters = map.get(digit);
			for (int i = 0; i < letters.length(); i++) {
				String letter = map.get(digit).substring(i, i + 1);
				backtrack(combation + letter, nextDigits.substring(1));
			}
		}
	}

	public List<String> letterCombinations(String digits) {
		map.put("2", "abc");
		map.put("3", "def");
		map.put("4", "ghi");
		map.put("5", "jkl");
		map.put("6", "mno");
		map.put("7", "pqrs");
		map.put("8", "tuv");
		map.put("9", "wxyz");

		if (digits.length() != 0)
			backtrack("", digits);
		return list;
	}

	public static void main(String[] args) {
		LetterCombinations letterCombinations = new LetterCombinations();
		List<String> result = letterCombinations.letterCombinations("234");
		System.out.println(result);
	}
}
