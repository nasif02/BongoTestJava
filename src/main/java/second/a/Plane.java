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
public class Plane implements Vehicle {

    private int speed;
    private int altitude;

    private int numOfWheels;
    private int numOfPassengers;
    private int gas;

    public Plane() {
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


    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }
}
