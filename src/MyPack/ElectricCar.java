package MyPack;

/**
 * Created by makkhay on 1/12/18.
 */
public class ElectricCar implements ElectricVehicle {
    @Override
    public void speed() {
        System.out.println("speed up with an electric ");
    }

    @Override
    public void chargeBattery() {
        System.out.println("charge your battery ");
    }


}
