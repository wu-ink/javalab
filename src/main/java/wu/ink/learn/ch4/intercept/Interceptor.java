package wu.ink.learn.ch4.intercept;

import java.lang.reflect.InvocationTargetException;

import wu.ink.learn.ch4.invoke.Invocation;

public interface Interceptor {
	public boolean before();
	
	public void after();
	
	public Object around(Invocation invocation) throws InvocationTargetException, IllegalAccessException;
	
	public void afterReturning();
	
	public void afterThrowing();
	
	boolean useAround();
}
