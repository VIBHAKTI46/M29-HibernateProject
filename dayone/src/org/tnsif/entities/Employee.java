package org.tnsif.entities;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;
/*
 * below annotation ensure that the given class is an entity in the database table
 */
@Entity
@Table(name="Employee")
public class Employee implements Serializable  {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id // this id is primary key
	private int  id;
	private String name;
	//getter and setter 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
