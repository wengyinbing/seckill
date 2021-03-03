package com.weng.seckill.common.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.GenericConversionService;
import org.springframework.web.bind.support.ConfigurableWebBindingInitializer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

import javax.annotation.PostConstruct;

@Configuration
public class FastJsonConfiguration {

    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;
    private final static Logger logger = LoggerFactory.getLogger(FastJsonConfiguration.class);
    @PostConstruct // @PostContruct是spring框架的注解，在方法上加该注解会在项目启动的时候执行该方法，也可以理解为在spring容器初始化的时候执行该方法。
    public void initEditableValidation() {
        logger.info("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        ConfigurableWebBindingInitializer initializer = (ConfigurableWebBindingInitializer) handlerAdapter.getWebBindingInitializer();
        if (initializer.getConversionService() != null) {
            GenericConversionService genericConversionService = (GenericConversionService) initializer.getConversionService();
            // 将自定义得字符串转日期实现类交给springboot 处理
            genericConversionService.addConverter(new StringToDateConverter());
        }
    }
}

