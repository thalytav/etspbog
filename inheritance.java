// Kelas induk: Vehicle
public class Vehicle {
    public String brand;
    public String model;
    public String fuelType;

    public void start() {
        System.out.println("Vehicle is starting");
    }

    public void stop() {
        System.out.println("Vehicle is stopping");
    }

    public void info() {
        System.out.println(brand + " " + model + " runs on " + fuelType);
    }
}

// Kelas turunan: Car
public class Car extends Vehicle {
    public int seats;

    // Overriding metode start
    @Override
    public void start() {
        System.out.println(brand + " " + model + " car is starting with a roar");
    }

    // Overriding metode info
    @Override
    public void info() {
        System.out.println(brand + " " + model + " car with " + seats + " seats runs on " + fuelType);
    }
}

// Kelas turunan: Bicycle
public class Bicycle extends Vehicle {
    public String typeBicycle;

    // Overriding metode start
    @Override
    public void start() {
        System.out.println(brand + " " + model + " bicycle is ready to pedal");
    }

    // Overriding metode info
    @Override
    public void info() {
        System.out.println(brand + " " + model + " bicycle of type " + typeBicycle);
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Objek dari kelas Car
        Car car = new Car();
        car.brand = "Toyota";
        car.model = "Corolla";
        car.fuelType = "Petrol";
        car.seats = 5;

        // Objek dari kelas Bicycle
        Bicycle bicycle = new Bicycle();
        bicycle.brand = "Giant";
        bicycle.model = "Escape 3";
        bicycle.typeBicycle = "Road Bike";

        // Menampilkan informasi dan tindakan masing-masing kendaraan
        car.info();  // Output: Toyota Corolla car with 5 seats runs on Petrol
        car.start();  // Output: Toyota Corolla car is starting with a roar

        bicycle.info();  // Output: Giant Escape 3 bicycle of type Road Bike
        bicycle.start();  // Output: Giant Escape 3 bicycle is ready to pedal
    }
}
