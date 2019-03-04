package com.chendi.training.algorithms;



import com.sun.tools.javac.util.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

public class SkyLine {


    public static int maxIncreaseKeepingSkyline(int[][] grid){
        int gridLength=grid.length;
        int[] rMaxes=new int[gridLength];
        int[] cMaxes=new int[gridLength];

        for(int r=0;r<gridLength;r++)
            for(int c=0;c<gridLength;c++){
                rMaxes[r]= Math.max(rMaxes[r],grid[r][c]);
                cMaxes[c]=Math.max(cMaxes[c],grid[r][c]);
            }

            int answer =0;
        for(int r=0;r<gridLength;r++)
            for(int c=0;c<gridLength;c++){
                answer+=Math.min(rMaxes[r],cMaxes[c])-grid[r][c];
            }
            return answer;
    }



    public static void main(String []args){
        int[][] num={{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int[] nums ={4,3,2,7,8,2,3,1};
        SkyLine.maxIncreaseKeepingSkyline(num);
    }

}
