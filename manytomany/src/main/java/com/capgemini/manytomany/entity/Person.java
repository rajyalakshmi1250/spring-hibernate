package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table( name = "PERSON")
public class Person {

	
	@Id
	@Column(name = "PERSON_ID")
	private int personId;
	
	@Column(name = "PERSON_NAME")
	private String personName;
	
	 @ManyToMany(cascade = CascadeType.ALL)
	 @JoinTable(name="PERSON_PROJECT", joinColumns={@JoinColumn(name="PERSON_ID")}, 
     inverseJoinColumns={@JoinColumn(name="PROJECT_ID")})
	 
	 private Set<Project> project;
		
		public Person() 
		{
			super();
		}
		public Person(int personId, String personName ) 
		{
			super();
			this.personId = personId;
			this.personName = personName;
		}
		
		
		
		public Person(int personId, String personName, Set<Project> project) {
			super();
			this.personId = personId;
			this.personName = personName;
			this.project = project;
		}
		public Set<Project> getProject() 
		{
			return project;
		}
		public void setProject(Set<Project> project) 
		{
			this.project = project;
		}
		
		public int getPersonId() 
		{
			return personId;
		}
		public void setPersonId(int personId) 
		{
			this.personId = personId;
		}
		public String getPersonName() 
		{
			return personName;
		}
		public void setPersonName(String personName) 
		{
			this.personName = personName;
		}
		
		@Override
		public String toString() 
		{
			return "Person [personId=" + personId + ", personName=" + personName + ", project=" + project + "]";
		}
}
