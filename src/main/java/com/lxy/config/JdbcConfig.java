package com.lxy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration//代替了xml配置文件
@PropertySource("classpath:META-INF/db.properties")//代替了<contenxt:property-placeholder/>
@ComponentScan(basePackages = "com.lxy")//代替了<contenxt:component-scan/>
public class JdbcConfig {

    @Value("${jdbc.driverClassName}")//代替了<property/>
    private String driverClassName;

    @Value("${jdbc.url}")
    private String url;

    @Value("${jdbc.username}")
    private String username;

    @Value("${jdbc.password}")
    private String password;

    @Value("${jdbc.maxActive}")
    private String maxActive;

    @Bean(name = "dataSource")//代替了<bean/>
    public DataSource getDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        dataSource.setMaxActive(Integer.valueOf(maxActive));
        return dataSource;
    }

}
