/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoMore;

/**
 *
 */
public class MySecondBean implements DoMore {

	/* (non-Javadoc)
	 * @see com.blogspot.camelandjava.bean.DoMore#doMore()
	 */
	public String doMore() {
		return MySecondBean.class + " does MORE...";
	}

}
