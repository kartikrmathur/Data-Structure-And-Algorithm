package StaticVersusPublic;

public class Car1User {
    public static void main(String[] args) {
        Car1 car1 = new Car1();// Create a myCar object
        car1.speed(390);  // Call the fullThrottle() method
        car1.fullThrottle(); // Call the speed() method
    }
}
