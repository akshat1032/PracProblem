package javaewp;

public class JavaEWP {
public static void main(String[] args) {
		
		//storing attendance
		int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
		
		//checking
		if (empAttendance == 1) {
			System.out.println("Employee present");
		}
		else {
			System.out.println("Employee absent");
		}
	}
}
