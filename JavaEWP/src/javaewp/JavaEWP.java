package javaewp;

public class JavaEWP {
	//constant
		public static final int WAGE_PER_HOUR = 20;
		public static final int HOUR_PER_DAY = 8;
		
		public static void main(String[] args) {
			
			//variable
			double dailyWage = 0;
			
			//storing attendance
			int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
			
			//checking
			if (empAttendance == 1) {
				System.out.println("Employee present");
				dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
			}
			else {
				System.out.println("Employee absent");
			}
			
			System.out.println("Daily Wage : "+dailyWage);
		}

}
