package se.wederbrand.beans;

public class BeanFromBeanFactory {
	public BeanFromBeanFactory() {
		System.out.println("BeanFromBeanFactory created");
	}

	public String hello() {
		return "hello " + toString() ;
	}
}
