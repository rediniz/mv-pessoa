package br.com.mv.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan({"br.com.mv.repository" , "br.com.mv.model"})
@EnableTransactionManagement
@EnableJpaRepositories("br.com.mv.repository")
public class DatabaseConfiguration {
	
	@Bean(destroyMethod = "close")
	public DataSource dataSource(DataSourceProperties dataSourceProperties) throws Exception {
		HikariConfig config = new HikariConfig();
		config.setDriverClassName(dataSourceProperties.getDriverClassName());
		config.setJdbcUrl(dataSourceProperties.getUrl());
		config.setUsername(dataSourceProperties.getUsername());
		config.setPassword(dataSourceProperties.getPassword());
		
		return new HikariDataSource(config);
	}


}
