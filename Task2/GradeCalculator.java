import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Subjects");
		int numberOfSub=sc.nextInt();
		int marks[]=new int[numberOfSub];
		int totalMarks=0;
		for(int i=0;i<numberOfSub;i++) {
			
			System.out.println("Enter marks obtained in subject"+(i+1));
			marks[i]=sc.nextInt();
			
			if(marks[i]<0 || marks[i]>100) {
				System.out.println("Invalid Marks....");
				i--;
				continue;
			}
			totalMarks=totalMarks+marks[i];
		}
		double avgPercentage=(double)totalMarks/numberOfSub;
		
		String grade;
		if(avgPercentage>=90) {
			grade=("O");
		}
		else if(avgPercentage>=80) {
			grade=("A");
		}
		else if(avgPercentage>=70) {
			grade=("B");
		}
		else if(avgPercentage>=60) {
			grade=("C");
		}
		else if(avgPercentage>=50) {
			grade=("D");
		}
		else{
			grade=("F");
		}
		
		System.out.println("*****Result*****");
		System.out.println("Total marks obtain="+totalMarks);
		System.out.println("Average Percentage="+avgPercentage);
		System.out.println("Grade="+grade);
		sc.close();
	}

}
