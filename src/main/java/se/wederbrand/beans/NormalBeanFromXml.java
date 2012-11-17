package se.wederbrand.beans;

import org.springframework.beans.factory.annotation.Autowired;
import se.wederbrand.beans.BeanFromBeanFactory;

public class NormalBeanFromXml {
	@Autowired
	BeanFromBeanFactory bean;

	public NormalBeanFromXml() {
		System.out.println("NormalBeanFromXml");
	}
}
