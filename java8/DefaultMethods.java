public class DefaultMethods {

  public static void main(String args[]) {
    Vehicle car = new Car();
    car.print();
  }

  interface Vehicle {
    default void print() {
        System.out.println("Vehicle print");
    }

    static void blowHorn() {
        System.out.println("Blow Horn");
    }
  }

  interface FourWheel {
    default void print() {
        System.out.println("FourWheel print");
    }
  }

  static class Car implements Vehicle, FourWheel {
      public void print() {
          Vehicle.super.print();
          FourWheel.super.print();
          Vehicle.blowHorn();
          System.out.println("I am a car");
      }
  }

}
