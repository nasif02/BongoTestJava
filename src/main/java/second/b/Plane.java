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
public class Plane implements IPlane{

    public static final int accFactorLow = 1;
    public static final int accFactorMedium = 5;
    public static final int accFactorHigh = 10;

    public static final int maxSpeed = 500;


    private int speed;
    private int gas;
    private Location location;

    public Plane() {
    }

    public Plane(int speed, int gas, Location location) {
        this.speed = speed;
        this.gas = gas;
        this.location = location;
    }

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    @Override
    public void land() {
        System.out.println("Plane is landing");
    }

    @Override
    public double getAltitude() {

        //assume altitude can be calculated from gps and this is a demo calculation
        return location.getLat() + location.getLon();
    }



    @Override
    public void start() {
        System.out.println("Plane start");
        speed=0;
    }

    @Override
    public void stop() {
        System.out.println("Plane stop");
        speed=0;
    }

    @Override
    public void move() {

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
        return "Plane{" +
                "speed=" + speed +
                ", gas=" + gas +
                ", location=" + location +
                '}';
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGas() {
        return gas;
    }

    public void setGas(int gas) {
        this.gas = gas;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
