package com.sampath.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by SAMPATH on 2/25/2016.
 */
@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter{
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver iRV = new InternalResourceViewResolver();
        iRV.setPrefix("/");
        iRV.setSuffix(".jsp");
        return iRV;
    }

    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer dsh){
        dsh.enable();
    }

}
