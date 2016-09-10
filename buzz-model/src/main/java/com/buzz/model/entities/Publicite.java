/**
 * @author Bilel
 * Created : 23:19:38
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
@Table(name="Publicite")
public class Publicite implements Serializable{
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String subTitle;
	private String headerText;
	private String bodyText;
	private String footerText;
	private List<String> photo;
	private String video;
	
	
	public Publicite(){
		
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}



	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}



	/**
	 * @return the subTitle
	 */
	public String getSubTitle() {
		return subTitle;
	}



	/**
	 * @param subTitle the subTitle to set
	 */
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}



	/**
	 * @return the headerText
	 */
	public String getHeaderText() {
		return headerText;
	}



	/**
	 * @param headerText the headerText to set
	 */
	public void setHeaderText(String headerText) {
		this.headerText = headerText;
	}



	/**
	 * @return the bodyText
	 */
	public String getBodyText() {
		return bodyText;
	}



	/**
	 * @param bodyText the bodyText to set
	 */
	public void setBodyText(String bodyText) {
		this.bodyText = bodyText;
	}



	/**
	 * @return the footerText
	 */
	public String getFooterText() {
		return footerText;
	}



	/**
	 * @param footerText the footerText to set
	 */
	public void setFooterText(String footerText) {
		this.footerText = footerText;
	}



	/**
	 * @return the photo
	 */
	public List<String> getPhoto() {
		return photo;
	}



	/**
	 * @param photo the photo to set
	 */
	public void setPhoto(List<String> photo) {
		this.photo = photo;
	}



	/**
	 * @return the video
	 */
	public String getVideo() {
		return video;
	}



	/**
	 * @param video the video to set
	 */
	public void setVideo(String video) {
		this.video = video;
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
