package org.bhanu;

public class StudentDetails {
	private int sid;
	private String name;
	private String phno;
	private float cgpa;
	private Interface i;
	public StudentDetails(int sid, String name, String phno, float cgpa, Interface i){
		this.sid=sid;
		this.name=name;
		this.phno=phno;
		this.cgpa=cgpa;
		this.i=i;
	}
	public void showDetails() {
		System.out.println("Student ID is: "+sid);
		System.out.println("Student Name is: "+name);
		i.display();
		System.out.println("Phone no: "+phno);
		System.out.println("CGPA is: "+cgpa);
	}
}
