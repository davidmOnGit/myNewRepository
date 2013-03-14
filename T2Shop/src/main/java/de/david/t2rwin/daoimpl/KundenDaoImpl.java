package de.david.t2rwin.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

import de.david.t2rwin.dao.KundenDao;
import de.david.t2rwin.entities.Kunde;

@Component
public class KundenDaoImpl extends HibernateDaoSupport implements KundenDao {
	
	@SuppressWarnings("unchecked")
	public List<Kunde> getAllKunden() {
//		List<Kunde> eins = (List<Kunde>)getHibernateTemplate().find("from Kunde");
		return getHibernateTemplate().find("from Kunde");
		
	}

	public void addKunde(Kunde kunde) {
		getHibernateTemplate().save(kunde);
	}
	
	@Autowired
	public void setHibernateSession(SessionFactory sessionFactory){
		super.setSessionFactory(sessionFactory);
		
	}
	
}
