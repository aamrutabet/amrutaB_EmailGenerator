package main;

import java.util.Scanner;

import credential.CredientialService;
import employee.Employee;

public class MainService {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter First Name -" );
		String fName = sc.next();
		System.out.print("Enter last Name -" );
		String lName = sc.next();
		System.out.print("Enter Department Id (1- Technical, 2- Admin, 3 -Human Resource, 4- Legal) -" );
		int deptId = sc.nextInt();
		
		Employee e = new Employee(fName, lName, deptId);
		CredientialService cs = new CredientialService();
		cs.showCredentials(e);
	}
}
