/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoSomething;

/**
 *
 */
public class MyFirstBean implements DoSomething {

	/* (non-Javadoc)
	 * @see com.blogspot.camelandjava.bean.DoSomething#doSomething()
	 */
	public String doSomething() {
		return "Hi, I am " + MyFirstBean.class;
	}

}
