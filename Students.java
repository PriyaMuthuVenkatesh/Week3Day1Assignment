package week3.day1;

public class Students {

	int studID;
	String studName;
	String studEmail;
	String studPhoneNumber;

	public void getStudentInfo(int studID) {
		this.studID = studID;
		System.out.println("Student ID is " + studID);

	}

	public void getStudentInfo(int studID, String studName) {
		this.studID = studID;
		this.studName = studName;
		System.out.println("Student ID and Name: " + studID + "," + studName);
	}

	public void getStudentInfo(String studEmail, String studPhoneNumber) {
		this.studEmail = studEmail;
		this.studPhoneNumber = studPhoneNumber;
		System.out.println("Student EMail is " + studEmail);
		System.out.println("Student Phone number is " + studPhoneNumber);

	}

	public static void main(String[] args) {

		Students details = new Students();
		details.getStudentInfo(324);
		details.getStudentInfo(234, "Kavin");
		details.getStudentInfo("KA@test.com", "7766579734");

	}

}
