package com.chendi.training.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class BracketTest {
    // Hash table that takes care of the mappings.
    private HashMap<Character, Character> mappings;

    // Initialize hash map with mappings. This simply makes the code easier to read.
    public BracketTest() {
        this.mappings = new HashMap<Character, Character>();
        this.mappings.put(')', '(');
        this.mappings.put('}', '{');
        this.mappings.put(']', '[');
    }

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // If the current character is a closing bracket.
            if (this.mappings.containsKey(c)) {

                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();

                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != this.mappings.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }

        // If the stack still contains elements, then it is an invalid expression.
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String passString = "{x{}x1}";
        String secondPassString = "()[]{}";
        String onePassString = "()()(";
        BracketTest bt = new BracketTest();
       System.out.println(bt.isValid(onePassString));
       System.out.println(vaild(onePassString));
    }

    public static boolean vaild(String input) {

        HashMap<Character,Character> map = new HashMap<Character,Character>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (map.containsKey(c)) {
                    char topEle = stack.empty() ? '#':stack.pop();
                    if(topEle!=map.get(c)){
                        return false;
                }
            } else {
                stack.push(c);

            }
        }
        return stack.isEmpty();
    }

    public static boolean oneValid(String input){
        int count=0;
        int i=0;


            while(count>=0&& i<=input.length()){
                char c = input.charAt(i);
                if(c=='<') count++;
                if(c=='>') count--;
            }
            if(count==0) return true;
            else return false;
        }
    }
