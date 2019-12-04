package wu.ink.learn.ch4;

import wu.ink.learn.ch4.intercept.MyInterceptor;
import wu.ink.learn.ch4.proxy.ProxyBean;
import wu.ink.learn.ch4.service.HelloService;
import wu.ink.learn.ch4.service.impl.HelloServiceImpl;

public class TestProxy {

	public static void main(String[] args) {
		HelloService helloService = new HelloServiceImpl();
		HelloService proxy = (HelloService) ProxyBean.getProxyBean(helloService, new MyInterceptor());
		proxy.sayHello("Ink");
		System.out.println("\n--------------- name is null ---------------");
		proxy.sayHello(null);
	}

}
