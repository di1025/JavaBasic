package com.chendi.training;

import java.util.*;

public class Bike {
    public String wheelShape;
    public int wheelNum;
    public String seatShape;

    //constructor has 3 attributes
    public Bike(String wShape, int num, String sShape) {
        this.wheelNum = num;
        this.wheelShape = wShape;
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

//    @Override
//    public int hashCode(){
//        int result = wheelShape.hashCode();
//        result=31*result+seatShape.hashCode();
//        result=31*result+wheelNum;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bike bike = (Bike) o;
        return wheelNum == bike.wheelNum &&
                Objects.equals(wheelShape, bike.wheelShape);
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheelShape, wheelNum);
    }



//
//
//    public boolean equals(Bike bike){
//        if(bike==null)return false;
//        if(this==bike)return true;
//        if((bike instanceof Bike)&&(bike.hashCode()==this.hashCode())) return true;
//        else return false;
//    }

    public static void main(String[] args) {
        Bike firstBike = new Bike("Round", 2, "Round");
        Bike firstBike1 = new Bike("Round", 1, "Round");
        Bike secBike = new Bike("Round", 2, "Square");
        Bike secBike1 = new Bike("Square", 2, "Square");
        Bike thirdBike = new Bike("Round", 3, "Round");
        Bike thirdBike1 = new Bike("Round", 3, "Square");
        System.out.println(firstBike.equals(firstBike1));
        System.out.println(secBike.equals(secBike1));
        System.out.println(thirdBike.equals(thirdBike1));
        System.out.println(firstBike.hashCode());
        System.out.println(firstBike1.hashCode());
        System.out.println(secBike.hashCode());
        System.out.println(secBike1.hashCode());
        System.out.println(thirdBike.hashCode());
        System.out.println(thirdBike1.hashCode());
        System.out.println("Hello! This is my new bike!");

        Map<Bike,String> bMap = new HashMap<>();
        bMap.put(firstBike,"firstBike");
        bMap.put(firstBike1,"firstBike1");
        bMap.put(secBike,"secBike");
        bMap.put(secBike1,"secBike1");
        bMap.put(thirdBike,"thirdBike");
        bMap.put(thirdBike,"thirdBike1");

        for (Map.Entry<Bike,String> entry:bMap.entrySet()){
            System.out.println(entry.getValue());
        }
//
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

