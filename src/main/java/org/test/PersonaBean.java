package org.test;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.test.entity.Persona;
import org.test.repository.PersonaRepository;

@ManagedBean(name = "persona")
@SessionScoped
public class PersonaBean {

	private PersonaRepository persist = new PersonaRepository();
	private List<Persona> lista = new ArrayList<Persona>();

	public PersonaBean() {

	}

	public void llenar() {
		lista = persist.lista();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

}
