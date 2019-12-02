package wu.ink.learn.ch3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ComponentScan(basePackages = {"wu.ink.learn.ch3"})
//@PropertySource(value= {"classpath:jdbc.properties"}, ignoreResourceNotFound = true)
public class Chapter3Main {
	public static void main(String[] args) {
		SpringApplication.run(Chapter3Main.class, args);
	}
}
