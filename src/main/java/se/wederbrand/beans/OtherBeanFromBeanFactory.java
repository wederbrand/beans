package se.wederbrand.beans;

public class OtherBeanFromBeanFactory {
	private final Object object;

	public OtherBeanFromBeanFactory(Object object) {
		this.object = object;
		System.out.println("OtherBeanFromBeanFactory");
	}

	@Override
	public String toString() {
		return object.toString();
	}
}
