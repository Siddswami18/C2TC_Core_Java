
public class ControlFlowStatement {

	public static void main(String[] args) {
	
		int testscore = 89;
		char grade;
		 
		if (testscore >= 90)
		{
			grade = 'A';
		}
		else if(testscore >=80)
		{
			grade = 'B';
		}
		else if (testscore >= 70)
		{
			grade = 'c';
		}
		else
		{
			grade = 'F';
		}
		
		System.out.println("Gread =" + grade);
	}
}