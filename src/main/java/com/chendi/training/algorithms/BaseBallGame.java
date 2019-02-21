package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BaseBallGame {
    public static List setup() {
        List<String> testdata = new ArrayList<String>(Arrays.asList("5", "2", "C", "D", "+"));
     //   List<String> score2List = new ArrayList<String>(Arrays.asList("5", "-2", "4", "C", "D", "9", "+", "+"));
        return testdata;
    }
    List<String> testdata = new ArrayList<String>(Arrays.asList("5", "2", "C", "D", "+"));

    public int points(List<String> scoreList) {
        Stack<Integer> scorePool = new Stack();
        int sum = 0;
        for (String s : scoreList) {
            if (s.equals("+")) {
                int lastRound = scorePool.pop();
                int lastTwoRound = scorePool.peek();
                int thisRound = lastRound+lastTwoRound;
                scorePool.push(lastRound);
                scorePool.push(thisRound);
                sum+=thisRound;
            }
            else if (s.equals("D")){
                int lastRound = scorePool.peek();
                int thisRound = lastRound*2;
                scorePool.push(thisRound);
                sum+=thisRound;
            }
            else if (s.equals("C")){
                int lastRound = scorePool.peek();
                scorePool.pop();
                sum-=lastRound;
            }
            else {scorePool.push(Integer.valueOf(s));
                int thisRound= Integer.valueOf(s);
                sum+=thisRound;
            }
        }

//        int totalScore = 0;
//        for (int score : scorePool) {
//            totalScore += score;
//        }
//        return totalScore;
        return sum;
    }

    public static void main(String []args){
        BaseBallGame b = new BaseBallGame();
        System.out.println(b.countScore(BaseBallGame.setup()));
        System.out.println(b.countScore(new ArrayList<String>(Arrays.asList("5", "2", "C", "D", "+"))));

//        System.out.println(b.countScore(score2List));

    }

    public int countScore(List<String> scorelist){
        Stack<Integer> scoreStack = new Stack<>();
        for(String s:scorelist){

            switch (s){
                case "+" :
                   int top= scoreStack.pop();
                   int lastTop=scoreStack.peek();
                   int thisRound = top+lastTop;
                   scoreStack.push(top);
                   scoreStack.push(thisRound);
                   break;

                case "C":
                    scoreStack.pop();
                    break;

                case "D":
                    int score = scoreStack.peek()*2;
                    scoreStack.push(score);
                    break;

                default:
                    scoreStack.push(Integer.valueOf(s));
                    break;
                }
        }
        int total = 0;
        for( int i:scoreStack){
        total+=i;}

        return total;
    }

    public int calPoints(String[] ops) {
        Stack<Integer> scoreStack= new Stack();
        for (String n:ops){
            if(n=="+"){
                int lastRound=scoreStack.pop();
                int lastTwoRound=scoreStack.peek();
                int thisRound=lastRound+lastTwoRound;
                scoreStack.push(lastRound);
                scoreStack.push(thisRound);
            }
            else if(n=="D"){
                int lastRound = scoreStack.peek();
                int thisRound = lastRound*2;
                scoreStack.push(thisRound);
            }
            else if(n=="C"){
                scoreStack.pop();
            }
            else scoreStack.push(Integer.valueOf(n));
        }

        int total=0;
        for(int s: scoreStack){
            total+=s;
        }
        return total;
    }
}

