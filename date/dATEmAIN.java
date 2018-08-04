package date;

//program to print the age of a person by taking the date of birth as input
import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class dateMain {

	public static void main(String[] args) throws Exception {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter the datE in the format DD/MM/YYYY ");
		String input = Sc.nextLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		Calendar dob = Calendar.getInstance();
		dob.setTime(sdf.parse(input));
		Date age = new Date(dob);
		age.getAge(dob);

		System.out.println(
				"Age of person is : " + age.getAge() + "yr" + age.getMonth() + "months" + age.getDay() + "days old");
	}

}
