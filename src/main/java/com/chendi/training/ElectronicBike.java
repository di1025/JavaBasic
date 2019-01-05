package com.chendi.training;

public class ElectronicBike extends Bike implements Compare<Integer> {
    public int speedLimit;

    public ElectronicBike(){}

    public void compareWith(Integer a, Integer b) {
        /**
         * if a=b returns 0; if a>b returns 1; if a<b returns -1;
         */
        if (a < b)
            System.out.println(a+ " is smaller than "+b+".");
        else if (a > b)
            System.out.println(a+ " is larger than "+b+".");
        else System.out.println("They are the same."); ;
    }

    ;

    public void setSpeedLimit(int milePerhr) {
        speedLimit=milePerhr;
        System.out.println("The limited speed of this electronic bike is : "+milePerhr);

    }

    ;

    public static void main (String [] args){
        ElectronicBike e = new ElectronicBike();
        e.compareWith(4,4);
        e.setSpeedLimit(3);
    }
}
