package com.tlglearning.animals;

public class Dog extends Wolf {

  private static final int MY_CONSTANT = initializeValue();

  private int data = initializeData();

  static {
    System.out.println("Dog initialization block");
  }


  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Second Dog initialization block");
  }

  public Dog() {
    System.out.println("Dog constructor");
  }

  private static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }

  public static void whoAmI() {
    System.out.println("I am a dog");
  }

  private int initializeData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }
  //private and static methods aren't inherited

  public void rollOver() {
    System.out.println("I am rolling over! I'm the best dog!");
  }
}
