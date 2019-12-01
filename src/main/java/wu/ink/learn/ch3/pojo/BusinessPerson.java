package wu.ink.learn.ch3.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import wu.ink.learn.ch3.pojo.definition.Animal;
import wu.ink.learn.ch3.pojo.definition.Person;

@Component
public class BusinessPerson implements Person {
	
	private Animal animal;

	@Override
	public void service() {
		this.animal.use();
	}

	@Override
	@Autowired @Qualifier("dog")
	public void seAnimal(Animal animal) {
		System.out.println("延迟依赖注入");
		this.animal = animal;
	}

}
