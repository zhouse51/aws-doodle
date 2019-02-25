package aws.doodle.lambda.dynamodb;

public class MemberVO {
	private String firstName;
	private String lastName;

	public MemberVO() {
	}

	public MemberVO(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
