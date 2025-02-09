package model;

import enums.Color;
import enums.Sex;

public class Student {
    private String name;
    private int age;
    private Color color;
    private Sex sex;

    // Construtor
    public Student(String name, int age, Color color, Sex sex) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.sex = sex;
    }

    // Getters e Setters
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}

    public Color getColor() {return color;}
    public void setColor(Color color) {this.color = color;}

    public Sex getSex() {return sex;}
    public void setSex(Sex sex) {this.sex = sex;}

    // Métodos comportamentais
    public void eating(String food) {
        System.out.println(name + " está comendo " + food);
    }

    public void drinking(String drink) {
        System.out.println(name + " está bebendo " + drink);
    }

    public void running() {
        System.out.println(name + " está correndo.");
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", color=" + color + ", sex=" + sex + "}";
    }
}
