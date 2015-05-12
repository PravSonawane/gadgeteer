/**
 * 
 */
package com.merryapps.gadgeteer.core;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author mephisto
 *
 */
@XmlRootElement(name="person")
public class Person {
	
	private long id;
	
	private String name;
	
	public Person() {
		
	}
	
	public Person(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	

}
