package com.ems.emssystem.dao;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

@Configuration
public class DataConfig {

    private static String propsFile = "..\\emssystem\\src\\main\\resources\\application.properties";
    private String DB_USER = null;
    private String DB_USER_PW = null;
    private String DB_Conn_URL = null;

    Properties props = new Properties();

    private void setProperties(){
        try {
            FileReader fr = new FileReader(propsFile);
            props.load(fr);
        }catch(IOException io){
            io.printStackTrace();
        }
        DB_USER = props.getProperty("spring.datasource.username");
        DB_USER_PW = props.getProperty("spring.datasource.password");
        DB_Conn_URL = props.getProperty("spring.datasource.url");
    }

    @Bean
    public DataSource getDataSource() {
        setProperties();

        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        // Make better way to read Connection URL (e.g. scan environment variable)
        dataSourceBuilder.url(DB_Conn_URL);
        dataSourceBuilder.username(DB_USER);
        dataSourceBuilder.password(DB_USER_PW);
        return dataSourceBuilder.build();
    }

}
