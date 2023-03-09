import java.lang.*;

public class HelloWorld {
   public static void main(String[] args) {
      System.out.println("Hello, world!");
      
      Animal myAnimal = new Animal();
      myAnimal.printAnimal();
   }
}

class Animal {
   public void printAnimal() {
      System.out.println("I am an animal.");
   }
}

