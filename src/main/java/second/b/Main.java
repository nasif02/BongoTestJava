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
public class Main {

    public static void main(String[] args) {

        Car car = new Car(0,0,100);
        car.start();
        car.gearUp();
        car.move();
        car.accelerate(Car.accFactorMedium);
        car.accelerate(Car.accFactorMedium);
        System.out.println(car.getDetails());
        car.gearUp();
        car.accelerate(Car.accFactorMedium);
        car.setGas(80);
        System.out.println(car.getDetails());
        car.stop();
        System.out.println(car.getDetails());

        System.out.println("---------------------");

        Plane plane = new Plane(0,10000,new Location(1.302555, 2.25456));
        plane.start();
        plane.move();
        plane.fly();
        plane.accelerate(Plane.accFactorHigh);
        plane.accelerate(Plane.accFactorHigh);
        System.out.println(plane.getDetails());
        plane.setGas(5000);
        plane.land();
        plane.stop();
        System.out.println(car.getDetails());


    }
}
