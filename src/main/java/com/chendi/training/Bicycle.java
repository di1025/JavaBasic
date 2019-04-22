package com.chendi.training;

public class Bicycle extends Bike {
    public int pedalNum;

    public Bicycle(String wShape,
                   int num,
                   String sShape,
                   int pNum) {

        super(wShape, num, sShape);
        pedalNum = pNum;
    }

    public void getBicyclePedalNum() {
        System.out.println("This bicycle has " + this.pedalNum + " pedal.");
    }

    public static void speedLimit(){
        System.out.println("The speed limitation is 45 miles/hour");
    }

    public int impossible(){
        return this.wheelNum+1;
    }

    public static void main(String [] args){
         Bicycle firstBicycle = new Bicycle("Round",2,"Round",2);
         firstBicycle.getBicyclePedalNum();
         Bicycle.speedLimit();
         System.out.println("The bicycle cannot have "+firstBicycle.impossible()+" wheels");
     }
}
