package com.springdatajpa.studentmarks.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student
{

	@Id
		private int id;
	    private String name;
	    private int rollNo;
	    private int mathMarks;
	    private int englishMarks;
	    private int socialMarks;
	    private int scienceMarks;
	    private int totalMarks;
	    private String status;
		public int getId() {
			return id;
		}
		public void setId(int i) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRollNo() {
			return rollNo;
		}
		public void setRollNo(int rollNo) {
			this.rollNo = rollNo;
		}
		public int getMathMarks() {
			return mathMarks;
		}
		public void setMathMarks(int mathMarks) {
			this.mathMarks = mathMarks;
		}
		public int getEnglishMarks() {
			return englishMarks;
		}
		public void setEnglishMarks(int englishMarks) {
			this.englishMarks = englishMarks;
		}
		public int getSocialMarks() {
			return socialMarks;
		}
		public void setSocialMarks(int socialMarks) {
			this.socialMarks = socialMarks;
		}
		public int getScienceMarks() {
			return scienceMarks;
		}
		public void setScienceMarks(int scienceMarks) {
			this.scienceMarks = scienceMarks;
		}
		public int getTotalMarks() {
			return totalMarks;
		}
		public void setTotalMarks(int totalMarks) {
			this.totalMarks = totalMarks;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public Student(int id, String name, int rollNo, int mathMarks, int englishMarks, int socialMarks,
				int scienceMarks, int totalMarks, String status) {
			super();
			this.id = id;
			this.name = name;
			this.rollNo = rollNo;
			this.mathMarks = mathMarks;
			this.englishMarks = englishMarks;
			this.socialMarks = socialMarks;
			this.scienceMarks = scienceMarks;
			this.totalMarks = totalMarks;
			this.status = status;
		}
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + ", mathMarks=" + mathMarks
					+ ", englishMarks=" + englishMarks + ", socialMarks=" + socialMarks + ", scienceMarks="
					+ scienceMarks + ", totalMarks=" + totalMarks + ", status=" + status + "]";
		}
	    
	  
}
