package software.xdev;

import java.io.Serializable;

public class Person implements Serializable {

	private String name;
	private String age;
	private String city;

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public String getAge() {
		return this.age;
	}

	public void setAge(final String age) {
		this.age = age;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(final String city) {
		this.city = city;
	}

}
