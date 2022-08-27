package com.homeworkfour.view;

import com.homeworkfour.models.animals.Animal;
import com.homeworkfour.models.animals.Cat;
import com.homeworkfour.models.animals.Dog;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Cat in Boots");
        Dog dog = new Dog("Sharik");

        cat.swim(8);
        dog.swim(1);
        cat.run(500);
        cat.run(2);
        dog.swim(30);
        dog.run(1000);
        dog.run(2);

        Animal.showCount();
        Dog.showDogCount();
        Cat.showCatCount();

        Cat cat2 = new Cat("Boris");
        Cat cat3 = new Cat("Nikas");

        Dog dog2 = new Dog("Yorick");
        Dog dog3 = new Dog("Borziy");

        dog2.swim(2);
        dog3.run(100);
        cat3.swim(10);
        cat2.run(1000);

        Animal.showCount();
        Dog.showDogCount();
        Cat.showCatCount();
    }
}
