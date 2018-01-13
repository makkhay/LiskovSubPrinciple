package MyPack;

/**
 * Created by makkhay on 1/12/18.
 */
public class Car implements NormalVehicle {
    @Override
    public void speed() {
        System.out.println("speed up the car");
    }

    @Override
    public void addFuel() {
        System.out.println("adding fuel");
    }
}
