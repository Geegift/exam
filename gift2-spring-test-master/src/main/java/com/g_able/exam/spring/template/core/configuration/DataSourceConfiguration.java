package com.g_able.exam.spring.template.core.configuration;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ConfigurationProperties("db")
public class DataSourceConfiguration {
	@NotNull
	private String type;
	@NotNull
	private String username;
	@NotNull
	private String password;
	@NotNull
	private String url;
	@NotNull
	private String driver;

	public void setType(String type) {
		this.type = type;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Bean
	DataSource dataSource() throws SQLException {
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(this.driver);
		dataSource.setUsername(this.username);
		dataSource.setPassword(this.password);
		dataSource.setUrl(this.url);
		return dataSource;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate() throws SQLException{
		return new JdbcTemplate(dataSource());
	}
}