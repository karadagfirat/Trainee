package com.firat.exampleapp;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExampleappApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleappApplication.class, args);
    }

    @Bean // uygulama contextine dahil ediyoruz. bu nesneden bir tane oluşturup sprigin IOC containerine dahil ediyoruz. bu instance üzerinde herkes çalışabilir.
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }
}
