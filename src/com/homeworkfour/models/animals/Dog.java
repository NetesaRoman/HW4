package com.homeworkfour.models.animals;

public class Dog extends Animal{
    //fields
    private static int numberOfDogs = 0;

    //constructors
    public Dog(String name){
        super(name);
        runCapability = 500;
        swimCapability = 10;
        numberOfDogs++;
    }

    //methods
    @Override
    public void swim(double length) {
        if(length <= swimCapability){
            System.out.println(
                            "     __\n" +
                            "(___()'`;\n" +
                            "/,    /`           " + this.name + " swam over the river!  LENGTH: " +length+"\n" +
                            "\\\\\"--\\\\"
            );
        }
        else {
            System.out.println(
                            "     __\n" +
                            "(___()'`;\n" +
                            "/,    /`           " + this.name + " couldn't swim over the river! LENGTH: " +length+"\n" +
                            "\\\\\"--\\\\"
            );
        }
    }

    @Override
    public void run(double length) {
        if(length <= runCapability){
            System.out.println(
                            "     __\n" +
                            "(___()'`;\n" +
                            "/,    /`           " + this.name + " ran over the obstacle!  LENGTH: " +length+"\n" +
                            "\\\\\"--\\\\"
            );
        }
        else {
            System.out.println(
                            "     __\n" +
                            "(___()'`;\n" +
                            "/,    /`           " + this.name + " couldn't run over the obstacle!  LENGTH: " +length+"\n" +
                            "\\\\\"--\\\\"
            );
        }
    }

    public static void showDogCount(){
        System.out.println("Number of all dogs:" + numberOfDogs + "\n");
    }
}
