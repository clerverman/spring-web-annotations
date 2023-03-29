package org.mql.biblio.dao;

import java.util.List;

import org.mql.biblio.models.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AuthorDaoMemory implements AuthorDao {
	
	@Autowired // checher tous les auteurs et les mettent en dans cette liste
	private List<Author> authors;
	
	public List<Author> selectAll() {
		return authors;
	}

}
