import java.util.Scanner;
import java.util.Calendar;
import java.lang.Integer;



public class DeadlineCalculator {

	public static void main(String[] args) {
		
		
		//Ask for input
		
		Scanner Scanner = new Scanner(System.in);
		
		
		System.out.println("Please enter a year:");
		String Year = Scanner.nextLine(); // Ask for year
		
		System.out.println("Please enter a month:");
		String Month = Scanner.nextLine(); // Ask for month
		
		System.out.println("Please enter a day:");
		String Day = Scanner.nextLine(); // Ask for day
		
		
		System.out.println("What is your deadline in years:");
		String deadlineYears = Scanner.nextLine(); // Ask for deadline in years
		
		Calendar deadlineDate = Calendar.getInstance();
		
		deadlineDate.set(Integer.parseInt(Year) + Integer.parseInt(deadlineYears), Integer.parseInt(Month) - 1, Integer.parseInt(Day));
		//Java starts counting months from zero. Thus the -1.
		
		
		System.out.println("Your due date is " + cutDate(deadlineDate.getTime().toString()));  // Output user input 

	}
	
	public static String cutDate(String string2cut) {
		
		
		string2cut = string2cut.substring(0, 4)/* Weekday */ + string2cut.substring(8, 11)/* Day */+ string2cut.substring(4, 8)/* Month */ + string2cut.substring(24, 28); /* Year */
		
		
		return string2cut;
	}

}
