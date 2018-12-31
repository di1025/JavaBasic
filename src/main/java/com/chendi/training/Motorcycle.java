package com.chendi.training;

public class Motorcycle extends Bike {
    public int pedalNum;
    public int gasTank;
    public String motor;

    public Motorcycle(
            String wShape,
            int num,
            String sShape,
            int motorPetalNum,
            int motorGasTank,
            String motorBrand) {
        super(wShape, num, sShape);
        pedalNum = motorPetalNum;
        gasTank = motorGasTank;
        motor = motorBrand;
    }

    public void color(String col) {
        System.out.println("This motor is " + col);
    }

    public String getMotor() {
        return this.motor;
    }

    public void getMotorInfo() {
        System.out.println("This motorcycle has a " + this.gasTank + "gallon gas tank.");
    }

    public static void getMotorWheelNum(){
        System.out.println("2");
    }
    public void lagerTank(int increment){ this.gasTank = gasTank+ increment; }


    public static void main(String []args){
        Motorcycle firstMotor = new Motorcycle("round",2,"Triangle",2,25,"YAMAHA");
        firstMotor.color("Red");
        System.out.println("This motor brand is "+firstMotor.getMotor());
        Motorcycle.getMotorWheelNum();
    }

}
