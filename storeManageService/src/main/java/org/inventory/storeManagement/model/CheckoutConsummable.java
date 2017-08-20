package org.inventory.storeManagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CheckoutConsummable {
	@Id
	@GeneratedValue
	private int id;
	private Date checkoutDate;
	@ManyToOne
	private Staff staff;
	@ManyToOne
	private Consummable consuItem;
	private int quantityTaken;
	
	
	public CheckoutConsummable(Date checkoutDate, Staff staff) {
		this.checkoutDate = checkoutDate;
		this.staff = staff;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCheckoutDate() {
		return checkoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		this.checkoutDate = checkoutDate;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
	public Consummable getConsuItem() {
		return consuItem;
	}
	public void setConsuItem(Consummable consuItem) {
		this.consuItem = consuItem;
	}
	public int getQuantityTaken() {
		return quantityTaken;
	}
	public void setQuantityTaken(int quantityTaken) {
		this.quantityTaken = quantityTaken;
	}
	
	
	

}
