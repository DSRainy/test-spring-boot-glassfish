/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th.co.geniustree.testspringboot.spring.boot.webapp.config;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author anonymous
 */
@Configuration
public class WebInitializer implements ServletContextInitializer {

    @Override
    public void onStartup(ServletContext sc) throws ServletException {
        sc.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", "true");
        sc.setInitParameter("javax.faces.PROJECT_STATE", "Development");
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        FacesServlet facesServlet= new FacesServlet();
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(facesServlet , "*.xhtml");
        servletRegistrationBean.setLoadOnStartup(1);
        return servletRegistrationBean;
    }

}
