/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoEvenMore;
import com.google.inject.Inject;

/**
 *
 */
public class MethodInjected {

	private DoEvenMore operation;

	@Inject
	public void setOperation(DoEvenMore operation) {
		this.operation = operation;
	}

	public String businessLogic() {
		return operation.doEvenMore();
	}
}
