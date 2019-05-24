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
public interface IVehicle {

    void start();
    void stop();
    void move();
    void applyBreak(int decrement);
    void accelerate(int increment);
    boolean hasGas();
    String getDetails();

}
