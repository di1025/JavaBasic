package com.chendi.training.algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ValidBracket {



    public boolean isValid(String s) {

        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
//        mappings.put('<','>');
//        mappings.put('{','}');
//        mappings.put('[',']');


        mappings.put('>','<');
        mappings.put('}','{');
        mappings.put(']','[');

        Stack<Character> stack = new Stack<Character>();


        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (mappings.containsValue(c)){
                stack.push(c);
            }
            else if(mappings.containsKey(c)&&stack!=null){
                stack.pop();
            }
            else return false;
        }
        return stack.isEmpty();
    }



}
