package wu.ink.learn.ch4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import wu.ink.learn.ch4.aspect.MyAspect;
import wu.ink.learn.ch4.aspect.MyAspect1;
import wu.ink.learn.ch4.aspect.MyAspect2;
import wu.ink.learn.ch4.aspect.MyAspect3;

@SpringBootApplication(scanBasePackages = {"wu.ink.learn.ch4"})
public class Ch4App {

	@Bean(name = "myAspect")
	public MyAspect initMyAspect() {
		return new MyAspect();
	}
	
	@Bean(name = "myAspect2")
	public MyAspect2 initMyAspect2() {
		return new MyAspect2();
	}
	
	@Bean(name = "myAspect1")
	public MyAspect1 initMyAspect1() {
		return new MyAspect1();
	}
	
	@Bean(name = "myAspect3")
	public MyAspect3 initMyAspect3() {
		return new MyAspect3();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Ch4App.class, args);
	}
}
