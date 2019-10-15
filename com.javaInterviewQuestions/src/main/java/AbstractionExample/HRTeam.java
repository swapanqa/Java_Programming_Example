/**
 * 
 */
package AbstractionExample;

/**
 * @author mamun79
 *
 */
public class HRTeam extends ITDepart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		
		ITDepart it = new HRTeam();
//		
//          it.goodies();
//           it.work();
//           
//           //HRTeam hr = new HRTeam();
//           it.salary();
//           
        Emp em =new HRTeam();   
           
           em.goodies();
           em.salary();
           em.work();
           it.setMethod();
	}
	
	@Override
	public void salary() {
		
		System.out.println("5LPA");
	}

}
