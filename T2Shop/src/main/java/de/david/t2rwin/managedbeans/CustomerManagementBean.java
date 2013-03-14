/**
 * 
 */
package de.david.t2rwin.managedbeans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import de.david.t2rwin.entities.Kunde;

/**
 * @author davidmager
 * 
 */
@ManagedBean
public class CustomerManagementBean {

	@ManagedProperty(value = "")
	private java.lang.String vorname;

	@ManagedProperty(value = "")
	private java.lang.String nachname;

	@ManagedProperty(value = "#{kundenverwalterImpl}")
	private de.david.t2rwin.services.Kundenverwalter kundenverwalter;

	public CustomerManagementBean() {
	}

	public String addKunde() {
		Kunde kunde = new Kunde();
		kunde.setVorname(vorname);
		kunde.setNachname(nachname);
		getKundenverwalter().registriereKunde(kunde);
		return "SUCCEED";
	}

	public java.lang.String getVorname() {
		return vorname;
	}

	public void setVorname(java.lang.String name) {
		this.vorname = name;
	}

	public java.lang.String getNachname() {
		return nachname;
	}

	public void setNachname(java.lang.String nachname) {
		this.nachname = nachname;
	}

	public de.david.t2rwin.services.Kundenverwalter getKundenverwalter() {
		return kundenverwalter;
	}

	public void setKundenverwalter(
			de.david.t2rwin.services.Kundenverwalter kundenverwalter) {
		this.kundenverwalter = kundenverwalter;
	}
	
	public List<Kunde> listeKunden(){
		List<Kunde> liste = kundenverwalter.getAllKunden();
		return liste; 
	}

}
