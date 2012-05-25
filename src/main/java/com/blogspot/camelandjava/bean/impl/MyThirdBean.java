/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoEvenMore;

/**
 *
 */
public class MyThirdBean implements DoEvenMore {

	/* (non-Javadoc)
	 * @see com.blogspot.camelandjava.bean.DoEvenMore#doEvenMore()
	 */
	public String doEvenMore() {
		return MyThirdBean.class + " does EVEN more!";
	}

}
