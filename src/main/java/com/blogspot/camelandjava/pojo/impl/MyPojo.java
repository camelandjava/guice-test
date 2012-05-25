/**
 *
 */
package com.blogspot.camelandjava.pojo.impl;

import com.blogspot.camelandjava.pojo.Pojo;

/**
 *
 */
public class MyPojo implements Pojo {

	private final String myProperty = "Hi there!";

	public String tellMe() {
		return myProperty;
	}
}
