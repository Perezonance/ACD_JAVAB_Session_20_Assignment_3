package hibernate;

import java.sql.Date;

public class Student {
	private int sID, sGrades;
	private String sName;
	private Date sJoinDate;
	
	public Student() {
		super();
	}

	public int getsID() {
		return sID;
	}

	public void setsID(int sID) {
		this.sID = sID;
	}

	public int getsGrades() {
		return sGrades;
	}

	public void setsGrades(int sGrades) {
		this.sGrades = sGrades;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public Date getsJoinDate() {
		return sJoinDate;
	}

	public void setsJoinDate(Date sJoinDate) {
		this.sJoinDate = sJoinDate;
	}
	
	
}
