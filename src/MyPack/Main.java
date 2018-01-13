package MyPack;


/**
 * Liskov Substitution principle
 *
 * so what is Liskov?
 * - it is to create a class hiearchies during the application devleoplement
 * For example, we extend some classes creating some derived classes
 * - Child classes should never break the parent class type defination
 *
 *
 *
 *
 *
 */



public class Main {

    public static void main(String[] args) {
	// write your code here
        ElectricVehicle car = new ElectricCar();
        car.speed();
        car.chargeBattery();



    }
}
