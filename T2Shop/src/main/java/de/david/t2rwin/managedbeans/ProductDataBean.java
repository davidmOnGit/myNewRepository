package de.david.t2rwin.managedbeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import de.david.t2rwin.services.Produktmanager;

@ManagedBean
public class ProductDataBean {
	
	@ManagedProperty(value = "")
	private String productName;
	
	@ManagedProperty(value = "")
	private String productDescription;
	
	@ManagedProperty(value = "#{produktmanagerImpl}")
	private Produktmanager produktManager;
	
	public String addNewProduct(){
		return "";
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Produktmanager getProduktManager() {
		return produktManager;
	}

	public void setProduktManager(Produktmanager produktManager) {
		this.produktManager = produktManager;
	}

}
