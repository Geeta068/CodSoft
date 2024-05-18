import java.util.Scanner;

class Grade{
	
	public String grade(int avg) {
		switch(avg/10) {
		case 10:
			return "A+";
		case 9:
			return "A";
		case 8:
			return "B+";
		case 7:
			return "B";
		case 6:
			return "C+";
		case 5:
			return "C";
			default:
				return "F";
		}
	}
}



public class Grade_Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Grade grade = new Grade();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of subject : ");
		int sub = sc.nextInt();
		int marks = 0;
		
		for(int i = 0;i<sub;i++)
		{
			System.out.println("Enter the marks obtained in subject "+(i+1));
			int mark = sc.nextInt();
			marks += mark;
		}
		int avg = marks / sub;
		
		String g = grade.grade(avg);
		
		System.out.println("Total Marks : "+marks);
		System.out.println("Percentage : "+avg+"%");
		System.out.println("Grade : "+g);

	}

}
