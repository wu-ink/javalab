package wu.ink;

import java.security.Provider.Service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;

@SpringBootApplication
public class ApiboxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiboxApplication.class, args);
	}

}
