package com.weng.seckill.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.core.convert.converter.Converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter implements Converter<String, Date> {

    private static final String dateFormat = "yyyy-MM-dd HH:mm:ss";
    private static final String shortDateFormat = "yyyy-MM-dd";
    private static final String dateTimeFormat = "HH:mm:ss";
    @Override
    @Bean
    public Date convert(String source) {
        /*if (StrUtil.isBlank(source) || StrUtil.equalsIgnoreCase("undefined", source) || StrUtil.equalsIgnoreCase("null", source)) {
            return null;
        }*/
        source = source.trim();
        try {
            SimpleDateFormat formatter;
            if (source.contains("-")) {
                if (source.contains(":")) {
                    formatter = new SimpleDateFormat(dateFormat);
                } else {
                    formatter = new SimpleDateFormat(shortDateFormat);
                }
                Date dtDate = formatter.parse(source);
                return dtDate;
            } else if(source.contains(":")){
                formatter = new SimpleDateFormat(dateTimeFormat);
                Date dtDate = formatter.parse(source);
                return dtDate;
            }
        } catch (Exception e) {
            throw new RuntimeException(String.format("parser %s to Date fail", source));
        }

        throw new RuntimeException(String.format("parser %s to Date fail", source));
    }

}