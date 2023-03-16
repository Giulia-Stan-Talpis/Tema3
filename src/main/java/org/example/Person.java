package org.example;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private int age;
    private String name;
     ArrayList<Hobby> hobbyList = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Returns a Person object which has a name, an age and an empty Hobby List.
     * @param  name  the name of a Person we want to create
     * @param  age the age of the Person we want to create
     */
    public Person(String name, int age) {
     this.name = name;
     this.age = age;
 }
@Override
public String toString(){
        return "" + this.getName() + ", " + this.getAge();
}
    public boolean equals(Person pers) { return this.name.equals(pers.name) && this.age == pers.age;
     }
    /**
     * It's a void method that sets the setHobbyList attribute
     * @param someHobbies a list of Hobbies
     */
     public void setHobbyList(ArrayList<Hobby> someHobbies){
        this.hobbyList = someHobbies;
     }
    /**
     * It's a void method which takes no parameters that prints the AddressList for
     * each Hobby of this Person
     */
     public void printHobbyAddressList(){
        for(Hobby hobby : hobbyList){
          hobby.printAddressList();
        }
     }
     public ArrayList<Hobby> getHobbyList(){
        return this.hobbyList;
     }
}

