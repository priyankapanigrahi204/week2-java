
public class Citizen {
	private String name;
	private String contactNumber;
	private String emailAddress;
	public Citizen() {	}
	
	public Citizen(String name, String contactNumber, String emailAddress) {
		super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.emailAddress = emailAddress;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getName() {
		return name;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}

	@Override
	public String toString() {
		return "Citizen [name=" + name + ", contactNumber=" + contactNumber + ", emailAddress=" + emailAddress + "]";
	}

}
