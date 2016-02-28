package com.company;

/**
 * Created by limor on 28/02/2016.
 */
public class Car {

    int color;
    // int 4 bytes, every color can ger one byte and so it is the range of 256, the range of the total rgb color is ~16,000,000
    // the forth byte is the opacity or transparacy.
    String make, model;
    int year;
    String licensePlate;

    public void drive(){
        System.out.println("driving");
    }
    public void stop(){
        System.out.println("stop");
    }
    public void honk(){
        System.out.println("paa paa");
    }


}
// each file may contain no more than one public class

class Boat{

}