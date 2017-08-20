package org.inventory.storeManagement.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class NonConsummable extends Item {
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="nonConsuItem", orphanRemoval=true)
	private List<CheckInCheckOut> nonConsummable;

	public NonConsummable() {
		super();
	}

	public List<CheckInCheckOut> getNonConsummable() {
		return nonConsummable;
	}

	public void setNonConsummable(List<CheckInCheckOut> nonConsummable) {
		this.nonConsummable = nonConsummable;
	}
	
	

}
