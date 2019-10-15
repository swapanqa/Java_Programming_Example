package javaProgrammingExample;

public class ReverseString {

	public static void main(String[] args) {
		
	//1) Using + (String concatenation) operator
		
		String str = "shafee";
		String rev =" ";
		
	/*	int len = str.length(); //6
		
		
		System.out.println("String lenght is :"+len);
		
		for (int i=len-1;i>=0;i--) {
			
			rev = rev+str.charAt(i);
			
			
			
		}
		
		System.out.print(rev);   */
		
	//2. Using Character array
		
	/*	char a [] = str.toCharArray();
		
		int len = a.length;
		
		for(int i =len-1;i>=0;i--) {
			
			rev = rev+a[i];
		}
		
		System.out.println(rev);
*/
		
		
		//3. Using String Buffer class
		
		StringBuffer sb = new StringBuffer(str);
		
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
	}

}
