package com.capgemini.jpademo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;


	
	@Entity
	public class Person {
		
		@Id
		private int personid;
		private String personName;
		
		public Person() {
			super();
			
		}
		public Person(int personid, String personName) {
			super();
			this.personid = personid;
			this.personName = personName;
		}
		
		public int getPersonid() {
			return personid;
		}
		public void setPersonid(int personid) {
			this.personid = personid;
		}
		public String getPersonName() {
			return personName;
		}
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		@Override
		public String toString() {
			return "Person [personid=" + personid + ", personName=" + personName + "]";
		}

}
