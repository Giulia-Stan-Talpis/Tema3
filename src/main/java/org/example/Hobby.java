package org.example;

import java.util.ArrayList;

public class Hobby {
    private String nameOfHobby;
    private int frequencyPerWeek;
    ArrayList<Address> addressesForHobby = new ArrayList<>();

    public String getNameOfHobby() {
        return nameOfHobby;
    }

    public void setNameOfHobby(String nameOfHobby) {
        this.nameOfHobby = nameOfHobby;
    }

    public int getFrequency() {
        return frequencyPerWeek;
    }

    public void setFrequency(int frequency) {
        this.frequencyPerWeek = frequency;
    }
    /**
     * Returns a Hobby object which has a name and a frequency
     * @param  nameOfHobby  the name of a Hobby we want to create
     * @param  frequency the frequency (times per week) of a Hobby we want to create
     */
    public Hobby(String nameOfHobby, int frequency) {
        this.nameOfHobby = nameOfHobby;
        this.frequencyPerWeek = frequency;
    }

    @Override
    public String toString() {
        return "" + this.nameOfHobby + ", " + this.frequencyPerWeek;
    }
    /**
     * It's a void method that sets the AddressesForHobby attribute
     * @param  newAddressList  a list of addresses
     */
    public void setAddressesForHobby(ArrayList<Address> newAddressList) {
        this.addressesForHobby = newAddressList;
    }
    /**
     * It's a void method which takes no parameters that prints the nameOfHobby and country parameter in the address for
     * each Address of the Hobby
     */
    public void printAddressList() {
        for (Address address : addressesForHobby) {
            System.out.println(nameOfHobby +" in " + address.country);
        }
    }
}

