
/*
In Vehicle hierarchy, add methods like start and stop in Vehicle and override them in Child classes.
 */
class Vehicle {
    String name;
    int noOfWheels;
    String type;
    int noOfPistons;
    boolean isRunning;
    int weight;

    public Vehicle(String name, int noOfWheels, String type, int noOfPistons, int weight) {
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.type = type;
        this.noOfPistons = noOfPistons;
        this.weight = weight;
    }

    public void stop() {
        if(isRunning){
            isRunning = false;
            System.out.println("vehicle is stoped!");
        }else{
            System.out.println("vehicle is already stopped!");
        }
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("vehicle is running!");
        } else {
            System.out.println("vehicle is already running!");
        }
    }
}

class Car extends Vehicle {
    int topSpeed;

    public Car(String name, int noOfWheels, String type, int noOfPistons, int weight, int topSpeed) {
        super(name, noOfWheels, type, noOfPistons, weight);
        this.topSpeed = topSpeed;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Car is running!");
        } else {
            System.out.println("Car is already running!");
        }
    }
    public void stop(){
        if(isRunning){
            isRunning = false;
            System.out.println("Car is stoped!");
        }else{
            System.out.println("Car is already stopped!");
        }
    }

    public String toString() {
        return "Car{" +
                "topSpeed=" + topSpeed +
                " km/hr, name='" + name + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", type='" + type + '\'' +
                ", noOfPistons=" + noOfPistons +
                ", weight=" + weight +
                " kg}";
    }
}

class Bike extends Vehicle {
    int topSpeed;

    public Bike(String name, int noOfWheels, String type, int noOfPistons, int weight, int topSpeed) {
        super(name, noOfWheels, type, noOfPistons, weight);
        this.topSpeed = topSpeed;
    }

    public void start() {
        if (!isRunning) {
            isRunning = true;
            System.out.println("Bike is running!");
        } else {
            System.out.println("Bike is already running!");
        }
    }
    public void stop(){
        if(isRunning){
            isRunning = false;
            System.out.println("Bike is stoped!");
        }else{
            System.out.println("Bike is already stopped!");
        }
    }
    public String toString() {
        return "Bike{" +
                "topSpeed=" + topSpeed +
                " km/hr, name='" + name + '\'' +
                ", noOfWheels=" + noOfWheels +
                ", type='" + type + '\'' +
                ", noOfPistons=" + noOfPistons +
                ", weight=" + weight +
                " kg}";
    }
}

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW", 4, "Luxuary", 8, 2000, 180);
        System.out.println(car);
        car.start();
        car.stop();
        car.stop();
        Vehicle bike = new Bike("Yamaha", 2, "Sports Bike", 2, 120, 150);
        System.out.println(bike);
        bike.start();
        bike.stop();
        bike.stop();
    }
}
