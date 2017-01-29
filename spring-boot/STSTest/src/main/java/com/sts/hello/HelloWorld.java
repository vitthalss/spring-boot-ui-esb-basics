package com.sts.hello;

/**
 * Hello world!
 *
 */
public class HelloWorld {

  /**
	*
	*/
	private String name;

	/**
	 * @param  name
	 */
	public final void setName(final String name) {
		this.name = name;
	}
	/**
	 *
	 */
	public final void printHello() {
		System.out.println("Hello ! " + name);
	}
}
