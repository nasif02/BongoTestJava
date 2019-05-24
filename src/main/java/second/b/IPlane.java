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
public interface IPlane extends IVehicle {

    void fly();
    void land();
    double getAltitude();

}
