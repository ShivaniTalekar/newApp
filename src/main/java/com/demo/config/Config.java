package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class Config {

@Bean
public DriverManagerDataSource getDataSource() {

    DriverManagerDataSource bds = new DriverManagerDataSource();
    bds.setDriverClassName("org.postgresql.Driver");
    bds.setUrl("jdbc:mysql://localhost:5432/Welcome");
    bds.setUsername("postgres");
    bds.setPassword("$Shlok3105");

    return bds;
}
}