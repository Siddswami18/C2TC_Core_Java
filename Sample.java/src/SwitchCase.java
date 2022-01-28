
public class SwitchCase {

	public static void main(String[] args) 
	{
		int regestration_no = 1;
		  System.out.println("the patient regestration no is " + regestration_no);
		switch (regestration_no) {
		case 1:
			System.out.println("He has astama  send him to 1st floor");
			break;
		case 2:
			System.out.println("He has totaly fine send him home");
			break;
		default:
			System.out.println("He is new patient make the regestration");
		}	
		
	}

}
