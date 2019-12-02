package wu.ink.learn.ch3.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class House {
//	@Value("${house.name}")
	private String name;
	
	public void setName(String name) {
		System.out.println("setName -> " + name);
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
