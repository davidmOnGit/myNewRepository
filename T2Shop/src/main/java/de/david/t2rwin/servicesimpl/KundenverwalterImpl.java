package de.david.t2rwin.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.david.t2rwin.dao.KundenDao;
import de.david.t2rwin.entities.Kunde;
import de.david.t2rwin.services.Kundenverwalter;

/**
 * this class provides all methods needed to manage customers.
 * @author davidmager
 *
 */
@Service
public class KundenverwalterImpl implements Kundenverwalter {
	
	@Autowired
	private KundenDao kundenDao;

	/**
	 *@see Kundenverwalter
	 *currently just add it to the database
	 */
	public void registriereKunde(Kunde kunde) {
		getKundenDao().addKunde(kunde);
	}

	/**
	 *@see Kundenverwalter
	 *currently just call the databasetable
	 */
	public List<Kunde> getAllKunden() {
		
		return getKundenDao().getAllKunden();
	}

	public KundenDao getKundenDao() {
		return kundenDao;
	}

	public void setKundenDao(KundenDao kundenDao) {
		this.kundenDao = kundenDao;
	}

}
