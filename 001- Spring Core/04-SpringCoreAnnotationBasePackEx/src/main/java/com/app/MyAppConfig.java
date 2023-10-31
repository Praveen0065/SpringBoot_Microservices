package com.app;

import org.springframework.context.annotation.ComponentScan;

  //  @ComponentScan({"com.app", "test.one","abc.xyz"}) //optional
  //   @ComponentScan("com.app")  //optional

@ComponentScan(basePackages = "com.app")
public class MyAppConfig {

}
