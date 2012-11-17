package se.wederbrand.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import se.wederbrand.beans.BeanFromBeanFactory;

@Configuration
public class MyBeanFactory {
	public MyBeanFactory() {
		System.out.println("factory alive");
	}

	@Bean
	OtherBeanFromBeanFactory getOtherBeanFromBeanFactory() {
		return new OtherBeanFromBeanFactory(new Object() {
			@Override
			public String toString() {
				BeanFromBeanFactory beanFromBeanFactory = getBeanFromBeanFactory();
				return beanFromBeanFactory.hello();
			}
		});
	}

	@Bean
	BeanFromBeanFactory getBeanFromBeanFactory() {
		BeanFromBeanFactory beanFromBeanFactory = new BeanFromBeanFactory();
		System.out.println(beanFromBeanFactory.hello());
		return beanFromBeanFactory;
	}
}
