package MethodsAndStuffs;

public class InheritanceClass {
    public static void main(String[] args) {
        animal d1 = new dog();
//        d1.breed="Husky";
        d1.age=8;
        d1.color="White";
        d1.sleep();
        cat c1 = new generic(); //Creating object of parent class pointing towards child class
        c1.someName(); //calling abstract method of child class
        c1.meaw(); //calling abstract class method using child

    }
}
class animal{
    int age;
    String color;
    public void eat(){
        System.out.println("Eating method from animal");
    }
    public void sleep(){
        System.out.println("Sleeping method from animal");
    }
}

class dog extends animal{
    String breed;
    public void eat(){
        System.out.println("Eating method from dog");
    }
    public void bark(){
        System.out.println("Barking method from dog");
    }
}

abstract class cat{
    String gender;
    public void meaw(){
        System.out.println("Cat from abstract class");
    }
    abstract public void someName(); //abstract method must override from child class
}

class generic extends cat{
    @Override
    public void someName(){
        System.out.println("Abstract method overriding");
    }
}


