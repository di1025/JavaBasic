package com.chendi.training.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BaseBallGame {

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
        List<String> scoreList = new ArrayList<String>(Arrays.asList("5","2","C","D","+"));
        List<String> score2List = new ArrayList<String>(Arrays.asList("5","-2","4","C","D","9","+","+"));
        BaseBallGame b = new BaseBallGame();
        System.out.println(b.points(scoreList));
        System.out.println(b.points(score2List));

    }



}

