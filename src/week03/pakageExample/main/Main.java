package week03.pakageExample.main;


import week03.pakageExample.pk1.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        week03.pakageExample.pk2.Car pkCar = new week03.pakageExample.pk2.Car();
        car.horn();
        pkCar.horn();
    }
}
