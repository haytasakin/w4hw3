
public class Gamer {
	
	int id;
	String firstName;
	String lastName;
	String dateOfBirth;
	String nationalityId;
	
	
	
	public Gamer(int id, String firstName, String lastName, String dateOfBirth,String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId=nationalityId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getnationalityId() {
		return nationalityId;
	}

	public void setnationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}
	
	

}
