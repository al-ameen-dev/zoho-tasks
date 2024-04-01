class Vehicle {
    String name;
    int noOfWheels;
    String type;
    int noOfPistons;

    int weight;

    public Vehicle(String name, int noOfWheels, String type, int noOfPistons,int weight) {
        this.name = name;
        this.noOfWheels = noOfWheels;
        this.type = type;
        this.noOfPistons = noOfPistons;
        this.weight = weight;
    }
}

class Car extends Vehicle{
    int topSpeed;

    public Car(String name,int noOfWheels,String type,int noOfPistons,int weight,int topSpeed) {
        super(name, noOfWheels, type, noOfPistons, weight);
        this.topSpeed = topSpeed;
    }

    @Override
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

class Bike extends Vehicle{
    int topSpeed;

    public Bike(String name, int noOfWheels, String type, int noOfPistons, int weight,int topSpeed) {
        super(name, noOfWheels, type, noOfPistons, weight);
        this.topSpeed = topSpeed;
    }

    @Override
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
public class VehicleDemo{
    public static void main(String[] args) {
        Vehicle car = new Car("BMW",4,"Luxuary",8,2000,180);
        System.out.println(car);
        Vehicle bike = new Bike("Yamaha",2,"Sports Bike",2,120,150);
        System.out.println(bike);
    }
}
