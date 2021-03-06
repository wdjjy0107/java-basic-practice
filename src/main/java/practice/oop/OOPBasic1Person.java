package practice.oop;

import pojo.Person;

public class OOPBasic1Person {

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstName = "Juyeong";
        person1.lastName = "Jeong";
        person1.age = 31;

        System.out.println("==== Details of Person1 ====");
        System.out.println(person1.firstName + " " + person1.lastName + "(" + person1.age + ")");
        System.out.println();

        Person person2 = new Person();
        person2.firstName = "Matt";
        person2.lastName = "Lee";
        person2.age = 32;

        System.out.println("==== Details of Person2 ====");
        System.out.println(person2.firstName + " " + person2.lastName + "(" + person2.age + ")");
        System.out.println();

        if (person1.age > person2.age) {
            System.out.println("Person1 is older");
        }
        else if (person2.age > person1.age) {
            System.out.println("Person2 is older");
        }
        else {
            System.out.println("Person1 and Person2 are at the same age");
        }
    }

}
