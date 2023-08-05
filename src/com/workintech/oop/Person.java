package com.workintech.oop;

//blueprrint =>taslak

public class Person {

    //instance variable- field - sınıf değişkeni ;
    String firstName; //instance variable;
    String lastName; //instance variable;
    int age; //instance variable;

    long identificationNumber; //instance variable;
    String hairColour; //instance variable;
    String job; //instance variable;
    String sex; //instance variable;
    boolean maritalStatus; //instance variable;


    public Person() {
        System.out.println("Person oluşturuldu");
    }

    //overloading
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, boolean maritalStatus, long identificationNumber, String job) {
        //Chaining
        this(firstName, lastName, age);
        this.maritalStatus = maritalStatus;
        this.identificationNumber = identificationNumber;
        this.job = job;
    }

    public String getFirstName(){
        return firstName;
    }
    public  String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public boolean isTeen(){
       if (age<19 && age>13) {
           return true;
       }
       return false;


    }



}
//constructor metod => sınıftan bşr ı-obje yaratıkdıgında çalışan ilk metottur.
    // initials edildiği an der ki bana constructorumu calıstır
  /*  public Person(){
        System.out.println("Ev oluşturuldu");
    }*/

    //Overloading-aşırı yükleme

    /*public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }*/
   /* public Person(int age, String firstName, String lastName) {
        //constructor chaning
        this(firstName,lastName);
        this.age=age;
    }*/

  /*  public Person(int age, String firstName, String  lastName, long identificationNumber, boolean maritalStatus) {
        this(age,firstName,lastName);
        this.identificationNumber = identificationNumber;
        this.maritalStatus = maritalStatus;
    }*/


