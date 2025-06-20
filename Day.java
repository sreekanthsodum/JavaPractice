import java.util.Scanner;

public class Day{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your choice of the day:");
		String day = scanner.nextLine();
		if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday"){
			System.out.println("Uff, It's a weekday");
		}	
		else if(day.equals("Saturday") || day.equals("Sunday"){
			System.out.println("Yayy, It's a weekend");
		}
		else{
			System.out.println("Incorrect input, Try again");
			String day = scanner.nextLine();
		}
	}
}