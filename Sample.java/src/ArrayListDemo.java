import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) 
	{
		
		ArrayList a = new ArrayList();
		a.add("A");
		
		System.out.println(a);
		a.add(10);
		a.add("A");
		a.add(null);
		System.out.println(a);
		
		a.add(2,15);
		System.out.println(a);
		a.remove(2);
		System.out.println(a);
		
	}

}
