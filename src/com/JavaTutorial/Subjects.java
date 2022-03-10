package com.JavaTutorial;

public class Subjects extends Student implements ICollege {
    String subId;
    String subName;
    String collegeName;

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public Subjects(String id, String sName, String name, int age, String address) {
        super(name,age,address);
        subId = id;
        subName = sName;
    }
    public void display(){
        System.out.println("College : "+ collegeName);
    }

    public void addCollege(String coll)
    {
        collegeName = coll;
    }
    public static void main(String[] args) {
        Subjects student = new Subjects("12","English","Linnet",25,"1234 Dublin, CA");

        System.out.println(student.toString());
        student.addCollege("Harvard University");
        student.display();
    }
}
