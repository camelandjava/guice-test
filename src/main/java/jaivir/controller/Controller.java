/**
 *
 */
package jaivir.controller;

import jaivir.Operation;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 *
 */
public class Controller {

	private Logger log = Logger.getLogger(Controller.class);

	private ArrayList<ArrayList<Operation>> operationLists;

	public void businessLogic() {
		String initial = "add here:";

		operationLists = new ArrayList<ArrayList<Operation>>();

		Iterator<ArrayList<Operation>> iterList = operationLists.iterator();
		while(iterList.hasNext()) {
			ArrayList<Operation> operList = iterList.next();
			Iterator<Operation> iterOperation = operList.iterator();

			while(iterOperation.hasNext()) {
				Operation op = iterOperation.next();
				initial = op.execute(initial);
			}

			log.info(initial);
		}

		log.info(initial);
	}
}
