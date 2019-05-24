package second.a;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 5/25/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : second
 * Comment  :
 */
public class Car implements Vehicle {

    private int speed;
    private int gear;

    private int numOfWheels;
    private int numOfPassengers;
    private int gas;

    public Car() {
    }


    @Override
    public void setNumOfWheels(int wheels) {

        this.numOfWheels = wheels;

    }

    @Override
    public void setNumOfPassengers(int numOfPassengers) {
        this.numOfPassengers = numOfPassengers;
    }

    @Override
    public boolean hasGas() {

        if(gas>0) return true;

        return false;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public int getNumOfPassengers() {
        return numOfPassengers;
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
