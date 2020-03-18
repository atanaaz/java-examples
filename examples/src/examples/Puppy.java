package examples;

public class Puppy {
	   int puppyAge;

	   public Puppy(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name );
	   }
	   
	   public Puppy() {
		   System.out.print("No args");
	   }
	   

	   public void setAge( int age ) {
	      puppyAge = age;
	   }

	   public int getAge( ) {
	      System.out.println("Puppy's age is :" + puppyAge );
	      return puppyAge;
	   }

	   public static void main(String []args) {
	      /* Object creation */
	      Puppy myPuppy = new Puppy( "tommy" );

	      /* Call class method to set puppy's age */
	      myPuppy.setAge( 2 );

	      /* Call another class method to get puppy's age */
	      myPuppy.getAge( );
	      
	      
	      Puppy myPuppy1 = new Puppy( "puppy" );

	      /* Call class method to set puppy's age */
	      myPuppy1.setAge( 3 );

	      /* Call another class method to get puppy's age */
	      myPuppy1.getAge( );
	      
	      
	      Puppy myPuppy3 = new Puppy( );

	      /* Call class method to set puppy's age */
	      myPuppy1.setAge( 3 );

	      /* Call another class method to get puppy's age */
	      myPuppy1.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPuppy.puppyAge );
	      System.out.println("Variable Value :" + myPuppy1.puppyAge );
	      System.out.println("Variable Value :" + myPuppy3.puppyAge );
	      
	   }
	}