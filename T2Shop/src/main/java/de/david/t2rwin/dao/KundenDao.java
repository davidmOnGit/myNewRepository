package de.david.t2rwin.dao;

import java.util.List;

import de.david.t2rwin.entities.Kunde;

public interface KundenDao {
	
	public void addKunde(Kunde kunde);
	
	public List<Kunde> getAllKunden();

}
