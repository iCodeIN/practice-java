package com.joshua.Chapter01;

/**
 * Created by Joshua on 2017-05-18.
 * 같은 문자가 연속으로 반복될 경우, 그 횟수를 사용해 문자열을 압축하는 메서드 구현
 */
public class chap1_5 {

    public static String convert(String input) {
        StringBuilder result = new StringBuilder();
        char[] inputArray = input.toCharArray();
        int count = 1;
        result.append(inputArray[0]);

        for(int i = 1; i < inputArray.length; i++) {
            if(inputArray[i-1] == inputArray[i]) {
                count++;
            } else {
                result.append(count);
                result.append(inputArray[i]);
                count = 1;
            }
        }
        result.append(count);

        return (result.length() > input.length()) ? input : result.toString();
    }

//    public static void main(String[] args) {
//        String inputString = "aaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffffaaaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbcccccccccccccccccddddddddddddddddddeeeeeeeeeeeeeeeeeeeeeeeeeeffffffffffffffffffff";
//        String inputString2 = "abcd";
//
//        System.out.println(convert(inputString));
//        System.out.println(convert(inputString2));
//    }
}