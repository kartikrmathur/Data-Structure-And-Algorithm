package OOPs.Inheritance;

class Animal {
    // field and method of the parent class
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
}

// inherit from Animal
class JerryTheMouse extends Animal{
    public void display(){
        System.out.println("My name is "+name);
    }
}

class Main{
    public static void main(String[] args) {
        // create an object of the subclass
        JerryTheMouse mouse = new JerryTheMouse();
        // access field of superclass
        mouse.name = "Jerry the mouse ";
        mouse.display();
        // call method of superclass
        // using object of subclass
        mouse.eat();
    }
}