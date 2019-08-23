package org.test;

import org.test.repository.PersonaRepository;

public class Main {

	public static void main(String[] args) {
		PersonaRepository persist = new PersonaRepository();
		persist.lista().forEach((p) -> {

			System.out.println(p);

		});
	}
}
