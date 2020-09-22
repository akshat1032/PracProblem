package javaewp;

public class JavaEWP {
	
	//constant
		public static final int WAGE_PER_HOUR = 20;
		public static final int HOUR_PER_DAY = 8;
		public static final int PART_HOUR_PER_DAY = 8;
		public static final int IS_FULL_TIME = 0;
		public static final int IS_PART_TIME = 1;
		public static final int WORKING_DAY_PER_MONTH = 20;
		public static final int MAX_WORKING_HOUR = 100;
		
		public static void main(String[] args) {
			
			//variable
			double dailyWage = 0;
			double partTimeWage = 0;
			double monthlyWage = 0;
			double partTimeMonthlyWage = 0;
			int workingDays = 0;
			int workingHours = 0;
			
			//loop for checking the required condition
			while (workingDays <= 20 && workingHours <=100) {
				
			//storing attendance
			int empAttendance = (int)(Math.floor(Math.random() * 10) % 2);
			
			//checking
			if (empAttendance == 1) {
				System.out.print("Employee present");
				int empCheck = (int)(Math.floor(Math.random() * 10) % 2);
				switch(empCheck) {
					case IS_FULL_TIME:
						System.out.print("(Full Time)\n");
						dailyWage = WAGE_PER_HOUR * HOUR_PER_DAY;
						monthlyWage = monthlyWage + dailyWage;
						break;
					case IS_PART_TIME:
						System.out.print("(Part Time)\n");
						partTimeWage = WAGE_PER_HOUR * PART_HOUR_PER_DAY;
						partTimeMonthlyWage = partTimeMonthlyWage + partTimeWage;
						break;
					default:
						System.out.println("Bad Data");
						continue;	
				}
			}
			else {
				System.out.println("Employee absent");
				}
			workingDays = workingDays + 1;
			workingHours = workingHours + 8; //maximum daily hour is assumed to be 8
			
			}
			System.out.println("Full Time Employee Monthly Wage : "+monthlyWage);
			System.out.println("Part Time Employee Monthly Wage : "+partTimeMonthlyWage);
		}
}
