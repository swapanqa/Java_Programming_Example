package Algorithom_Example;

/*
 * How to verify if the String Contains only Digits 
 * || Java Interview Question
 * 
 * 
 * 
 * 
 */



public class CheckIsNumber {
	
	public static boolean isEmpty(CharSequence cs) {
		
		return cs == null || cs.length() == 0;
		
		
	}
	
	public static boolean IsNumber (CharSequence cs) {
		
		if(isEmpty(cs)) {
			
			return false;
		}
		int len = cs.length();
		
		for(int i=0;i<len;i++) {
			
			if(!Character.isDigit(cs.charAt(i))) {
				return false;
			}
		}
		
		return true;
	}
	
public static void main(String args[]) {
	
	System.out.println(IsNumber(null));
	
	System.out.println(IsNumber("Abc"));
	
	System.out.println(IsNumber("123"));
	
	System.out.println(IsNumber("!!!"));
	
	System.out.println(IsNumber("1234AAAccc"));
	
	System.out.println(IsNumber("0000000000000"));
	
	
	
	
}	
	
	
	
	
	
	
	
	
	

}
