package wu.ink.learn.ch3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import wu.ink.learn.ch3.pojo.House;

@RestController
@ComponentScan(basePackages = {"wu.ink.learn.ch3"})
@EnableAutoConfiguration
public class Chapter3Main2 {

	@Value("${demo.env}")
	private String env;
	
	@RequestMapping("index")
	public String test() {
		return "env=" + env;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Chapter3Main2.class, args);
	}
}
