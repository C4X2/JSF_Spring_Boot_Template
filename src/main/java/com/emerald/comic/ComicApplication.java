package com.emerald.comic;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.context.ServletContextAware;

import com.sun.faces.config.FacesInitializer;

/**
 * 
 * @author C4X2
 * @version 1.0
 */
@SpringBootApplication
public class ComicApplication extends FacesInitializer implements ServletContextAware
{
	// Different PrimeFaces Themes
	private static final String BOOTSTRAP = "bootstrap";

	public static void main(String[] args)
	{
		SpringApplication.run(ComicApplication.class, args);
	}
	
	@SuppressWarnings(value = { "rawtypes", "unchecked" })
	@Bean
	public ServletRegistrationBean servletRegistrationBean()
	{
		FacesServlet servlet = new FacesServlet();
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(servlet, "*.jsf", "*.faces",
				"*.xhmtl");
		return servletRegistrationBean;
	}

	@Override
	public void setServletContext(ServletContext servletContext)
	{
		servletContext.setAttribute("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
		
		// Set attributes to run PrimeFaces properly
		servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", Boolean.TRUE.toString());
		servletContext.setInitParameter("primefaces.THEME", BOOTSTRAP);
		servletContext.setInitParameter("primefaces.UPLOADER", "commons");
	}

}
