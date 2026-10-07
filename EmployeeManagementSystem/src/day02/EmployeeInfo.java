package day02;
import java.util.Scanner;
public class EmployeeInfo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("======================================");
		System.out.println(" 	Employee Informaation 	");
		System.out.println("======================================");
		System.out.println();
		System.out.print("Enter your Name:");
		sc.next();
		System.out.print("Enter yor Emp ID:");
		sc.nextInt();
		System.out.print("Enter your Age:");
		sc.nextInt();
		System.out.print("Enter your Salary:");
		sc.nextDouble();
		System.out.print("Enter your Dept:");
		sc.next();
		
	}
	
}
