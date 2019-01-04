package com.chendi.training;

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
    public static void main(String[] args) {
        System.out.println("Hello! This is my new bike!");
        Bike firstBike = new Bike("Round", 2, "Round");
        firstBike.move();
        Bike.getPedals();

        //    Motorcycle firstMotor = new Motorcycle("round",  );
        System.out.println(firstBike.getWheelShape());
        System.out.println(firstBike.getWheelNum());
        firstBike.getBikeInfo();
    }


}

