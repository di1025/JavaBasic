package com.chendi.training;

public class ElectronicBike extends Bike implements Compare<Integer> {
    public int speedLimit;

    public int compareWith(Integer a, Integer b) {
        /**
         * if a=b returns 0; if a>b returns 1; if a<b returns -1;
         */
        if (a < b)
            return -1;
        else if (a > b)
            return 1;
        else return 0;
    }

    ;

    public void setSpeedLimit(int milePerhr) {
        speedLimit=milePerhr;
        System.out.println("The limited speed of this electronic bike is : "+milePerhr);

    }

    ;
}
