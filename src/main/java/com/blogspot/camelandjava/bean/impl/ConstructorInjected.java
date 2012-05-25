/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoSomething;
import com.google.inject.Inject;

/**
 *
 */
public class ConstructorInjected {

	private DoSomething operation;

	@Inject
	public ConstructorInjected(DoSomething operation) {
		this.operation = operation;
	}

	public String businessLogic() {
		return operation.doSomething();
	}

}
