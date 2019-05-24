package second.a;

/**
 * Copyright 2019 (C) Xplo
 * <p>
 * Created  : 5/25/2019
 * Author   : Xplo
 * Version  : 1.0
 * Desc     : second.a
 * Comment  :
 */
public class Main {

    public static void main(String[] args) {


        //car
        Car car = new Car();
        car.setGas(10);
        car.setSpeed(100);
        car.setGear(4);
        System.out.println(car.hasGas());
        System.out.println(car.getGear());

        //plane
        Plane plane = new Plane();
        plane.setGas(0);
        plane.setSpeed(100);
        plane.setAltitude(200);
        System.out.println(plane.hasGas());
        System.out.println(plane.getAltitude());




    }
}
