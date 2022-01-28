
public class ArithmaticDemo {

	public static void main(String[] args)
	{
	int result = 1+2;
	System.out.println("1+2=" +result);
	int original_result = result;
	
	result = result - 1;
	//now result is 2
	System.out.println(original_result + "-1 =" + result);
	original_result = result;
	
	result = result * 2;
	//now result is 4
	System.out.println(original_result + "*2 =" +result);
	}

}
 