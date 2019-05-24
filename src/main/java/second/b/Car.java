package second.b;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 5/25/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : second.b
 * Comment  :
 */
public class Car implements ICar {

    public static final int accFactorLow = 1;
    public static final int accFactorMedium = 3;
    public static final int accFactorHigh = 5;

    public static final int maxSpeed = 200;
    public static final int maxGear = 5;

    private int speed;
    private int gear;
    private int gas;

    public Car() {
    }

    public Car(int speed, int gear, int gas) {
        this.speed = speed;
        this.gear = gear;
        this.gas = gas;
    }

    @Override
    public void gearUp() {

        if(gear<maxGear) gear++;
    }

    @Override
    public void gearDown() {
        if(gear>0) gear--;
    }

    @Override
    public void start() {
        System.out.println("Car Start");
        gear=0;
        speed=0;
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
        gear=0;
        speed=0;
    }

    @Override
    public void move() {
        gear=1;
        speed=1;
    }

    @Override
    public void applyBreak(int decrement) {

        speed-=decrement;
        if(speed<0) stop();
    }

    @Override
    public void accelerate(int increment) {
        speed+=increment;
        if(speed>maxSpeed) speed = maxSpeed;
    }

    @Override
    public boolean hasGas() {

        if(gas>0) return true;

        return false;
    }

    @Override
    public String getDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", gear=" + gear +
                ", gas=" + gas +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}
