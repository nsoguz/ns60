public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("porsche");
        car.setModel("Carrera");
        car.setColor("Red");
        car.setDoors(4);
        car.setConvertible(true);
        System.out.println("Make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
