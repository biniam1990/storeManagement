package org.inventory.storeManagement.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CheckInCheckOut {
	//enum Status {borrowed, returned};
	@Id
	@GeneratedValue
	private int id;
	private Date expectedReturnDate;
	private Date returnDate;
	private Date checkOutDate;
	//private Status status;
	@ManyToOne
	private NonConsummable nonConsuItem;
	@ManyToOne
	private Staff staff;
	
	
	public CheckInCheckOut() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getExpectedReturnDate() {
		return expectedReturnDate;
	}
	public void setExpectedReturnDate(Date expectedReturnDate) {
		this.expectedReturnDate = expectedReturnDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	public Date getCheckOutDate() {
		return checkOutDate;
	}
	public void setCheckOutDate(Date checkOutDate) {
		this.checkOutDate = checkOutDate;
	}
	public NonConsummable getNonConsuItem() {
		return nonConsuItem;
	}
	public void setNonConsuItem(NonConsummable nonConsuItem) {
		this.nonConsuItem = nonConsuItem;
	}
	public Staff getStaff() {
		return staff;
	}
	public void setStaff(Staff staff) {
		this.staff = staff;
	}
    
	
}
