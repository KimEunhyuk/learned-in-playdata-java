
package model.dto;

public class User {
	private String grade;    
	private String name;
	private double recency;
	private double frequency;
	
	public User() {}
	public User(String grade, String name, double recency, double frequency) {
		this.grade = grade;
		this.name = name;
		this.recency = recency;
		this.frequency = frequency;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getRecency() {
		return recency;
	}
	
	public void setRecency(double recency) {
		this.recency = recency;
	}
	
	public double getFrequency() {
		return frequency;
	}
	
	public void setFrequency(double frequency) {
		this.frequency = frequency;
	}
	
	@Override
	public String toString() {
		return "Book [grade=" + grade + ", name=" + name + ", recency=" + recency + ", frequency=" + frequency + "]";
	}
	
}
