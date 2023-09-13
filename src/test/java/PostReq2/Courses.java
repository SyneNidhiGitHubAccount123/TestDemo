package PostReq2;

public class Courses
{
	
	public String name;
	public String score;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public Courses(String name, String score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	
}
