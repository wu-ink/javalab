package wu.ink.learn.ch3;

import org.jboss.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import wu.ink.learn.ch3.config.AppConfig;
import wu.ink.learn.ch3.pojo.BusinessPerson;
import wu.ink.learn.ch3.pojo.User;
import wu.ink.learn.ch3.pojo.definition.Person;

public class IoCTest {
	private static Logger log = Logger.getLogger(IoCTest.class);
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = ctx.getBean(User.class);
		log.info(user.getNote());
		
		Person person = ctx.getBean(BusinessPerson.class);
		person.service();
		
		ctx.close();
	}

}
