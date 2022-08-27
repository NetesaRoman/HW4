package com.homeworkfour.models.animals;

public class Cat extends Animal{
    //fields
    private static int numberOfCats = 0;

    //constructors
    public Cat(String name){
        super(name);
        runCapability = 200;
        swimCapability = 0;
        numberOfCats++;
    }

    //methods
    @Override
    public void swim(double length) {
        System.out.println(
                " /\\_/\\\n" +
                "( o.o )            " + this.name + " can't swim!\n" +
                " > ^ <"
        );
    }

    @Override
    public  void run(double length) {
        if(length <= runCapability){
            System.out.println(
                    " /\\_/\\\n" +
                    "( o.o )            " + this.name + " ran over the obstacle! LENGTH: " +length+"\n" +
                    " > ^ <"
            );
        }
        else {
            System.out.println(
                    " /\\_/\\\n" +
                    "( o.o )           " + this.name + " couldn't run over the obstacle!  LENGTH: " +length+"\n" +
                    " > ^ <"
            );
        }
    }


    public static void showCatCount(){
        System.out.println("Number of all cats:" + numberOfCats + "\n");
    }
}
