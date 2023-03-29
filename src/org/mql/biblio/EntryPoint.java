package org.mql.biblio;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.mql.biblio.config.SpringConfig;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class EntryPoint implements WebApplicationInitializer {
	/*
	 * sera d�marrer automatique
	 */
	public EntryPoint() {
		System.out.println(">> new EntryPoint()");
	}

	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println(">> onStartUp()");
		// 1. Chargement du contexte de spring
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringConfig.class);
		// 2. Cr�ation et configuration du controlleur Spring
		// � noter que Dynamic =new javax.servlet.ServletRegistration.Dynamic();
		Dynamic controller =  servletContext.addServlet("controller", new DispatcherServlet(context));
		controller.addMapping("/biblio/*");
	}

}
