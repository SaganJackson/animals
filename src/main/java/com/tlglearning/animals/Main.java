package com.tlglearning.animals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Wolf> wolves = new ArrayList<>(); //creating an instance of ArrayList
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Wolf());
    wolves.add(new Dog());
    wolves.add(new Dog());
    wolves.add(new Dog());
    Collections.shuffle(wolves);
    //for each wolf in the list wolves do the code in the curly braces
    for (Wolf w : wolves) {
      System.out.println();
      System.out.println(w.getClass().getName());
      w.hunt();
      w.vocalize();
      if (w instanceof Dog) {
        ((Dog)w).rollOver();
      }
//     if (w instanceof Dog) {
//        ((Dog) w).whoAmI();
//        //or instead of using casting, can use the below
//        //Dog.whoAmI();
//
//      } else {
//        Wolf.whoAmI();
//      }
      //w.whoAmI(); // static method invocation looks only at the reference type of w. will not print out "I AM A DOG"
    }
  }

}
