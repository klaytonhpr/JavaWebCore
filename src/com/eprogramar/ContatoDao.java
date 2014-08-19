package com.eprogramar;

import java.util.ArrayList;
import java.util.List;

public class ContatoDao {

	public List<Contato> getLista(){
	
		List<Contato> lista = new ArrayList<Contato>();
		lista.add(new Contato("Klayton", "eu1@eu.com", "(11)98745-9050", "Rua Antonieta"));
		lista.add(new Contato("Katiane", "eu2@eu.com", "(11)98745-9051", "Rua Antonieta 2"));
		lista.add(new Contato("Kleber", "eu3@eu.com", "(11)98745-9052", "Rua Antonieta 3"));
		lista.add(new Contato("Cristiane", "eu4@eu.com", "(11)98575-3549", "Rua Antonieta 4"));
		
		return lista;
	}

}
