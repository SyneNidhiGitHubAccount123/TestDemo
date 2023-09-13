package PostReq2;

import PostReq2.Courses;

public class Student {
	
	
	public String firstName;
	public String lastName;
	public String programme;
	public String email;
	public Courses course;
	
	
	public Student(String firstName, String lastName, String programme, String email)
	{
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.programme = programme;
		this.email = email;
		
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


	public String getProgramme() {
		return programme;
	}


	public void setProgramme(String programme) {
		this.programme = programme;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Courses getCourse() {
		return course;
	}


	public void setCourse(Courses course) {
		this.course = course;
	}
	
	
	
	
	
	
}
