import entity.Car;

public class main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.drive(Car.USE_DAY.MONDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());

        System.out.println(car.drive(Car.USE_DAY.TUESDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());

        System.out.println(car.drive(Car.USE_DAY.WEDNESDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());

        System.out.println(car.drive(Car.USE_DAY.THURSDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());

        System.out.println(car.drive(Car.USE_DAY.FRIDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());

        System.out.println(car.drive(Car.USE_DAY.MONDAY));
        System.out.println(car.getWeaponsActivated());
        System.out.println(car.getCamouflageActivated());
    }
}
