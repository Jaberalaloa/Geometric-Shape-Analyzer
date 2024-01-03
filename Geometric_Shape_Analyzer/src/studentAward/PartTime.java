package studentAward;

public class PartTime extends Student {

	private static double partTimeTuition = 9500;

	public PartTime(int studentID, String firstName, String lastName, double GPA) {

		super(studentID, firstName, lastName, GPA);

	}


	@Override

	public double getAmountDue() {


		return partTimeTuition;

	}

	public boolean isFullTime() {


		return false;

	}


	@Override

	public String toString() {

		return super.toString() + ", Part-time Amount due:" + getAmountDue();

	}

}