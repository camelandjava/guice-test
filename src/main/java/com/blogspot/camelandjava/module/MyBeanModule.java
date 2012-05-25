/**
 *
 */
package com.blogspot.camelandjava.module;

import com.blogspot.camelandjava.bean.DoEvenMore;
import com.blogspot.camelandjava.bean.DoMore;
import com.blogspot.camelandjava.bean.DoSomething;
import com.blogspot.camelandjava.bean.impl.MyFirstBean;
import com.blogspot.camelandjava.bean.impl.MySecondBean;
import com.blogspot.camelandjava.bean.impl.MyThirdBean;
import com.google.inject.Binder;
import com.google.inject.Module;

/**
 *
 */
public class MyBeanModule implements Module {

	/* (non-Javadoc)
	 * @see com.google.inject.Module#configure(com.google.inject.Binder)
	 */
	public void configure(Binder binder) {
		binder.bind(DoSomething.class).to(MyFirstBean.class);
		binder.bind(DoMore.class).to(MySecondBean.class);
		binder.bind(DoEvenMore.class).to(MyThirdBean.class);
	}

}
