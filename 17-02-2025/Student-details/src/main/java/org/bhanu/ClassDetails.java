package org.bhanu;
public class ClassDetails implements Interface{
	private String dept;
	private int year;
	private String sec;
	public ClassDetails(String dept, int year, String sec) {
		this.dept=dept;
		this.year=year;
		this.sec=sec;
	}
	@Override
	public void display() {
		System.out.println("Student's department is "+dept);
		System.out.println("Student's class is "+year+"-"+sec);
	}
}
