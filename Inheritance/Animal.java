class Animal {
    String name;
    int age;

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

class Cat extends Animal {
    void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

class Bird extends Animal {
    void makeSound() {
        System.out.println("Bird says: Chirp!");
    }
}

class Main {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();
        a.makeSound();

        a = new Cat();
        a.makeSound();

        a = new Bird();
        a.makeSound();
    }
}
