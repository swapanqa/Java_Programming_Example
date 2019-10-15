/**
 * 
 */
package AbstractionExample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author mamun79
 *
 */
public abstract class ITDepart implements Emp

{
	WebDriver driver =new ChromeDriver();
	
	
	public void salary() {
		
		
	}
     public void goodies() {
	System.out.println("Lap");
		
	}

	public void work() {
		
		System.out.println("Automation");
	}
	
	public void setMethod() {
		
		System.out.println("Seting mehtod is done");
		
	}

}
