package javaProgrammingExample;

public class NumberOfDigitNumber {

	public static void main(String[] args) {
		
      int num = 1234567452;
     int count =0;
      while(num >0) {
    	  num = num/10;
    	  count++;
    	  
      }
      System.out.println("Number of Digit :" + count);
		

	}

}
