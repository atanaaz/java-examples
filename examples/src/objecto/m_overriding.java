package objecto;

public class m_overriding {
	 public static void main(String args[]) {
	      Animal a = new Animal();   // Animal reference and object
	      Dog b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	      b.bark();
	   }
}

class Animal {
   public void move() {
      System.out.println("Animals can move");
   }
}

class Dog extends Animal {
   public void move() {
      System.out.println("Dogs can walk and run");
   }
   public void bark() {
	   System.out.println("woof woof!");
   }
   
}

