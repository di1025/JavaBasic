package com.chendi.training;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Bike {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    //constructor has 3 attributes
    public Bike(String wShape, int num, String sShape) {
        this.wheelShape = wShape;
        this.wheelNum = num;
        this.seatShape = sShape;
    }

    public Bike(){}

    public void move(){
        System.out.println("5 mile/hours");
    }

    public static void getPedals(){
        System.out.println("2");
    }


   //method
    public String getWheelShape() {
        return this.wheelShape;
    }



    public int getWheelNum() {
        return this.wheelNum;
    }

    public String getSeatShape() {
        return this.seatShape;
    }

    public void getBikeInfo() {
        System.out.println("This bike has " + this.wheelNum + " wheels and the seat shape is " + this.seatShape + ".");
    }

    @Override
    public int hashCode(){
        int result = wheelShape.hashCode();
        result=31*result+seatShape.hashCode();
        result=31*result+wheelNum;
        return result;
    }


    public boolean equals(Bike bike){
        if(bike==null)return false;
        if(this==bike)return true;
        if((bike instanceof Bike)&&(bike.hashCode()==this.hashCode())) return true;
        else return false;
    }

    public static void main(String[] args) {
        Bike firstBike = new Bike("Round", 2, "Round");
        Bike secBike = new Bike("Round", 2, "Round");
        Bike thirdBike = new Bike("Round", 3, "Round");
        System.out.println(firstBike.equals(secBike));
        System.out.println(firstBike.equals(thirdBike));
        System.out.println(firstBike.hashCode());
        System.out.println(secBike.hashCode());
        System.out.println(thirdBike.hashCode());

        System.out.println("Hello! This is my new bike!");

        Map<Bike,String> bMap = new HashMap<>();
        bMap.put(firstBike,"test");
        bMap.put(secBike,"test");
        bMap.put(thirdBike,"test");

//        for (Map.Entry<Bike,String> entry:bMap.entrySet()){
//            System.out.println(entry.hashCode());
//        }

//        Set<Bike> bikeHashSet = new HashSet<>();
//        bikeHashSet.add(firstBike);
//        bikeHashSet.add(secBike);
//        bikeHashSet.add(thirdBike);
//        for (Bike b:bikeHashSet){
//            System.out.println(b.hashCode());
//        }

//        firstBike.move();
//        Bike.getPedals();
//
//        //    Motorcycle firstMotor = new Motorcycle("round",  );
//        System.out.println(firstBike.getWheelShape());
//        System.out.println(firstBike.getWheelNum());
//        firstBike.getBikeInfo();


    }


}

