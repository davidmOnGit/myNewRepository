package de.david.t2rwin.managedbeans;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "navigationBean")
@RequestScoped
public class NavigationBean {

	@ManagedProperty(value = "")
	private Map<String, String> navigationEntries;

	public Map<String, String> getNavigationEntries() {
		return navigationEntries;
	}

	public void setNavigationEntries(Map<String, String> navigationEntries) {
		this.navigationEntries = navigationEntries;
	}

	/**
	 * this method initializes and populates the navigationsEntries property.
	 * insert your new navigation items and their corresponding pages here.
	 */
	@SuppressWarnings("unused")
	@PostConstruct
	private void populateNavigationEntries() {
		setNavigationEntries(new HashMap<String, String>());
		addNavigationEntry("Welcome", "index.xhtml");
		addNavigationEntry("Store", "storeWelcomePage.xhtml");
		addNavigationEntry("Login", "loginPage.xhtml");
		addNavigationEntry("User Registration", "userRegistration.xhtml");
		addNavigationEntry("Eine Tabellenseite", "eine_tabellens.xhtml");
	}

	/**
	 * adds an entry to the navigation. the xhtml pages have to be located in the
	 * root web folder
	 * 
	 * @param entry
	 *            name of the entry
	 * @param page
	 *            name of the xhtml-page.
	 */
	private void addNavigationEntry(String entry, String page) {
		getNavigationEntries().put(entry, page);
	}
}
