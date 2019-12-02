package wu.ink.learn.ch3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import wu.ink.learn.ch3.config.AppConfig;
import wu.ink.learn.ch3.pojo.ScopeBean;

public class TestScopeBean {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ScopeBean sb1 = ctx.getBean(ScopeBean.class);
		ScopeBean sb2 = ctx.getBean(ScopeBean.class);
		System.out.println(sb1 == sb2);
		ctx.close();
	}

}
