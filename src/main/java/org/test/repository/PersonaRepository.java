package org.test.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.test.entity.Persona;

public class PersonaRepository {

	private static EntityManager manager;
	private static EntityManagerFactory emFactory;

	public List<Persona> lista() {
		emFactory = Persistence.createEntityManagerFactory("aplicacion");
		manager = emFactory.createEntityManager();
		return manager.createQuery("FROM Persona").getResultList();
	}
}
