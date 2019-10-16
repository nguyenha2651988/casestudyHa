package com.codegym;


import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
//@EnableJpaRepositories("com.codegym.repository")
//@EntityScan("com.codegym.model")
public class SpringBootWebApplication extends SpringBootServletInitializer {
//
//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(SpringBootWebApplication.class);
//    }
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class);
    }


//    @Bean
//    public NewsService newsService(){
//        return new NewsServiceImpl();
//    }

//    private ApplicationContext applicationContext;
//
//    @Override
//    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
//        this.applicationContext = applicationContext;
//    }
//
//
    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
//        templateResolver.setApplicationContext(applicationContext);
        templateResolver.setPrefix("/WEB-INF/view");
        templateResolver.setSuffix(".html");
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCharacterEncoding("UTF-8");
        return templateResolver;
    }
//
//
//    @Bean
//    public TemplateEngine templateEngine() {
//        TemplateEngine templateEngine = new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver() {
//        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
//        viewResolver.setTemplateEngine((ISpringTemplateEngine) templateEngine());
//        viewResolver.setCharacterEncoding("UTF-8");
//        return viewResolver;
//    }

}