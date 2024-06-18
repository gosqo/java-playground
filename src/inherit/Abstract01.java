package inherit;

import java.util.Arrays;

abstract class Vehicle {
    private String name;
    abstract public String getName(String val);

    public String getName() {
        return "Vehicle name: " + name;
    }

    public void setName(String val) {
        name = val;
    }
}

class Car extends Vehicle {
    public Car(String val) {
        setName(val);
    }

    @Override
    public String getName(String val) {
        return "Car name: " + val;
    }

    public String getName(byte[] val) {
        return "Car name: " + Arrays.toString(val);
    }
}

public class Abstract01 {
    public static void main(String[] args) {
        Vehicle obj = new Car("Spark");
        Car obj2 = new Car("Mustang");

        System.out.println(obj instanceof Vehicle);
        System.out.println(obj instanceof Car);
        System.out.println(obj2 instanceof Vehicle);
        System.out.println(obj2 instanceof Car);

        System.out.println(obj.getName());
        System.out.println(obj.getName("Conic"));
        System.out.println(obj2.getName());
        System.out.println(obj2.getName("Segh"));
    }
}
