package curs8;

public class ExceptionExample {

	public static void main(String[] args) {
		
		String[] week = {"L", "Marti", "Miercuri", "Joi", "V", "S", "D"};
		//index           0      1          2        3     4    5    6
		
		try {
			System.out.println(week[8]);
		}catch(ArrayIndexOutOfBoundsException obj) {
			System.out.println(obj.getMessage());
		}
		
		
		for(String day: week) {
			System.out.println(day);
		}

	}

}
