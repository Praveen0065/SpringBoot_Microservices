package com.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan(basePackages = "com.app")
@PropertySource("classpath:myapp.properties")
public class MyAppConfig {

}
