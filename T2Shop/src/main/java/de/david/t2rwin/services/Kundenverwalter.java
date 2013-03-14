package de.david.t2rwin.services;

import java.util.List;

import de.david.t2rwin.entities.Kunde;

/**
 * provides all methods to manage customers
 * 
 * @author davidmager
 * 
 */
public interface Kundenverwalter {

	/**
	 * register a new customer.
	 * 
	 * @param Kunde
	 */
	public void registriereKunde(Kunde Kunde);
	
	/**
	 * gets all registered users.
	 * @return the users list
	 */
	public List<Kunde> getAllKunden();

}
