package org.example;

public class Cat {
    private String name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        setName(name);
        setAge(age);
        setWeight(weight);
    }
public Cat(){}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Името не може да е празно.");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age > 0) {
        this.age = age;
    } else {
            System.out.println("Невалидна възраст.");
        }
    }
    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        if (weight > 0) {
        this.weight = weight;
    } else {
            System.out.println("Теглото трябва да е > 0.");}
    }




}
