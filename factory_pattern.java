interface Vehicle {
    void create();
}

class Car implements Vehicle {
    @Override
    public void create() {
        System.out.println("Car created.");
    }
}

class Bike implements Vehicle {
    @Override
    public void create() {
        System.out.println("Bike created.");
    }
}

class VehicleFactory {
    public Vehicle createVehicle(String type) {
        if (type.equalsIgnoreCase("car")) {
            return new Car();
        } else if (type.equalsIgnoreCase("bike")) {
            return new Bike();
        } else {
            throw new IllegalArgumentException("Unknown vehicle type.");
        }
    }
}

public class FactoryPatternDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new VehicleFactory();

        Vehicle vehicle1 = factory.createVehicle("car");
        vehicle1.create();

        Vehicle vehicle2 = factory.createVehicle("bike");
        vehicle2.create();
    }
}
