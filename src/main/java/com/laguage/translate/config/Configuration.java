package com.laguage.translate.config;


import org.springframework.beans.factory.annotation.Value;

@org.springframework.context.annotation.Configuration
public class Configuration {


    @Value("${spring.languageForTranslator}")
    public String languageForTranslation;

    @Value("${spring.laguageForPolly}")
    public String languageForPolly;
}
