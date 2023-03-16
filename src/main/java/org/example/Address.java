package org.example;

public class Address {
    String country;
    String city;
    String street;
    int numberOfStreet;
    /**
     * Returns an Address object which contains the country, city, street and number of the street for that Address
     * @param  country  the country of the Address we want to create
     * @param  city the city of the Address we want to create
     * @param street the street of the Address we want to create
     * @param numberOfStreet the number of the street of the Address we want to create
     */
    public Address (String country, String city, String street, int numberOfStreet){
        this.country = country;
        this.city = city;
        this.street = street;
        this.numberOfStreet = numberOfStreet;
    }
    @Override
    public String toString() {
        return "" + this.country + " " + this.city + " " + this.street + " " + this.numberOfStreet;
    }
}
