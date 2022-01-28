
public class explicitdatatypeconversion {

	public static void main(String[] args) 
	{
	double a = 50.50;
	System.out.println("double:" +a);
	 
	float b = (float) a;
	System.out.println("float:" +b);
	
	long c = (long) b;
	System.out.println("long:" +c);
	
	int d = (int) c;
	System.out.println("int:" +d);

	}

}
