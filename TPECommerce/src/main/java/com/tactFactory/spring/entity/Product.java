/**
 * 
 */
package com.tactFactory.spring.entity;

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
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@Column
	private String name;
	@Column
	private String description;
	@Column
	private int quantity;
	@Column
	private Boolean dead;
	
	protected Product() {}
	
	public Product (String name) {
		name = this.name;
	}
	
	public String toString() {
		return String.format("Produit [nom: %s, description: %s]", this.name, this.description);
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * @return the dead
	 */
	public Boolean getDead() {
		return dead;
	}

	/**
	 * @param dead the dead to set
	 */
	public void setDead(Boolean dead) {
		this.dead = dead;
	}
}
