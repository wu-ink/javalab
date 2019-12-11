package wu.ink.learn.ch5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"wu.ink.learn.ch5"})
@EnableJpaRepositories(basePackages = "wu.ink.learn.ch5.dao")
@EntityScan(basePackages = "wu.ink.learn.ch5.pojo")
public class RunCh5 {

	public static void main(String[] args) {
		SpringApplication.run(RunCh5.class, args);
	}

}
