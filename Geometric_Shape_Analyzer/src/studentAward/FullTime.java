package studentAward;

public class FullTime extends Student {

	private static double fullTimeTuition = 18000;

	private double awardValue;


	public FullTime(int studentID, String firstName, String lastName, double GPA) {


		super(studentID, firstName, lastName, GPA);

		awardValue = 0;

	}

	public void award(double value) {

		awardValue = value;

		System.out.println("Student " + firstName + " " + lastName + " GPA " + getGPA() + "| Awarded CAD" + value);

	}

	@Override

	public double getAmountDue() {


		return fullTimeTuition - awardValue;

	}

	public boolean isFullTime() {


		return true;
	}

	@Override

	public String toString() {


		return super.toString() + ", Full-time Amount due:" + getAmountDue();

	}

}
