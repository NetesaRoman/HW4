package com.homeworkfour.models.animals;

public abstract class Animal {

   //fields
   protected String name;
   protected double runCapability;
   protected double swimCapability;
   private static int numberOfAnimals = 0;

   //constructors
   public Animal(String name){
       this.name = name;
      numberOfAnimals++;
   }

   //methods
    abstract public void swim(double length);



   abstract public void run(double length);



    public static void showCount(){
      System.out.println("Number of all animals:" + numberOfAnimals + "\n");
    }
}
