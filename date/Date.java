package date;

import java.util.Scanner;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class Date {
	// instance members
	private int day;
	private int month;
	private int age;
	private Calendar dob;

	public Date(Calendar dob) {
		super();
		this.dob = dob;
	}

	// method to get the age
	public void getAge(Calendar dob) {
		Calendar today = Calendar.getInstance();
		int curyear = today.get(Calendar.YEAR);
		int dobyear = dob.get(Calendar.YEAR);
		this.age = curyear - dobyear;

		int curmonth = today.get(Calendar.MONTH);
		int dobmonth = dob.get(Calendar.MONTH);
		this.month = dobmonth - curmonth;

		int curday = today.get(Calendar.DAY_OF_MONTH);
		int dobday = dob.get(Calendar.DAY_OF_MONTH);
		this.day = curday - dobday;

		if (dobmonth > curmonth) {
			this.age--;
		} else if (dobmonth == curmonth) {
			if (dobday > curday) {
				this.age--;
			}
		}
	}

	// getters and setters
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getAge() {
		return age;
	}

	public Calendar getDob() {
		return dob;
	}

}
