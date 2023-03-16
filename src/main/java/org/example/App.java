package org.example;

import java.util.*;
public class App 
{

    public static void main( String[] args ) {
        System.out.println("Sorting on the basis of name in ascending order");
        TreeSet<Person> personByName = new TreeSet<>(new FirstComparator());
        personByName.add(new Person("Mihai", 31));
        personByName.add(new Person("Giulia", 30));
        personByName.add(new Person("Ziggy", 5));

        for (Person newPersonByName : personByName) {
            System.out.println(newPersonByName);
        }
        System.out.println("Sorting on the basis of age in ascending order");
        TreeSet<Person> personByAge = new TreeSet<>(new SecondComparator());
        Person ziggy = new Person("Ziggy", 5);
        personByAge.add(new Person("Mihai", 31));
        personByAge.add(new Person("Giulia", 30));
        personByAge.add(ziggy);

        for (Person newPersonByAge : personByAge) {
            System.out.println(newPersonByAge);
        }
        Hobby wiggleTail = new Hobby("Wiggle tail", 500);
        Hobby barkAtCars = new Hobby("Bark at cars", 100);
        ArrayList<Hobby> hobbyList = new ArrayList<>();
        hobbyList.add(wiggleTail);
        hobbyList.add(barkAtCars);
        ziggy.setHobbyList(hobbyList);

        Address wiggleTailAddress = new Address("Romania", "Brasov", "Grivitei", 13);
        ArrayList<Address> wiggleTailAddressList = new ArrayList<>();
        wiggleTailAddressList.add(wiggleTailAddress);
        wiggleTail.setAddressesForHobby(wiggleTailAddressList);
        barkAtCars.setAddressesForHobby(wiggleTailAddressList);
        ziggy.printHobbyAddressList();

        HashMap<Person, List<Hobby>> personAndHobbies = new HashMap<>();
        personAndHobbies.put(ziggy, ziggy.getHobbyList());
        for(Map.Entry<Person, List<Hobby>> set: personAndHobbies.entrySet()){
            System.out.println(set.getKey().getName()+ " " + set.getValue().get(0).getNameOfHobby());
        }



    }
}
