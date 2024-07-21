package StaticVersusPublic;

public class Car {
    public void fullThrottel(){
        System.out.println("The car is going as fast as it can!");

    }
    public void speed (int maxSpeed){
        System.out.println("Max speed is: " + maxSpeed);
    }

    public static void main(String[] args) {
        Car car = new Car(); // Create a myCar object
        car.fullThrottel();  // Call the fullThrottle() method
        car.speed(250); // Call the speed() method
    }
}
