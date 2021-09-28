package org.example.learn.jdk;

public class ClassesType {

    public static void main(String[] args) {
        Animal a  = new Animal();
    }
}

class Animal {
    private String name;
    public Animal() {
        System.out.println("Non");

        this.name = "some";
    }

    public Animal(String name) {
        System.out.println("One");
        this.name = name;
    }


}
