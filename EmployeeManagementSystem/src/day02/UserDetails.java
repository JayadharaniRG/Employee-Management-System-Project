package day02;
import java.util.Scanner;
public class UserDetails {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("	==== User Details ====	");
		
		System.out.print("Enter your Name:");
		String name = sc.next();
		
		System.out.print("Enter your Age:");
		int age = sc.nextInt();
		
		System.out.print("Enter your City:");
		String city = sc.next();
		
		System.out.print("Enter your Qualification:");
		String qualification = sc.next();

	}

}
