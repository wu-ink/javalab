package wu.ink.learn.ch4.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

import wu.ink.learn.ch4.validator.UserValidator;
import wu.ink.learn.ch4.validator.impl.UserValidatorImpl;

@Aspect
public class MyAspect {
	@DeclareParents(value="wu.ink.learn.ch4.service.impl.UserServiceImpl+", defaultImpl = UserValidatorImpl.class)
	public UserValidator userValidator;
	
	@Pointcut("execution(* wu.ink.learn.ch4.service.impl.UserServiceImpl.printUser(..))")
	public void pointCut() {
		
	}
	
	@Before("pointCut()")
	public void before() {
		System.out.println("before ......");
	}
	
	@After("pointCut()")
	public void after() {
		System.out.println("after ......");
	}
	
	@AfterReturning("pointCut()")
	public void afterReturning() {
		System.out.println("afterReturning ......");
	}
	
	@AfterThrowing("pointCut()")
	public void afterThrowing() {
		System.out.println("afterThrowing ......");
	}
	
	@Around("pointCut()")
	public void around(ProceedingJoinPoint jp) throws Throwable {
		System.out.println("around before ......");
		
//		jp.proceed();
		
		System.out.println("around after ......");
	}
}
