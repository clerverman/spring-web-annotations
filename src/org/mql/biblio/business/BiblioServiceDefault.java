package org.mql.biblio.business;

import java.util.List;

import org.mql.biblio.dao.AuthorDao;
import org.mql.biblio.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BiblioServiceDefault implements BiblioService{
	
	//@Autowired
	private AuthorDao authorDao ; 
	
	@Autowired
	private String title; // le title est reconnu dans le contexte , on peut 
	
	public BiblioServiceDefault(/*@Qualifier('')*/ AuthorDao authorDao) { // on peut faire le wiring via le construteur et on suprime @Autowired
		this.authorDao = authorDao;
	}
	@Override
	public List<Author> authors() {
		System.out.println(">> "+title);
		return authorDao.selectAll();
	}

	
}
