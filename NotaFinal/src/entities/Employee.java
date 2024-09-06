package entities;

public class Employee {
	
	public String name;
	public double nota1;
	public double nota2;
	public double nota3;

	
	public double finalGrade() {
		return nota1 + nota2 + nota3;
	}
	public double result() {
		if(finalGrade() < 60) {
			return 60 - finalGrade();
		} else {
			return 0;
		}
		
	}
	public String toString() {
		if(finalGrade() < 60) {
		return String.format("FINAL GRADE = %.2f%n", finalGrade())
				+"FAILED\n"
				+String.format("MISSING %.2f POINTS", result());
				
		}else {
		return String.format("FINAL GRADE = %.2f%n", finalGrade())
				+"PASS";
		}
	}

}
