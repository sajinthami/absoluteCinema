// POLYMORPHISM IN JAVA



public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        animal1.soound();
        animal2.soound();


    }
}

class Animal{
    void soound(){
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal{
    void soound(){
        System.out.println("Dog makes a sound.");
    }
}

class Cat extends Animal{
    void soound(){
        System.out.println("Cat makes a sound.");
    }
}