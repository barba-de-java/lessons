package lesson18;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        int age = 2;
        String name = "Dog";
        Dog dog = new Dog(name, age);
        System.out.println(dog.getAge());
    }
}

class Dog {
    private String name;
    private int age;
    private LocalDateTime created;

    public Dog(String name, int age) {
        setName(name);
        this.age = age;
        created = LocalDateTime.now();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}