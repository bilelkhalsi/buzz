/**
 * @author Bilel
 * Created : 23:21:14
 * Copyright : Bilel KHALSI
 */
package com.buzz.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import com.vividsolutions.jts.geom.Point;

/**
 * TODO : JavaDoc
 */
@Entity
@Table(name="Site")
public class Site implements Serializable{

	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="marker")
	private String marker;
	
	@Column(columnDefinition = "geometry(Point,4326)")
	private Point position;

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
