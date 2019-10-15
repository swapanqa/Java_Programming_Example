package InterviewQuestions;

public class ClientTest {

	
	public static void main (String [] args) {
		
		Animal animal = new Dog();
		
		/*
		 * As reference animal has child class object so
		 * Overridden eat method will be called.*/
		
		animal.eat();
		
		/*
		 * It will call parent  class static method 
		 * 
		 * Don't forget that static method can't be overridden
		 */
		
		
		
		animal.run();
		
		
		/*
		 * As statc method can not be overridden 
		 * so Child class method be called and it
		 * 
		 * will be hide parent class static method
		 */
		 
		Dog.run();
		
		
	}
	
	
	

}
