package jaivir.sample.guice.lists;

import java.util.*;

/**
 * This class holds the data to be operated upon and a list of operations
 * that need to be performed on the data
 * @author j.singh
 *
 */
public class InstructionSet {
	
	private String journalName ;
	private ArrayList<String> operationsList = new ArrayList<String>();
	
	
	
	public ArrayList<String> getOperationsList(){
		return operationsList;
	}
	
	public void setOperationsList (ArrayList<String> operationsList){
		this.operationsList = operationsList;
	}
	
	public void addOperationToOperationsList (String op){
		this.operationsList.add(op);
	}
	
	
	public String getJournalName (){
		return journalName;
	}
	
	public void setJournalName (String journalName){
		this.journalName = journalName;
	}
	
}