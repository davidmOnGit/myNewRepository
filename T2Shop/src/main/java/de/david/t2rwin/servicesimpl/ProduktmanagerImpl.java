package de.david.t2rwin.servicesimpl;

import org.springframework.stereotype.Service;

import de.david.t2rwin.services.Produktmanager;

@Service
public class ProduktmanagerImpl implements Produktmanager {

	public void testeAnnotationBasedSpring() {
		System.out.print("Annotation hatte geklappt");
	}

}
