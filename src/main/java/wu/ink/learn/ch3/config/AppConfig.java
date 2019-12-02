package wu.ink.learn.ch3.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSourceFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

@Configuration
@ComponentScan(basePackages = {"wu.ink.learn.ch3"}, excludeFilters = {@Filter(classes = {Service.class})})
public class AppConfig {
	
	@Bean(name = "dataSource", destroyMethod = "close")
	@Conditional(DatabaseConditional.class)
	public DataSource getDataSource(
			@Value("${database.driverName}") String driver,
			@Value("${database.url}") String url,
			@Value("${database.username}") String username,
			@Value("${database.password}") String password) {
		System.out.println("--- getDataSource");
		Properties props = new Properties();
		props.setProperty("driver", driver);
		props.setProperty("url", url);
		props.setProperty("username", username);
		props.setProperty("password", password);
		DataSource dataSource = null;
		try {
			dataSource = BasicDataSourceFactory.createDataSource(props);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return dataSource;
	}
}
