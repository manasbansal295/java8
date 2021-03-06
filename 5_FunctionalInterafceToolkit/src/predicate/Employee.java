package predicate;

public class Employee {

	private Integer id;
	private Integer age;
	private String gender;
	private String firstName;
	private String lastName;

	public Employee(Integer id, Integer age, String gender, String fName,
			String lName) {
		this.id = id;
		this.age = age;
		this.gender = gender;
		this.firstName = fName;
		this.lastName = lName;
	}
 
	@Override
	public String toString() {
		return this.getFirstName() + " " + this.getLastName() + "(id="
				+ this.id.toString() + ", age=" + this.getAge() + ")";
	}

	public Integer getAge() {
		return age;
	}

	public String getGender() {
		return gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
}
