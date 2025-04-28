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
@EnableJpaRepositories(basePackages = {"com.sentinel.smarter.modules.simpatik.repositories"},
        entityManagerFactoryRef = "simpatikEntityManager",
        transactionManagerRef = "simpatikTransactionManager")

public class SimpatikConfig {
    @Autowired
    private Environment env;
    @Bean
    public LocalContainerEntityManagerFactoryBean simpatikEntityManager() {
        LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(simpatikDatasource());
        em.setPackagesToScan(new String[]{"com.sentinel.smarter.modules.simpatik.models"});
        em.setPersistenceUnitName("simpatikEntityManager");
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
    public DataSource simpatikDatasource() {
        DriverManagerDataSource dataSource  = new DriverManagerDataSource();
        dataSource.setDriverClassName(env.getProperty("jdbc.driver-class-name"));
        dataSource.setUrl(env.getProperty("simpatik.datasource.url"));
        dataSource.setUsername(env.getProperty("simpatik.datasource.username"));
        dataSource.setPassword(env.getProperty("simpatik.datasource.password"));
        return dataSource;
    }

    @Bean
    public PlatformTransactionManager simpatikTransactionManager() {

        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
        		simpatikEntityManager().getObject());
        return transactionManager;
    }
}
