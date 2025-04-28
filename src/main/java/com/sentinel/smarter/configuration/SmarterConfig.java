package com.sentinel.smarter.configuration;

import java.util.HashMap;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(basePackages = {"com.sentinel.smarter.repositories"},
        entityManagerFactoryRef = "smarterEntityManager",
        transactionManagerRef = "smarterTransactionManager")
public class SmarterConfig {
    @Autowired
    private Environment env;
    @Bean
    @Primary
    public LocalContainerEntityManagerFactoryBean smarterEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(smarterDatasource());
        em.setPackagesToScan(new String[]{"com.sentinel.smarter.models"});
        em.setPersistenceUnitName("smarterEntityManager");
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

    @Primary
    @Bean
    public DataSource smarterDatasource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driver-class-name"));
        dataSource.setUrl(env.getProperty("smarter.datasource.url"));
        dataSource.setUsername(env.getProperty("smarter.datasource.username"));
        dataSource.setPassword(env.getProperty("smarter.datasource.password"));

        return dataSource;
    }

    @Primary
    @Bean
    public PlatformTransactionManager smarterTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
        		smarterEntityManager().getObject());
        return transactionManager;
    }
}
