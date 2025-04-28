package com.sentinel.smarter.configuration;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = {"com.sentinel.smarter.modules.smartproc.repositories"},
        entityManagerFactoryRef = "smartprocEntityManager",
        transactionManagerRef = "smartprocTransactionManager")

public class SmartProcConfig {
    @Autowired
    private Environment env;
    @Bean
    public LocalContainerEntityManagerFactoryBean smartprocEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(smartprocDatasource());
        em.setPackagesToScan(new String[]{"com.sentinel.smarter.modules.smartproc.models"});
        em.setPersistenceUnitName("smartprocEntityManager");
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        HashMap<String, Object> properties = new HashMap<>();
        properties.put("hibernate.dialect",
                env.getProperty("hibernate.dialect"));
        properties.put("hibernate.show-sql",
                env.getProperty("jdbc.show-sql"));
        em.setJpaPropertyMap(properties);
        return em;
    }

    @Bean
    public DataSource smartprocDatasource() {

        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driver-class-name"));
        dataSource.setUrl(env.getProperty("smartproc.datasource.url"));
        dataSource.setUsername(env.getProperty("smartproc.datasource.username"));
        dataSource.setPassword(env.getProperty("smartproc.datasource.password"));

        return dataSource;
    }

    @Bean
    public PlatformTransactionManager smartprocTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
        		smartprocEntityManager().getObject());
        return transactionManager;
    }
}
