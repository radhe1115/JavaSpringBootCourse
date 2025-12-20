import java.util.Scanner;

class DateInput {
	private int day;
	private int month;
	private int year;

	DateInput() {
	}

	DateInput(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;

	}

	public int getDay() {
		return this.day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return this.month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return (this.day + "-" + this.month + "-" + this.year);
	}
}

public class AgeCalculator {
	// code for finding age of person from his date of birth
	public static void main(String[] args){
	
	//objects for use
	Scanner sc = new Scanner(System.in);
	DateInput dateInp =new DateInput();
	DateInput todaysDate =new DateInput(07,12,2025);

	/*

	System.out.println("Enter Todays Date");
	
	System.out.print("Enter Day: ");
	todaysDate.setDay(sc.nextInt());
	
	System.out.print("\nEnter Month: ");
	todaysDate.setMonth(sc.nextInt());

	System.out.print("\nEnter year: ");
	todaysDate.setYear(sc.nextInt());
	*/

	System.out.println("Todays Date is: "+ todaysDate.toString());
	
	System.out.println("Enter Your Date of Birth");
	
	System.out.print("Enter Day: ");
	dateInp.setDay(sc.nextInt());
	
	System.out.print("\nEnter Month: ");
	dateInp.setMonth(sc.nextInt());

	System.out.print("\nEnter year: ");
	dateInp.setYear(sc.nextInt());

	System.out.println("Your Date of Birth is: "+ dateInp.toString());
	//07-12-2025
	//11-12-2001

	public void compareDates(DateInput currentDate, DateInput dob) {

	private int years = 0;
	private int month = 0;
	private int days = 0;
	if(currentDate.getYear()>dob.getYear()&&dob.getYear()>1900&&dob.getMonth()>0&&currentDate.getMonth()>0)
	{
		if (currentDate.getMonth() > dob.getMonth()) {
			year = currentDate.getYear() - dob.getYear();
		} else if (currentDate.getMonth() < dob.getMonth()) {
			year = currentDate.getYear() - dob.getYear() - 1;
		} else if (currentDate.getMonth() = dob.getMonth()) {
			if (currentDate.getDay() < dob.getDay()) {
				year = currentDate.getYear() - dob.getYear() - 1;

			}
		} else {
			System.out.println("Enter a valid Date");
		}

		System.out.println("Your Age is: " + years + "Years " + month + " Months " + days + " Days.");

	}
}