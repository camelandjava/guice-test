/**
 *
 */
package com.blogspot.camelandjava;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.blogspot.camelandjava.bean.impl.ConstructorInjected;
import com.blogspot.camelandjava.bean.impl.FieldInjected;
import com.blogspot.camelandjava.bean.impl.MethodInjected;
import com.blogspot.camelandjava.module.MyBeanModule;
import com.blogspot.camelandjava.pojo.Pojo;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 *
 */
public class Main {

	private static Logger log = Logger.getLogger(Main.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Module> list = new ArrayList<Module>();
		list.add(new MyBeanModule());
		Injector injector = Guice.createInjector(list);

		ConstructorInjected ci = injector.getInstance(ConstructorInjected.class);
		log.info(ci.businessLogic());

		FieldInjected fi = injector.getInstance(FieldInjected.class);
		log.info(fi.businessLogic());

		MethodInjected mi = injector.getInstance(MethodInjected.class);
		log.info(mi.businessLogic());

		myInstanciationTest();
	}

	/**
	 *
	 */
	private static void myInstanciationTest() {
		try {
			Pojo myPojo = (Pojo) Class.forName("com.blogspot.camelandjava.pojo.impl.MyPojo").newInstance();
			log.info(myPojo.tellMe());
		} catch(Exception e) {
			log.error(e);
		}
	}

}
