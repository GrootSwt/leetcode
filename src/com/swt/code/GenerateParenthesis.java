package com.swt.code;

import java.util.ArrayList;
import java.util.List;

/**
 * @author swt
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        char[] current = new char[2 * n];
        generateAll(current, 0, result);
        return result;
    }

    public void generateAll(char[] current, int i, List<String> result) {
        if (i == current.length) {
            if (validate(current)) {
                result.add(new String(current));
            }
        } else {
            current[i] = '(';
            generateAll(current, i + 1, result);
            current[i] = ')';
            generateAll(current, i + 1, result);
        }
    }

    public boolean validate(char[] current) {
        int flag = 0;
        for (char temp :
                current) {
            if (temp == '(') {
                flag++;
            } else {
                flag--;
            }
            if (flag < 0) {
                return false;
            }
        }

        if (flag == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        GenerateParenthesis generateParenthesis = new GenerateParenthesis();
        List<String> result = generateParenthesis.generateParenthesis(3);
        for (String s :
                result) {
            System.out.println(s);
        }
    }
}
