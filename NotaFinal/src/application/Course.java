package application;

import java.util.Scanner;

import entities.Employee;

public class Course {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Employee emp = new Employee();
		
		emp.name = sc.nextLine();
		emp.nota1 = sc.nextDouble();
		emp.nota2 = sc.nextDouble();
		emp.nota3 = sc.nextDouble();
		
		System.out.println(emp);
		
		
		sc.close();
		
	}

}
