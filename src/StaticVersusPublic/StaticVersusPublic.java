package StaticVersusPublic;

public class StaticVersusPublic {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        StaticVersusPublic.myStaticMethod(); // Call the static method

        StaticVersusPublic myObj = new StaticVersusPublic();// Create an object of Main
        myObj.myPublicMethod();// Call the public method on the object
    }
}
