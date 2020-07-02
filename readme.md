### 1、求两数之和

#### 	（1）算法描述

```
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
```

#### 	（2）算法实现类位置

```
com.swt.code.SumTwoNumbers.java
```

### 2、整数反转

#### （1）算法描述

```
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
```

#### （2）算法实现类位置

```
com.swt.code.IntegerReverse.java
```

### 3、字符串转换整数

#### （1）算法描述

```
首先，该函数会根据需要丢弃无用的开头空格字符，直到寻找到第一个非空格的字符为止。接下来的转化规则如下：

    如果第一个非空字符为正或者负号时，则将该符号与之后面尽可能多的连续数字字符组合起来，形成一个有符号整数。
    假如第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成一个整数。
    该字符串在有效的整数部分之后也可能会存在多余的字符，那么这些字符可以被忽略，它们对函数不应该造成影响。

注意：假如该字符串中的第一个非空格字符不是一个有效整数字符、字符串为空或字符串仅包含空白字符时，则你的函数不需要进行转换，即无法进行有效转换。

在任何情况下，若函数不能进行有效的转换时，请返回 0 。
```

#### （2）算法实现类位置

```
com.swt.code.StringToInteger.java
```

### 4、判断回文数

#### （1）算法描述

```
判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
```

#### （2）算法实现类位置

```
com.swt.code.IsPalindrome.java
```

### 5、数字转为罗马数|罗马数转数字

#### （1）算法描述

```
字符          数值
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
```

#### （2）算法实现类位置

```
com.swt.code.IntToRoman.java
```

### 6、最长公共前缀

#### （1）算法描述

```
编写一个函数来查找字符串数组中的最长公共前缀。
如果不存在公共前缀，返回空字符串 ""
```

#### （2）算法实现类位置

```
com.swt.code.LongestCommonPrefix.java
```

### 7、三数之和

#### （1）算法描述

```
给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，
使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
```

#### （2）算法实现类位置

```
com.swt.code.ThreeSum.java
```

### 8、最接近的三数之和

#### （1）算法描述

```
给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，
使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
```

#### （2）算法实现类位置

```
com.swt.code.ThreeSumClose.java
```

### 9、电话号码的字母组合

#### （1）算法描述

```
给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
```

#### （2）算法实现类位置

```
com.swt.code.LetterCombinations.java
```

### 10、四数之和

#### （1）算法描述

```
给定一个包含 n 个整数的数组 nums 和一个目标值 target，判断 nums 中是否存在四个元素 a，b，c 和 d ，
使得 a + b + c + d 的值与 target 相等？找出所有满足条件且不重复的四元组。
```

#### （2）算法实现类位置

```
com.swt.code.FourSum.java
```

### 11、删除链表的第n个节点

#### （1）算法描述

```
给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
```

#### （2）算法实现类位置

```
com.swt.code.RemoveNthFromEnd.java
```

### 12、有效的括号

#### （1）算法描述

```
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
注意空字符串可被认为是有效字符串。
```

#### （2）算法实现类位置

```
com.swt.code.IsValid.java
```