package com.workintech.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person person1=new Person();  // memoryde gösterdiği alan referance ı

        //person1 yazığımız Person'ın instanceı- instancelar referansların görünebilir hali arasındaki fark o
        //object new Person() dediğimizde obje oluşacağını anlar. //JVM java merheal mechine
        person1.firstName="Buse";
        person1.lastName="Mutluoglu";
        person1.age=35;
        person1.sex="Woman";
        person1.job="Software Developer";
        person1.hairColour="Blonde";
        person1.identificationNumber=1111111111;
        person1.maritalStatus=true;
        Person person2=new Person();
        person2.maritalStatus=false;

        System.out.println("Firstname: " + person1.getFirstName());

        System.out.println("LastName: " + person1.getLastName());

        System.out.println("Age: " + person1.getAge());

    //pass by referance & pass by value;

        person2=person1; //herşeyleri eşitlenmiş olur ramdeki person2 yeri silinip person1 i gösterir oda

        System.out.println(person2.maritalStatus);




        //  int a=1;
        // int b=6;

        //a=b;
        // b=20;
        // System.out.println(a);
        // b=21;
        // System.out.println(a);
        Person person=new Person("Milan", "Milan", 1);

        System.out.println(person.age);
        System.out.println(person.sex);


        Wall wall = new Wall(4,5);

        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());

        Wall wall2 = new Wall(-4,-5);

        System.out.println("width= " + wall2.getWidth());

        System.out.println("height= " + wall2.getHeight());
    }
}