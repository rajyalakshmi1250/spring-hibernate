package com.capgemini.manytomany.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
@Entity
@Table( name = "PROJECT")
public class Project {
	
	@Id
	@Column( name = "PROJECT_ID" )
	private int projectId;
	
	@Column( name = "DESCRIPTION" )
	private String description;
	
	@ManyToMany
	private Set<Person> person;
	
	public Project() 
	{
		super();
	}
	public Project(int projectId, String description) 
	{
		super();
		this.projectId = projectId;
		this.description = description;
	}
	public Project(int projectId, String description, Set<Person> person) 
	{
		super();
		this.projectId = projectId;
		this.description = description;
		this.person=person;
	}
	
	public int getProjectId() 
	{
		return projectId;
	}
	public void setProjectId(int projectId) 
	{
		this.projectId = projectId;
	}

	/*
	 * public Set<Person> getPerson() { return person; }
	 */
	public void setPerson(Set<Person> person) 
	{
		this.person = person;
	}
	public String getDescription() 
	{
		return description;
	}
	public void setDescription(String description) 
	{
		this.description = description;
	}
	@Override
	public String toString() 
	{
		return "Project [projectId=" + projectId + ", description=" + description + "]";
	}

}
