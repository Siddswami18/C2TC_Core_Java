
public class NestedIf {

	public static void main(String[] args) {
		
		int wehicalspeed = 40;
	
		
			if(wehicalspeed <= 80){
				System.out.println("you can increase the your wehicalspeed upto 80");
				if( wehicalspeed < 70){
					System.out.println("you can increase the your wehicalspeed upto 70 ");
					if(wehicalspeed < 50) {
						System.out.println(" you can increase the your wehicalspeed upto 50");
				}
			}
				
					
		}
			else	
				System.out.println("you can continue with this speed ");
	}
}
