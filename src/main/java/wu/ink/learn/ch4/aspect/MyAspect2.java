package wu.ink.learn.ch4.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect2 {

	@Pointcut("execution(* wu.ink.learn.ch4.service.impl.UserServiceImpl.manyAspects(..))")
	public void manyAspects() {
		
	}
	
	@Before("manyAspects()")
	public void before() {
		System.out.println("MyAspect2 before ...");
	}
	
	@After("manyAspects()")
	public void after() {
		System.out.println("MyAspect2 after ...");
	}
	
//	@After("manyAspects()")
	@AfterReturning("manyAspects()")
	public void afterReturning() {
		System.out.println("MyAspect2 afterReturning ...");
	}
}
