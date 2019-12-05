package wu.ink.learn.ch4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import wu.ink.learn.ch4.aspect.MyAspect;

@SpringBootApplication(scanBasePackages = {"wu.ink.learn.ch4"})
public class Ch4App {

	@Bean(name = "myAspect")
	public MyAspect initMyAspect() {
		return new MyAspect();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch4App.class, args);
	}
}
