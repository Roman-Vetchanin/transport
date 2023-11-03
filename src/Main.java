public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW", 4);
        Car car2 = new Car("Audi", 4);


        Truck truck = new Truck("Renault",6);
        Truck truck2 = new Truck("Mercedes", 8);


        Bicycle bicycle = new Bicycle("Specialized",2);
        Bicycle bicycle2 = new Bicycle("GT", 2);



        car.check();
        System.out.println(" ");
        car2.check();
        System.out.println(" ");
        bicycle.check();
        System.out.println(" ");
        bicycle2.check();
        System.out.println(" ");
        truck.check();
        System.out.println(" ");
        truck2.check();
    }
}