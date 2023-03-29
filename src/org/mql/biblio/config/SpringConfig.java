package org.mql.biblio.config;

import org.mql.biblio.models.Author;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // on peut le fichier aussi dans EntryPoint
@ComponentScan({
	"org.mql.biblio"
}) // les packages à évaluer
public class SpringConfig {
	
	@Bean // pour le rendre comme un bean ; ici l'injection se fait par constructeurs
	public Author a1() { // le nom du méthode au nom du bean
		return new Author(101,"Rod Johnson",1970);
	}
	
	@Bean // pour le rendre comme un bean
	public Author a2() { // le nom du méthode au nom du bean
		return new Author(102,"James Gosling",1955); 
	}
	
	@Bean // pour le rendre comme un bean
	public Author a3() { // le nom du méthode au nom du bean
		return new Author(103,"Erich Gamma",1961);
	}
	
	@Bean // pour le rendre comme un bean
	public Author a4() { // le nom du méthode au nom du bean
		return new Author(104,"Erich Gamma test",1961);
	}
	
	@Bean
	public String title()
	{
		return "Gestion de bibliothèque";
	}
}
