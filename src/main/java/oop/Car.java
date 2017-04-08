package oop;

/**
 * Created by Administrator on 2017/4/6 0006.
 */
public class Car extends Vehicle {

    public Car(String name, double speed, String color) {
        super(name, speed, color);
    }

    public void run() {
        System.out.println("car: " + getName() + " is running...");
    }

    public void stop() {
        System.out.println("car: " + getName() + " stopped.");
    }

    public static void main(String[] args) {
        Car car = new Car("Tom's car", 20d, "black");
        car.run();
        car.stop();
    }
}
