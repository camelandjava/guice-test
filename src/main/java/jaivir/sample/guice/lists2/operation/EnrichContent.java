package jaivir.sample.guice.lists2.operation;

import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * This class performs complex or multiple operations
 *
 * @author j.singh
 *
 */
public class EnrichContent implements Operation{
	
	private Logger log = Logger.getLogger(this.getClass());
	private ArrayList<Operation> operationsList;
	private String result;
	
	public EnrichContent(ArrayList<Operation> operationsList){
		this.operationsList = operationsList;
	}
	
	public String execute(String param){
		result = param ;
		Iterator<Operation> operationListItr = operationsList.iterator();
		
		while(operationListItr.hasNext()) {
			Operation op = operationListItr.next();
			result = op.execute(result);
			
		}
		
		return result;
	}
}
