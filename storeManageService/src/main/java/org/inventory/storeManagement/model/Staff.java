package org.inventory.storeManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Staff {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	@OneToOne
	private Address address;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="staff")
	private List<CheckInCheckOut> checkInOuts;
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, mappedBy="staff")
	private List<CheckoutConsummable> consummables;
	public Staff() {
	}
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<CheckInCheckOut> getCheckInOuts() {
		return checkInOuts;
	}
	public void setCheckInOuts(List<CheckInCheckOut> checkInOuts) {
		this.checkInOuts = checkInOuts;
	}
	public List<CheckoutConsummable> getConsummables() {
		return consummables;
	}
	public void setConsummables(List<CheckoutConsummable> consummables) {
		this.consummables = consummables;
	}
	
	
	

}
