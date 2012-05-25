/**
 *
 */
package com.blogspot.camelandjava.bean.impl;

import com.blogspot.camelandjava.bean.DoMore;
import com.google.inject.Inject;

/**
 *
 */
public class FieldInjected {

	@Inject
	private DoMore operation;

	public String businessLogic() {
		return operation.doMore();
	}
}
