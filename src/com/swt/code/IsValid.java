package com.swt.code;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author swt
 * 将左括号压入栈
 * 判断出现的右括号，如果和他相近的左括号匹配则继续
 * 如果不匹配则直接返回false
 */
public class IsValid {
    private Map<Character,Character> map = new HashMap<>();
    public IsValid(){
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length();i++){
            char temp = s.charAt(i);
            // 判断是否为右括号
            if (map.containsKey(temp)){
                // 获取相对应的左括号
                char left = map.get(temp);
                // 判断栈顶元素为相对应的左括号
                char top = stack.isEmpty()?'#':stack.pop();
                // 如果不是返回false，如果是则继续判断
                if (left != top){
                    return false;
                }
            }else {
                stack.push(temp);
            }
        }
        return stack.isEmpty();
    }
}
