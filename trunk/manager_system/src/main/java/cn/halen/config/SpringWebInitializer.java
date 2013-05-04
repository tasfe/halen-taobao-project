package cn.halen.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.util.StringUtils;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * This class will be loaded by a servlet 3.0 container automatically.
 *
 * @see org.springframework.web.WebApplicationInitializer
 */
public class SpringWebInitializer implements WebApplicationInitializer {

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setServletContext(servletContext);
        context.register(MvcConfig.class);
        context.refresh();
        
        String dispatcherName = StringUtils.uncapitalize(DispatcherServlet.class.getSimpleName());
        Dynamic dynamic = servletContext.addServlet(dispatcherName, new DispatcherServlet(context));
        dynamic.setLoadOnStartup(1);
        dynamic.addMapping("/");
    }
}
