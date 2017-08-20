package org.inventory.storeManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Consummable extends Item {
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="consuItem")
	private List<CheckoutConsummable> checkout;

	
	public Consummable() {
	}

	public List<CheckoutConsummable> getCheckout() {
		return checkout;
	}

	public void setCheckout(List<CheckoutConsummable> checkout) {
		this.checkout = checkout;
	}
	

}
