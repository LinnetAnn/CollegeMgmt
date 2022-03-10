package com.JavaTutorial;

public abstract class Student {

    String name;
    int age;
    String address;
    public Student(String n,int age,String address){

        name = n;
        this.age = age;
        this.address = address;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age= age;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getAddress(){
        return address;
    }
    public String toString(){
        return "Name : " + this.name + "\nAge : "+ this.age + "\nAddress : " + this.address;
    }
   public abstract void display();

}
