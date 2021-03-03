package com.weng.seckill.common.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyAdapter extends WebMvcConfigurerAdapter {
    private final static Logger logger = LoggerFactory.getLogger(MyAdapter.class);
    @Override
    public void addViewControllers( ViewControllerRegistry registry ) {
        logger.info("forword index html!!!!!!!!!!!!!!!!!!!!!!!!!");
        registry.addViewController( "/" ).setViewName( "forward:/index.html" );
        registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
        super.addViewControllers( registry );
    }
}
