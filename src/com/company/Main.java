package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car c;//this is an empty pointer / reference
        c = new Car();
        //1. find a free sport for the object that is large enough to contain the object.
        //2. mark that spot as taken
        //3. return that address in the memorey that was taken

        c.color = 123;
        c.licensePlate = "234234";
        c.make ="Toyota";
        c.model ="Corrola";
        c.year = 2016;
        System.out.println(c.year);
        c.honk();
        Car c2 = new Car();
        c2 = c;


    }
}
