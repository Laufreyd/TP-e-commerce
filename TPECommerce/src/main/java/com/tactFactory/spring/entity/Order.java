/**
 * 
 */
package com.tactFactory.spring.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ALEPAG1
 *
 */
@Entity
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private Date date;
	@Column
	private Float totalPieces;
	
	public Order() {
		this.date = new Date();
	}
	
	public String toString() {
		return String.format("Caddie [Date:%d, Total:%f]", this.date, this.totalPieces);
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
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * @return the totalPieces
	 */
	public Float getTotalPieces() {
		return totalPieces;
	}

	/**
	 * @param totalPieces the totalPieces to set
	 */
	public void setTotalPieces(Float totalPieces) {
		this.totalPieces = totalPieces;
	}
}
