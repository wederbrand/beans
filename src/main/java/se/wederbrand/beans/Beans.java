package se.wederbrand.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * just testing stuff
 */
public class Beans {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		OtherBeanFromBeanFactory bean = context.getBean(OtherBeanFromBeanFactory.class);
		System.out.println(bean.toString());
		System.out.println(bean.toString());
	}
}
