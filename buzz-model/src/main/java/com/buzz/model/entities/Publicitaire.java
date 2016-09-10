/**
 * @author Bilel
 * Created : 23:26:59
 * Copyright : Bilel KHALSI
 */
package com.buzz.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * TODO : JavaDoc
 */
@Entity
@Table(name="Publicitaire")
public class Publicitaire implements Serializable{
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private String label;
	
	private String mail;
	
	private String password;
	
	private String phone;
	
	private String photo;
	
	private String description;
	
	private List<Site> sites;
	
	public Publicitaire(){
		
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}



	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}



	/**
	 * @return the mail
	 */
	public String getMail() {
		return mail;
	}



	/**
	 * @param mail the mail to set
	 */
	public void setMail(String mail) {
		this.mail = mail;
	}



	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}



	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}



	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	
	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}



	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}



	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @return the sites
	 */
	public List<Site> getSites() {
		return sites;
	}



	/**
	 * @param sites the sites to set
	 */
	public void setSites(List<Site> sites) {
		this.sites = sites;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
